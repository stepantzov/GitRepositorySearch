package com.git.inputReader;

import com.git.searchTag.SearchTag;
import com.git.searchRepository.SearchRepository;
import com.git.searchRepository.dto.response.SearchResultsResponseDto;
import com.git.searchTag.dto.response.SearchTagResponseDto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static void readInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Git repoitory searchRepository.");
        System.out.println("Please enter repository name below and hit Enter:");
        try {
            String repositoryName = br.readLine();
            System.out.println("Please enter release tag in below and hit Enter:");
            String releaseTag = br.readLine();

            SearchResultsResponseDto searchResultsResponseDto = SearchRepository.usingOptions(repositoryName);
            SearchRepository.printTopResultsRepositoryName(searchResultsResponseDto);
            String releasesUrl = SearchRepository.getTagsUrl(searchResultsResponseDto);
            SearchTagResponseDto[] latestTag = SearchTag.usingRepositoryName(releasesUrl);
            SearchTag.printTopTagName(latestTag);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}