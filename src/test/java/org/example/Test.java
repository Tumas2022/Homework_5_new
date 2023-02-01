package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
    public WebDriver driver;
    @org.testng.annotations.Test

    void test() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments( "--incognito" );
        options.addArguments( "start-maximized" );
        driver = new ChromeDriver( options );
        System.out.println(getDriver().getWindowHandle());
        String originalWindow = getDriver().getWindowHandle();
        getDriver().switchTo().newWindow(WindowType.WINDOW);
        getDriver().navigate().to("https://www.google.com/");
        getDriver().switchTo().window(originalWindow);
            for(String windowHandle: getDriver().getWindowHandles()){
                System.out.println(windowHandle);
            }
            getDriver().close();
        }
    public WebDriver getDriver() {
        return driver;
    }

}

