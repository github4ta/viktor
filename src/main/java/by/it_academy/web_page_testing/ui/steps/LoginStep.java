package by.it_academy.web_page_testing.ui.steps;

import by.it_academy.web_page_testing.ui.pages.LoginPage;

public class LoginStep extends LoginPage{
    public LoginStep(){
        super();
    }

    public void sameActionOnPage(){
        openPage(BASE_URL);
        clickButtonLogInOnStartPage();

    }

    public void actionWithInvalidEmail(){
        sameActionOnPage();
        inputInvalidEmail();
        getTextThisEmailIsInvalid();
        clickButtonLogInOnLoginPage();
    }

    public void actionWithCorrectEmailAndIncorrectPassword(){
        sameActionOnPage();
        inputCorrectEmail();
        inputIncorrectPassword();
        clickButtonLogInOnLoginPage();
        getTextIncorrectPasswordForThisEmail();
    }

    public void actionWithEmptyEmailAndEmptyPassword(){
        sameActionOnPage();
        clickButtonLogInOnLoginPage();
        getTextIncorrectEmailAndCorrectPassword();
    }

    public void actionWithIncorrectEmailAndCorrectPassword(){
        sameActionOnPage();
        inputIncorrectEmail();
        inputCorrectPassword();
        clickButtonLogInOnLoginPage();
    }

    public void actionWithEnteredEmailAndEmptyPassword(){
        sameActionOnPage();
        inputCorrectEmail();
        clickButtonLogInOnLoginPage();
        getTextPasswordRequired();

    }

    public void actionWithEmptyEmailAndEnteredPassword(){
        sameActionOnPage();
        inputCorrectPassword();
        clickButtonLogInOnLoginPage();
        getTextEmailRequired();

    }

    public void actionWithInvalidPassword(){
        sameActionOnPage();
        inputCorrectEmail();
        inputInvalidPassword();
        clickButtonLogInOnLoginPage();
        getTextInvalidPassword();
    }
}
