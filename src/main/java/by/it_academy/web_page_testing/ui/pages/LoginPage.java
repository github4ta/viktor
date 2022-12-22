package by.it_academy.web_page_testing.ui.pages;

import by.it_academy.web_page_testing.ui.domain.User;
import by.it_academy.web_page_testing.ui.driver.DriverSingleton;
import by.it_academy.web_page_testing.ui.util.GeneratingPasswordRandomWay;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public final String THIS_EMAIL_IS_INVALID = "This email is invalid!";
    public final String INCORRECT_PASSWORD_FOR_THIS_EMAIL = "Incorrect password for this email.";
    public final String EMAIL_REQUIRED = "Email required!";
    public final String PASSWORD_REQUIRED = "Password required!";
    public final String INVALID_PASSWORD = "356K";
    public final String INVALID_EMAIL = "viktor.marchuk0207@gmail";
    private final int VALID_NUMBERS_OF_CHARACTERS = 8;
    public final String INCORRECT_PASSWORD = GeneratingPasswordRandomWay.getPassword(VALID_NUMBERS_OF_CHARACTERS);

    public final String INCORRECT_EMAIL = "marchuk@tgl.by";
    public final String NO_ACCOUNT_FOR_THIS_MAIL = "No account for this email";
    public final String PASSWORD_MUST_BE_8_CHARACTERS_OR_LONGER = "Password must be 8 characters or longer!";

    @FindBy(xpath = "//p[@id='cu-login-form__error_password']/span[2]")
    private WebElement incorrectPasswordForThisEmail;
    @FindBy(xpath = "//div[@class='navigation__auth-button-group']/a")
    private WebElement buttonLogInOnStartPage;
    @FindBy(xpath = "//input[@id='login-email-input']")
    private WebElement fieldEnterEmail;
    @FindBy(xpath = "//input[@id='login-password-input']")
    private WebElement fieldEnterPassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonLogInOnLoginPage;
    @FindBy(xpath = "//p[@id='cu-login-form__error_email']/span[2]")
    private WebElement nameUnderFieldEmailThisEmailInvalid;
    @FindBy(xpath = "//p[@id='cu-login-form__error_password']/span[2]")
    private WebElement namePasswordRequired;
    @FindBy(xpath = "//p[@id='cu-login-form__error_email']/span[2]")
    private WebElement nameEmailRequired;
    @FindBy(xpath = "//div[@class='login-page-new__main-form-options']/a/span")
    private WebElement nameForgotPassword;
    @FindBy(xpath = "//app-root[@id='app-root']/cu-toast-lazy-wrapper[1]/cu-toast-new/div/div/p")
    private WebElement nameNoAccountForThisEmail;
    @FindBy(xpath = "//p[@id='cu-login-form__error_password']/span[2]")
    private WebElement nameInvalidPassword;

    public LoginPage(){
        driver = DriverSingleton.getDriver();
    }

    public void clickButtonLogInOnStartPage(){
        buttonLogInOnStartPage.click();
    }

    public void clickButtonLogInOnLoginPage(){
        buttonLogInOnLoginPage.click();
    }

    public void inputInvalidEmail(){
        fieldEnterEmail.sendKeys(INVALID_EMAIL);
    }

    public void inputIncorrectPassword(){
        fieldEnterPassword.sendKeys(INCORRECT_PASSWORD);
    }

    public void inputCorrectEmail(){
        fieldEnterEmail.sendKeys(User.CORRECT_EMAIL);
    }

    public void inputCorrectPassword(){
        fieldEnterPassword.sendKeys(User.CORRECT_PASSWORD);
    }

    public void inputIncorrectEmail(){
        fieldEnterEmail.sendKeys(INCORRECT_EMAIL);
    }

    public void inputInvalidPassword(){
        fieldEnterPassword.sendKeys(INVALID_PASSWORD);
    }

    public String getTextIncorrectPasswordForThisEmail(){
        return namePasswordRequired.getText();
    }

    public String getTextIncorrectEmailAndCorrectPassword(){
        return incorrectPasswordForThisEmail.getText();
    }

    public String getTextThisEmailIsInvalid(){
        return nameUnderFieldEmailThisEmailInvalid.getText();
    }

    public String getTextEmailRequired(){
        return nameEmailRequired.getText();
    }

    public String getTextPasswordRequired(){
        return namePasswordRequired.getText();
    }

    public String getTextNoAccountForThisEmail(){
        return nameNoAccountForThisEmail.getText();
    }

    public String getTextInvalidPassword(){
        return nameInvalidPassword.getText();
    }

}