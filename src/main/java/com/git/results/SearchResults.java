package com.git.results;

import com.git.searchRepository.dto.response.SearchResultsResponseDto;

public class SearchResults {
    public static void printSearchResult(SearchResultsResponseDto dto) {
        System.out.println(dto.getItems().get(0).getName());
    }
}