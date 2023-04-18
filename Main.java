package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/users/raviraj/Downloads/chromedriver_mac_arm64");
        System.out.println("Hello world!");
        WebDriver driver = new ChromeDriver();
        // navigating to google.com
        driver.get("https://google.com");
        driver.manage().window().maximize();

        // searching selenium in google
        WebElement box = driver.findElement(By.className("gLFyf"));
        box.sendKeys("Selenium");
        box.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement link = driver.findElement(By.partialLinkText("wikipedia"));
        link.sendKeys(Keys.COMMAND, Keys.ENTER);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
    }
}