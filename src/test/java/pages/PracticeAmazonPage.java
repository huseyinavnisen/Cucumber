package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeAmazonPage {
    public PracticeAmazonPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@id='nav-link-accountList-nav-line-1']")
    public WebElement signButton;

    @FindBy (xpath = "//*[@id='ap_email']")
    public WebElement emailBox;

    @FindBy (xpath = "//input[@id='continue']")
    public WebElement continueButon;

    @FindBy (xpath = "//*[text()='There was a problem']")
    public WebElement problemMessage;

    @FindBy (xpath = "//span[@class='a-expander-prompt']")
    public WebElement needHelp;

    @FindBy (xpath = "//*[@id='auth-fpp-link-bottom']")
    public WebElement forgotPasswordLink;

    @FindBy (xpath = "//h1")
    public WebElement passwordAsistanceText;

    @FindBy (xpath = "//*[@id='createAccountSubmit']")
    public WebElement createYourAccountButton;

    @FindBy (xpath = "//h1")
    public WebElement createAccountText;

}
