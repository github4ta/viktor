package by.it_academy.web_page_testing.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    public final String CREATE_LIST = "+ Create List";
    public final String HOME = "Home";
    public final String TRENDING = "Trending";
    public final String INVITE_PEOPLE = "Invite people";


    @FindBy(xpath = "//div[@data-test='table-placeholder_lv-empty_btn']")
    private WebElement nameFieldCreateList;
    @FindBy(xpath = "//div[@data-test='simple-bar__item-label']")
    private WebElement nameHome;
    @FindBy(xpath = "//h2[@class='cu-inbox-top-tasks__subheader-title']")
    private WebElement nameTrendingAfterClickNameHome;
    @FindBy(xpath = "//span[@data-pendo='sidebar-invite-button']/div/div/*[name()='svg']")
    private WebElement fieldInvite;
    @FindBy(xpath = "//div[@data-test='modal__dialog']/div[2]/cu-invite-modal/div/div[1]/div[1]")
    private WebElement nameInvitePeople;


    public String getTextFromButtonCreateList(){
        return nameFieldCreateList.getText();
    }

    public String getTextFromNameHome(){
        return nameHome.getText();
    }

    public void clickButtonHome(){
        nameHome.click();
    }

    public String getTextNameTrendingAfterClickNameHome(){
        return nameTrendingAfterClickNameHome.getText();
    }

    public MainPage clickFieldInvite(){
        fieldInvite.click();
        return this;
    }

    public String getTextFromNameInvitePeople(){
        return nameInvitePeople.getText();
    }
}
