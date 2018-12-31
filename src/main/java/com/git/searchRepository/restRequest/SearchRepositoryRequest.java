package com.git.searchRepository.restRequest;

import com.git.requests.RequestSpecification;
import com.git.searchRepository.dto.response.SearchResultsResponseDto;
import com.git.utils.Properties;

import java.util.Map;

import static io.restassured.RestAssured.basePath;

public class SearchRepositoryRequest {
    private static final String searchPath = "/search/repositories";

    public static SearchResultsResponseDto getSearchResults(Map searchParameters) {
        basePath = Properties.get("api.base.url").concat(searchPath);

        return RequestSpecification.getWithParams(searchParameters, basePath)
                .as(SearchResultsResponseDto.class);
    }
}