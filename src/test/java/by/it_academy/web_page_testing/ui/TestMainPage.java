package by.it_academy.web_page_testing.ui;

import by.it_academy.web_page_testing.ui.pages.MainPage;
import by.it_academy.web_page_testing.ui.steps.MainStep;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestMainPage extends BaseTest{
    public void testButtonCreateList(){
        MainPage mainPage = new MainPage();
        MainStep mainStep = new MainStep();
        mainStep.actionWithButtonCreateList();

        Assert.assertEquals(mainPage.CREATE_LIST, mainPage.getTextFromButtonCreateList());
    }

    public void testWithNameHome(){
        MainPage mainPage = new MainPage();
        MainStep mainStep = new MainStep();
        mainStep.actionWithNameHome();

        Assert.assertEquals(mainPage.HOME, mainPage.getTextFromNameHome());
    }

    public void testWithNameTrendingAfterClickNameHome(){
        MainPage mainPage = new MainPage();
        MainStep mainStep = new MainStep();
        mainStep.actionWithNameTrendingAfterClickNameHome();

        Assert.assertEquals(mainPage.TRENDING, mainPage.getTextNameTrendingAfterClickNameHome());
    }

    public void testWindowInvitePeopleAfterClickFieldInvite(){
        MainPage mainPage = new MainPage();
        MainStep mainStep = new MainStep();
        mainStep.actionWithWindowInvitePeopleAfterClickFieldInvite();

        Assert.assertEquals(mainPage.INVITE_PEOPLE, mainPage.getTextFromNameInvitePeople());
    }
}
