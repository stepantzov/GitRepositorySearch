package com.git.searchRepository.request;

import com.git.requestSpecification.RestRequest;
import com.git.searchRepository.dto.responseDto.SearchResultsResponseDto;
import com.git.utils.Properties;

import java.util.Map;

import static io.restassured.RestAssured.basePath;

public class SearchRepositoryRequest {
    private static final String searchPath = "/search/repositories";

    public static SearchResultsResponseDto getSearchResults(Map searchParameters) {
        basePath = Properties.get("api.base.url").concat(searchPath);

        return RestRequest.getResponseWithParams(searchParameters, basePath)
                .as(SearchResultsResponseDto.class);
    }
}