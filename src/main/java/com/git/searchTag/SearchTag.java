package com.git.searchTag;

import com.git.searchTag.dto.response.SearchTagResponseDto;
import com.git.searchTag.restRequest.SearchTagRequest;

public class SearchTag {
    public static SearchTagResponseDto[] usingRepositoryName(String releasesUrl) {
        return SearchTagRequest.getTagResults(releasesUrl);
    }

    public static void printTopTagName(SearchTagResponseDto[] latestTag) {
        System.out.println(latestTag[0].getName());
    }
}