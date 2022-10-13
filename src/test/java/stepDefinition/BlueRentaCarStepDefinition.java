/*
package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentaCarStepDefinition {
    BrcPage brc = new BrcPage();

    @Given("kullanici {string} ana sayfasinda")
    public void kullanici_ana_sayfasinda(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }

    @Then("Login yazisina tiklar")
    public void login_yazisina_tiklar() {
        brc.login.click();
    }

    @Then("gecersiz username girer")
    public void gecersiz_username_girer() {
        brc.email.sendKeys("aaa@hotmail.com");
    }

    @Then("gecersiz password girer")
    public void gecersiz_password_girer() {
        brc.pasword.sendKeys("aaaa");
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        brc.login.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfaya_giris_yapilamadigini_kontrol_eder() {
        Assert.assertTrue(brc.email.isDisplayed() && brc.pasword.isDisplayed() && brc.login.isDisplayed());
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
    }

}
*/