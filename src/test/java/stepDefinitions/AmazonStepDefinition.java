package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;
public class AmazonStepDefinition {
    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String gidilecekUrl) {
        Driver.getDriver().get(gidilecekUrl);
    }

    @Then("Kullanici nutella aratır")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @And("sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String arananKelime="Nutella";
        String actualAramaSonucStr= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }



    @Then("Kullanici selenium aratır")
    public void kullaniciSeleniumAratir() {
        amazonPage.aramaKutusu.sendKeys("Selenium" + Keys.ENTER);
    }

    @And("sonuclarin selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        String arananKelime="Selenium";
        String actualAramaSonucStr= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Then("Kullanici iphone aratır")
    public void kullaniciIphoneAratir() {
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime="iphone";
        String actualAramaSonucStr= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }




    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime,Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(arananKelime));
            }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSure) {
        try {
            Thread.sleep(istenenSure*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}