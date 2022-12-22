package by.it_academy.web_page_testing.ui;

import by.it_academy.web_page_testing.ui.driver.DriverSingleton;
import org.testng.annotations.AfterMethod;

public class BaseTest{

    @AfterMethod
    public void closePage(){
        DriverSingleton.closeDriver();
    }
}
