package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.NinjaPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class NinjaStepDefinition {

    NinjaPage ninja = new NinjaPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("tutorialsninja.com sayfasina git")
    public void tutorialsninjaComSayfasinaGit() {
        Driver.getDriver().get("http://tutorialsninja.com/demo/index.php?route=common/home");
    }

    @Then("Phones & PDAs'a tikla")
    public void phonesPDAsATikla() {
        ninja.phonesPda.click();
    }

    @Then("Telefonlarin markalarini al")
    public void telefonlarinMarkalariniAl() {
        System.out.println("Aramadaki Telefon Markaları");
        for (WebElement w : ninja.telefonIsimleri) {
            System.out.println(w.getText());
        }


    }

    @Then("Tum ogeleri sepete ekle")
    public void tumOgeleriSepeteEkley() {
        for (WebElement w : ninja.addToCard) {
            w.click();
        }
    }

    @Then("Sepete tikla")
    public void sepeteTikla() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        ninja.sepet.click();
    }

    @Then("Sepetteki isimleri al")
    public void sepettekiIsimleriAl() {
        System.out.println("Sepetteki Ürünler");
        for (WebElement w : ninja.sepettekiUrunler) {
            System.out.println(w.getText());
        }
    }

    @Then("Sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastir")
    public void sepettekiVeSayfadakiUrunlerinDogruOldugunuKarsilastir() {
    }
}
