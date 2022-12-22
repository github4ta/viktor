package by.it_academy.web_page_testing.ui.pages;

import by.it_academy.web_page_testing.ui.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public  class BasePage{
    public WebDriver driver;
    public final String BASE_URL = "https://clickup.com/";

    public BasePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    public void openPage(String url){
        driver=DriverSingleton.getDriver();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
}
