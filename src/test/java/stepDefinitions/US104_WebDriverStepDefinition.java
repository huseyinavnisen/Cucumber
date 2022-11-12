package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class US104_WebDriverStepDefinition {
    @Then("kullanici Login Portala kadar asagi iner")
    public void kullaniciLoginPortalaKadarAsagiIner() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("kullanici Login Portala tiklar")
    public void kullaniciLoginPortalaTiklar() {
    }

    @And("kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {
    }

    @And("kullanici {string} kutusuna bilgileri girer")
    public void kullaniciKutusunaBilgileriGirer(String arg0) {
    }


}
