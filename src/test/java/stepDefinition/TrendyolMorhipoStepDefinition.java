package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Google_Morhipo_Trendyol_Page;
import utilities.Driver;

public class TrendyolMorhipoStepDefinition {
    Google_Morhipo_Trendyol_Page webelEmentPage = new Google_Morhipo_Trendyol_Page();
    Actions action = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @Given("Google gidin")
    public void googleGidin() {
        Driver.getDriver().get("http://google.com");
    }

    @Then("trendyolu aratin")
    public void trendyoluAratin() {
        webelEmentPage.googleAramaKutusu.sendKeys("trendyol", Keys.ENTER);
    }

    @And("trendyol linkini bulup siteye gidin")
    public void trendyolLinkiniBulupSiteyeGidin() {
        webelEmentPage.GoogleAramaSonucuLinki.click();
        String trendyolHandle = Driver.getDriver().getWindowHandle();

    }

    @And("trendyolda makas aratin")
    public void trendyoldaMakasAratin() {
        webelEmentPage.trendyolAramaKutusu.sendKeys("makas");
    }

    @And("trendyolda toplam urun sayisini alin")
    public void trendyoldaToplamUrunSayisiniAlin() {
        String [] trendyolAramaSonucuTexti = webelEmentPage.trendyolAramaSonucuTexti.getText().split(" ");
        System.out.println("trendyolAramaSonucuTexti = " + trendyolAramaSonucuTexti.toString());
    }

    @And("yeni sekmede morhipoya gidiniz")
    public void yeniSekmedeMorhipoyaGidiniz() {


    }

    @And("morhipoda makas aratiniz")
    public void morhipodaMakasAratiniz() {
    }

    @And("morhipoda toplam urun sayisini aliniz")
    public void morhipodaToplamUrunSayisiniAliniz() {
    }

    @And("iki sitedeki toplam makas sayisini karsilastirin")
    public void ikiSitedekiToplamMakasSayisiniKarsilastirin() {
    }

    @And("urun sayisi fazla olan siteyi kapatınız")
    public void urunSayisiFazlaOlanSiteyiKapatınız() {
    }

    @And("sonra diger sayfayida kapatin")
    public void sonraDigerSayfayidaKapatin() {
    }
}
