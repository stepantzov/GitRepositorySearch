package com.git.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static void readInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Git repository and release tags search.");
        System.out.println("Please enter repository name below and press Enter:");
        try {
            String repositoryName = br.readLine();
            System.out.println("Please enter full release tag name (for example: testng-6.9.5) below and press Enter:");
            String releaseTag = br.readLine();

            SearchResultsOutput.performSearchWithUserParameters(repositoryName, releaseTag);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}