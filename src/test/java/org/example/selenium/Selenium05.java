package org.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium05 {

    public static void main(String[] args) {

        /*
         * 1. headless
         * 2. start max
         * 3. window
         * 4. add exnetions
         * 5. 100 of another options - you can use with it
         *
         * */


//        EdgeOptions edgeOptions = new EdgeOptions();
//        edgeOptions.addArguments("--start-maximized"); // Using Option class , Done by specific browser

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();  // Other way to maximize the window. Done by driver

        driver.get("http:/google.com");
        driver.getTitle();
        driver.getCurrentUrl();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }






}
