package com.git.search;

import com.git.results.SearchResults;
import com.git.search.dto.request.SearchRequesDto;
import com.git.search.dto.response.SearchResultsResponseDto;
import com.git.search.restRequest.SearchRepositoryRequest;


public class Search {
    public static void usingOptions(String q) {
        SearchResultsResponseDto searchResponse = SearchRepositoryRequest
                .getSearchResults(new SearchRequesDto()
                        .withSearchName(q)
                        .withSortBy("stars")
                        .withOrderBy("desc")
                        .withPagesCount(1)
                        .withResultsPerPage(1)
                        .convertToMap());

        SearchResults.printSearchResult(searchResponse.getItems().get(0).getDefaultBranch());
    }
}