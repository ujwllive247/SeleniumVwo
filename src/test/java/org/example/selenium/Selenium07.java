package org.example.selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium07 {

    public static void main(String[] args) {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("http://myntra.com");
        driver.getTitle();
        driver.getCurrentUrl();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();


    }



}
