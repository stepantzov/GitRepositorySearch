package com.git.searchTags.tagsList.restRequest;

import com.git.requestSpecification.RestRequest;
import com.git.searchTags.tagsList.responseDto.SearchTagResponseDto;

public class SearchTagRequest {
    public static SearchTagResponseDto[] getTagsList(String releasesUrl) {
        String url = releasesUrl.replace("{/sha}", "");

        return RestRequest.getResponseWithDirectUrl(url).as(SearchTagResponseDto[].class);
    }
}