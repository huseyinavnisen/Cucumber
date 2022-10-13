package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Google_Morhipo_Trendyol_Page {
    public Google_Morhipo_Trendyol_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
// google sayfası elementleri
    @FindBy(xpath = "//*[@class='gLFyf gsfi']")
    public WebElement googleAramaKutusu;
    @FindBy(xpath = "//*[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")
    public WebElement GoogleAramaSonucuLinki;

   // trendyol sayfası elementleri
    @FindBy (css = "//*[@data-testid='suggestion']")
    public WebElement trendyolAramaKutusu;
    @FindBy (css = "//*[@class='dscrptn']")
    public WebElement trendyolAramaSonucuTexti;

    // morhipo sayfası elementleri
    @FindBy (css = "//*[@id='pw-search-input']")
    public WebElement morhipoAramaKutusu;
    @FindBy (xpath = "//*[@id='total-product-count']")
    public WebElement morhipoAramaSonucuTexti;


}