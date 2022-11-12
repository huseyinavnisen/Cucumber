package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AmazonPage;
import utilities.Driver;

public class ResuableStepDefinition {
    AmazonPage amazonPage=new AmazonPage();

    @Given("url sayfasina git : {string}")
    public void sayfaya_git(String gidilecekUrl) {
        Driver.getDriver().get(gidilecekUrl);
    }


    @Then("{int} saniye bekle")
    public void saniyeBekle(int beklemeSuresi) {
        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}