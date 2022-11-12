package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuPage;
import utilities.Driver;

import java.time.Duration;

public class TheInternetHerOkuStepdefinition {
    HerokuPage heroku = new HerokuPage();

    @And("Add Element butona basin")
    public void addElementButonaBasin() {
        heroku.addElementButon.click();
    }

    @And("Delete butonu gorunur oluncaya kadar bekleyin")
    public void deleteButonuGorunurOluncayaKadarBekleyin() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(heroku.deleteButon));

        //ReusableMethods.waitForVisibility(heroku.deleteButon,10);
    }

    @And("Delete butonunun gorunur oldugunu test edin")
    public void deleteButonununGorunurOldugunuTestEdin() {
        assert heroku.deleteButon.isDisplayed();
    }

    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
        heroku.deleteButon.click();
    }

    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
        assert !heroku.deleteButon.isDisplayed();
    }

    @And("AddRemove Elements yazisinin gorunurlugunu test eder")
    public void addremoveElementsYazisininGorunurlugunuTestEder() {
        assert heroku.addRemovesElementsText.getText().equals("Add/Remove Elements");

    }
}