package com.git.searchTag.restRequest;

import com.git.requests.RequestSpecification;
import com.git.searchTag.dto.response.SearchTagResponseDto;

public class SearchTagRequest {
    public static SearchTagResponseDto[] getTagResults(String releasesUrl) {
        String url = releasesUrl.replace("{/sha}", "");

        return RequestSpecification.getReleasesListWithUrl(url).as(SearchTagResponseDto[].class);
    }
}