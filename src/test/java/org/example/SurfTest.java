package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SurfTest {
    public ChromeDriver driver;
        @Test
    public void SurfTest(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.livejournal.com/");
        driver.findElement( By.cssSelector("[href='https://www.livejournal.com/category/novye_lica/']")).click();
        driver.findElement( By.cssSelector("[href='https://www.livejournal.com/category/media_v_zhzh/']")).click();
        driver.findElement( By.cssSelector("[href='https://www.livejournal.com/category/zima-vmeste/']")).click();
        driver.findElement( By.cssSelector("[href='https://www.livejournal.com/category/korotko/']")).click();
    }
}
