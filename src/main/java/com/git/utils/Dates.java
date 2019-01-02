package com.git.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
    public static void CompareTwoDates(String latestTagStringDate, String userTagStringDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date latestTagDate = null;
        Date userTagDate = null;

        try {
            latestTagDate = dateFormat.parse(latestTagStringDate.replace("Z", ""));
            userTagDate = dateFormat.parse(userTagStringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (latestTagDate.after(userTagDate)) {
            System.out.println("Entered tag is older than current latest release tag. ");
        } else if (latestTagDate.equals(userTagDate)) {
            System.out.println("Entered tag is equals to current latest release tag. ");
        } else System.out.println("Entered tag is newer than current latest release tag. ");
    }
}