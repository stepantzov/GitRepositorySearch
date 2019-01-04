package com.git.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DatesTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void compareTwoDatesLater() {
        Dates.CompareTwoDates("2017-04-02T15:53:34Z", "2016-04-02T15:53:34Z");
        Assert.assertEquals("Entered tag is older than current latest release tag. \n", outContent.toString());
    }

    @Test
    public void compareTwoDatesNewer() {
        Dates.CompareTwoDates("2016-04-02T15:53:34Z", "2018-04-02T15:53:34Z");
        Assert.assertEquals("Entered tag is newer than current latest release tag. \n", outContent.toString());
    }

    @Test
    public void compareTwoDatesEquals() {
        Dates.CompareTwoDates("2018-04-02T15:53:34Z", "2018-04-02T15:53:34Z");
        Assert.assertEquals("Entered tag is equals to current latest release tag. \n", outContent.toString());
    }
}