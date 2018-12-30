package com.git.inputReader;

import com.git.search.Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static void readInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Git repoitory search.");
        System.out.println("Please enter repository name below and hit Enter:");
        try {
            String repositoryName = br.readLine();
            System.out.println("Please enter release tag in below and hit Enter:");
            String releaseTag = br.readLine();

            Search.usingOptions(repositoryName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}