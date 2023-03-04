package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        List<WebElement> elements = driver.findElements(By.xpath("//a"));
        System.out.println(elements.size());


//        for (WebElement elem : elements) {
//            String hrefValue = elem.getAttribute("href");
//            System.out.println(hrefValue);

//        }





    }
}
