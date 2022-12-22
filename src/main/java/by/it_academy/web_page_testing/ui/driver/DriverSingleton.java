package by.it_academy.web_page_testing.ui.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverSingleton{
    private static WebDriver driver;
    private static final int WAIT_TIME = 6;

    private DriverSingleton(){
    }

    public static WebDriver getDriver(){
        if(driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIME));
        }
        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
