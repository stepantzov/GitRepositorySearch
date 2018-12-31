package com.git.searchRepository;

import com.git.results.SearchResults;
import com.git.searchRepository.dto.request.SearchRepositoryRequesDto;
import com.git.searchRepository.dto.response.SearchResultsResponseDto;
import com.git.searchRepository.restRequest.SearchRepositoryRequest;

public class SearchRepository {
    public static SearchResultsResponseDto usingOptions(String q) {
        return SearchRepositoryRequest.getSearchResults(new SearchRepositoryRequesDto()
                .withSearchName(q)
                .withSortBy("stars")
                .withOrderBy("desc")
                .withPagesCount(1)
                .withResultsPerPage(2)
                .convertToMap());
    }

    public static void printTopResultsRepositoryName(SearchResultsResponseDto searchResultsResponseDto) {
        System.out.println(searchResultsResponseDto.getItems().get(0).getName());
    }

    public static String getTagsUrl(SearchResultsResponseDto searchResultsResponseDto) {
        return searchResultsResponseDto.getItems().get(0).getTagsUrl();
    }
}