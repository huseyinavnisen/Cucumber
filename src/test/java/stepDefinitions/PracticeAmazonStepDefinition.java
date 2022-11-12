package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.PracticeAmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PracticeAmazonStepDefinition {
    PracticeAmazonPage amazonPage = new PracticeAmazonPage();
    Faker faker = new Faker();

    @Given("kullanici Amazon web sitesine gider")
    public void kullanici_amazon_web_sitesine_gider() {
        //Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        Driver.getDriver().get("http://amazon.com");

    }

    @When("sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        amazonPage.signButton.click();
    }

    @When("faker kullanarak e-posta gonderir")
    public void faker_kullanarak_e_posta_gonderir() {
        amazonPage.emailBox.sendKeys(faker.internet().emailAddress());

    }

    @When("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigi_e_postanin_ekran_goruntusunu_alir() throws IOException {
        ReusableMethods.getScreenshotWebElement("Fake e-mail", amazonPage.emailBox);
    }

    @When("continiue'a tiklar")
    public void continiue_a_tiklar() {
        amazonPage.continueButon.click();
    }

    @Then("There was a problem mesajini dogrular")
    public void there_was_a_problem_mesajini_dogrular() {
        String expectedText = "There was a problem";
        String actualText = amazonPage.problemMessage.getText();
        Assert.assertEquals("Problem Mesajı Eşit Değil", expectedText, actualText);
    }

    @Then("Need help e tiklar")
    public void need_help_e_tiklar() {
        amazonPage.needHelp.click();
    }

    @Then("forgot your password e tiklar")
    public void forgot_your_password_e_tiklar() {
        amazonPage.forgotPasswordLink.click();
    }

    @Then("Password assistance metnini dogrular")
    public void password_assistance_metnini_dogrular() {
        Assert.assertTrue(amazonPage.passwordAsistanceText.isDisplayed());
    }

    @Then("Geri gider")
    public void geri_gider() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
    }

    @Then("Create your account butonuna tiklar")
    public void create_your_account_butonuna_tiklar() {
        amazonPage.createYourAccountButton.click();
    }

    @Then("Create account metnini dogrular")
    public void create_account_metnini_dogrular() {
Assert.assertTrue("Create Account İçermiyor",amazonPage.createAccountText.getText().contains("Create account"));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();

    }


}
