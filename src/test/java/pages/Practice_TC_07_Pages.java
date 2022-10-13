package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Practice_TC_07_Pages {
    public Practice_TC_07_Pages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//*[.=' Test Cases'])[2]")
    public WebElement testCaseLink;

    @FindBy (xpath = "//*[text()='Test Cases']")
    public WebElement testCaseTitle;

}
