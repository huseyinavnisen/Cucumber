package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;


public class AmazonStepDefinition {
    @Given("Kullanici amazon sayfasına gider")
    public void kullaniciAmazonSayfasınaGider() {
        Driver.getDriver().get("https://amazon.com");
    }

    @Then("Kullanici nutella aratır")
    public void kullaniciNutellaAratır() {
    }

    @And("sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
    }
}
