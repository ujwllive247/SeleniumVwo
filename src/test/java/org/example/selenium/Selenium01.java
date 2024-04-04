package org.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium01 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.quit();
    }
}
