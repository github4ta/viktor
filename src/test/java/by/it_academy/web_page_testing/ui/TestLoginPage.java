package by.it_academy.web_page_testing.ui;

import by.it_academy.web_page_testing.ui.pages.LoginPage;
import by.it_academy.web_page_testing.ui.steps.LoginStep;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest{
    @Test
    public void testInvalidEmail(){
        LoginStep loginStep = new LoginStep();
        LoginPage loginPage = new LoginPage();
        loginStep.actionWithInvalidEmail();

        Assert.assertEquals(loginPage.THIS_EMAIL_IS_INVALID, loginStep.getTextThisEmailIsInvalid());
    }

    @Test
    public void testCorrectEmailAndIncorrectPassword(){
        LoginStep loginStep = new LoginStep();
        LoginPage loginPage = new LoginPage();
        loginStep.actionWithCorrectEmailAndIncorrectPassword();

        Assert.assertEquals(loginPage.INCORRECT_PASSWORD_FOR_THIS_EMAIL, loginStep.getTextIncorrectPasswordForThisEmail());
    }

    @Test
    public void testEmptyEmailAndEmptyPassword(){
        LoginStep loginStep = new LoginStep();
        LoginPage loginPage = new LoginPage();
        loginStep.actionWithEmptyEmailAndEmptyPassword();

        Assert.assertEquals(loginPage.EMAIL_REQUIRED, loginPage.getTextEmailRequired());
        Assert.assertEquals(loginPage.PASSWORD_REQUIRED, loginPage.getTextPasswordRequired());
    }

    @Test
    public void testIncorrectEmailAndCorrectPassword(){
        LoginStep loginStep = new LoginStep();
        LoginPage loginPage = new LoginPage();
        loginStep.actionWithIncorrectEmailAndCorrectPassword();

        Assert.assertEquals(loginPage.NO_ACCOUNT_FOR_THIS_MAIL, loginPage.getTextNoAccountForThisEmail());
    }

    @Test
    public void testEnteredEmailAndEmptyPassword(){
        LoginStep loginStep = new LoginStep();
        LoginPage loginPage = new LoginPage();
        loginStep.actionWithEnteredEmailAndEmptyPassword();

        Assert.assertEquals(loginPage.PASSWORD_REQUIRED, loginPage.getTextPasswordRequired());
    }

    @Test
    public void testEmptyEmailAndEnteredPassword(){
        LoginStep loginStep = new LoginStep();
        LoginPage loginPage = new LoginPage();
        loginStep.actionWithEmptyEmailAndEnteredPassword();

        Assert.assertEquals(loginPage.EMAIL_REQUIRED, loginPage.getTextEmailRequired());
    }

    @Test
    public void testInvalidPassword(){
        LoginStep loginStep = new LoginStep();
        LoginPage loginPage = new LoginPage();
        loginStep.actionWithInvalidPassword();

        Assert.assertEquals(loginPage.PASSWORD_MUST_BE_8_CHARACTERS_OR_LONGER, loginPage.getTextInvalidPassword());
    }
}

