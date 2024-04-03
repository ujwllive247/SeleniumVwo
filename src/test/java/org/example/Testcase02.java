package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testcase02 {

    @Test
    @Description("Verify the title of facebook.com")
    public void vwoLogin(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
