package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    public ChromeDriver driver;

    @Test
    public void LogInTest(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.livejournal.com/");
        driver.findElement( By.xpath("//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys("Ivan-test-81");
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/form[1]/div/div[2]/div/input")).sendKeys("3D*N#mP8@FyiET4");
        driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div/div[2]/form[1]/button")).click();
        String url = driver.getCurrentUrl();
        Assert.assertTrue( url.equals(  "https://www.livejournal.com/") );
    }
}