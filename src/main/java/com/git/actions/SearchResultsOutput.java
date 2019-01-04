package com.git.actions;

import com.git.searchRepository.SearchRepository;
import com.git.searchRepository.dto.responseDto.SearchResultsResponseDto;
import com.git.searchTags.singleTag.OpenSingleTag;
import com.git.searchTags.tagsList.SearchTagsList;
import com.git.searchTags.tagsList.responseDto.SearchTagResponseDto;
import com.git.utils.Dates;

public class SearchResultsOutput {
    static void performSearchWithEnteredParameters(String repositoryName, String releaseTag) {
        SearchResultsResponseDto searchResultsResponseDto = SearchRepository.usingOptions(repositoryName);
        SearchRepository.printTopResultsGitRepositoryDetails(searchResultsResponseDto);

        SearchTagResponseDto[] listOfTags = SearchTagsList.usingDirectTagsUrl(SearchRepository.getTagsUrl(searchResultsResponseDto));
        SearchTagResponseDto latestTagData = SearchTagsList.getLatestTag(listOfTags);
        SearchTagResponseDto userTagCompleteData = SearchTagsList.searchForTagByName(listOfTags, releaseTag);

        if (userTagCompleteData != null) {
            Dates.CompareTwoDates(OpenSingleTag.getTagDate(latestTagData), OpenSingleTag.getTagDate(userTagCompleteData));
        } else System.out.println("Please enter existing tag for current repository. ");

        SearchTagsList.printTopTagName(listOfTags);
    }
}