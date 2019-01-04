package com.git.searchTags.tagsList;

import com.git.searchTags.tagsList.responseDto.SearchTagResponseDto;
import com.git.searchTags.tagsList.request.SearchTagRequest;

public class SearchTagsList {
    public static SearchTagResponseDto[] usingDirectTagsUrl(String tagUrl) {
        return SearchTagRequest.getTagsList(tagUrl);
    }

    public static void printTopTagName(SearchTagResponseDto[] latestTag) {
        System.out.println("Latest tag name: " + latestTag[0].getName());
    }

    public static SearchTagResponseDto searchForTagByName(SearchTagResponseDto[] listOfTags, String releaseTag) {
        for (int i = 0; i <= listOfTags.length-1; i++) {
            if (listOfTags[i].getName().equalsIgnoreCase(releaseTag)) {
                return listOfTags[i];
            }
        }
        System.out.println("Can't find the tag entered. ");

        return null;
    }

    public static SearchTagResponseDto getLatestTag(SearchTagResponseDto[] listOfTags) {
        return listOfTags[0];
    }
}