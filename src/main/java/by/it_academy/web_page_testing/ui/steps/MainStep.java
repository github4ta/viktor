package by.it_academy.web_page_testing.ui.steps;

import by.it_academy.web_page_testing.ui.pages.LoginPage;
import by.it_academy.web_page_testing.ui.pages.MainPage;

public class MainStep extends MainPage{
    LoginPage loginPage = new LoginPage();

    public MainStep(){
        super();
    }

    public void sameActionOnPage(){
        openPage(BASE_URL);
        loginPage.clickButtonLogInOnStartPage();
        loginPage.inputCorrectEmail();
        loginPage.inputCorrectPassword();
        loginPage.clickButtonLogInOnLoginPage();
    }

    public void actionWithButtonCreateList(){
        sameActionOnPage();
        getTextFromButtonCreateList();
    }

    public void actionWithNameHome(){
        sameActionOnPage();
        getTextFromNameHome();
    }

    public void actionWithNameTrendingAfterClickNameHome(){
        sameActionOnPage();
        clickButtonHome();
        getTextNameTrendingAfterClickNameHome();
    }

    public void actionWithWindowInvitePeopleAfterClickFieldInvite(){
        sameActionOnPage();
        clickFieldInvite();
        getTextFromNameInvitePeople();
    }
}
