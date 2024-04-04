package org.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium03 {

    @Test

    public void testMethod(){

        // Extension to the Edge Browser
        // YouTube video -. Ad blocker Extension
        // Selenium ?

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");  // Headless mode is used to automate testcase without UI.
//        edgeOptions.addExtensions(new File("/Users/pramod/Downloads/AdBlock1.crx"));
        WebDriver driver  = new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
}}
