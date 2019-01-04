package com.git.searchRepository;

import com.git.searchRepository.dto.requestDto.SearchRepositoryRequesDto;
import com.git.searchRepository.dto.responseDto.SearchResultsResponseDto;
import com.git.searchRepository.request.SearchRepositoryRequest;

import java.util.Map;

public class SearchRepository {
    public static SearchResultsResponseDto usingOptions(String q) {
        Map searchRepositoryRequestMap = new SearchRepositoryRequesDto()
                .withSearchName(q)
                .withSortBy("stars")
                .withOrderBy("desc")
                .withPagesCount(1)
                .withResultsPerPage(2)
                .convertToMap();

        return SearchRepositoryRequest.getSearchResults(searchRepositoryRequestMap);
    }

    public static void printTopResultsGitRepositoryDetails(SearchResultsResponseDto searchResultsResponseDto) {
        System.out.println("\nTop results repository  name: " + searchResultsResponseDto.getItems().get(0).getName());
        System.out.println("Top results repository stars count: " + searchResultsResponseDto.getItems().get(0).getStargazersCount());
    }

    public static String getTagsUrl(SearchResultsResponseDto searchResultsResponseDto) {
        return searchResultsResponseDto.getItems().get(0).getTagsUrl();
    }
}