package com.git.searchTags.singleTag;

import com.git.searchTags.tagsList.responseDto.SearchTagResponseDto;
import com.git.searchTags.singleTag.responseDto.TagInformationResponseDto;
import com.git.searchTags.singleTag.responseDto.restRequest.OpenTagInformationRequest;

public class OpenSingleTag {
    public static TagInformationResponseDto usingDirectTagUrl(String tagUrl) {
        return OpenTagInformationRequest.getTagInformation(tagUrl);
    }

    public static String getTagDate(SearchTagResponseDto latestTag) {
        TagInformationResponseDto tagInformation = OpenSingleTag.usingDirectTagUrl(latestTag.getCommit().getUrl());
        return tagInformation.getCommit().getAuthor().getDate();
    }
}