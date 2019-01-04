package com.git.utils;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertiesTest {

    @Test
    public void get() {
        String actualPropertyVal = Properties.get("api.base.url");

        Assert.assertEquals("https://api.github.com", actualPropertyVal);
    }
}