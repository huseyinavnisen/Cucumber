package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class NinjaPage {
    public NinjaPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Phones & PDAs']")
    public WebElement  phonesPda;

    @FindBy(xpath = "//h4")
    public List<WebElement > telefonIsimleri;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public List<WebElement > addToCard;

    @FindBy(xpath = "(//*[@type='button'])[5]")
    public WebElement  sepet;

    @FindBy(xpath = "//*[@class='text-left']")
    public List<WebElement > sepettekiUrunler;
}