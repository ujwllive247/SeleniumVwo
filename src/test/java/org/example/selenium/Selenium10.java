package org.example.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium10 {

    @Test(groups = "Qa")
    @Description("Verify the Current url of app.vwo.com ")

    public void testVwoLogin(){

        WebDriver driver = new EdgeDriver();
        driver.get("http://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
    }
}
