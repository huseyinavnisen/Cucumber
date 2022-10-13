package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Practice_TC_07_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_TC_07_steps {
    Practice_TC_07_Pages practiceTc07Page=new Practice_TC_07_Pages();

    @Given("Tarayici baslatilir ve {string} gidilir")
    public void tarayiciBaslatilirVeGidilir(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }

    @Then("Ana sayfanin basarili sekilde gorundugu test edilir")
    public void anaSayfaninBasariliSekildeGorunduguTestEdilir() {
        String homeUrl ="https://automationexercise.com/";
        Assert.assertEquals("home url eşit değil",homeUrl,Driver.getDriver().getCurrentUrl());
    }

    @And("Test Case buttonuna tiklayin")
    public void testCaseButtonunaTiklayin() {
        practiceTc07Page.testCaseLink.click();
    }

    @Then("Kullanicinin test case sayfasina basariyla yonlendigini dogrulayin")
    public void kullanicininTestCaseSayfasinaBasariylaYonlendiginiDogrulayin() {
        Assert.assertTrue(practiceTc07Page.testCaseTitle.isDisplayed());
    }

    @And("ilgili sayfanin ekran goruntusunu alin")
    public void ilgiliSayfaninEkranGoruntusunuAlin() {
        try {
            ReusableMethods.getScreenshot("TestCase07 Pages");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
