package com.git.searchTags.singleTag.responseDto.restRequest;

import com.git.requestSpecification.RestRequest;
import com.git.searchTags.singleTag.responseDto.TagInformationResponseDto;

public class OpenTagInformationRequest {
    public static TagInformationResponseDto getTagInformation(String tagUrl) {

        return RestRequest.getResponseWithDirectUrl(tagUrl).as(TagInformationResponseDto.class);
    }
}