package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.PracticeTestPage;
import utilities.Driver;

import java.util.List;

public class PracticeTestPageStepDefs {
    PracticeTestPage page = new PracticeTestPage();
    Actions action = new Actions(Driver.getDriver());
    int down32toplam;
    int clickTextToplam;
    int sonuc;

    /*
        @Given("{string} adresine gidin")
        public void adresine_gidin(String gidilecekUrl) {
            Driver.getDriver().get(gidilecekUrl);
        }
    */
    @Given("{string} adresine gidin")
    public void adresine_gidin(String gidilecekUrl) {
        Driver.getDriver().get(gidilecekUrl);
    }

    @Given("{int} defa click me ye tiklayin")
    public void defa_click_me_ye_tiklayin(Integer sayi) {
        for (int i = 0; i < sayi; i++) {
            page.clickmeButton.click();
        }

    }

    @Given("{int} defa Space dugmesine basin")
    public void defa_space_dugmesine_basin(Integer sayi) {
        for (int i = 0; i < sayi; i++) {
            action.sendKeys(Keys.SPACE).perform();
        }


    }

    @Given("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void down_yazisindaki_iki_basamakli_sayilarin_hepsini_toplayin() {
        List<WebElement> down32 = page.down32;
        for (WebElement w : down32) {
            down32toplam += Integer.parseInt(w.getText().replaceAll("[^0-9]", "")); //0 -9 dışındaki her şeyi boş değer ata
        }
        System.out.println("down32 Toplamı = " + down32);
    }

    @Given("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tum_click_metinlerinin_uzunlugunun_toplamini_onceki_toplamdan_cikarin() {
        List<WebElement> clickText = page.clickText;
        for (WebElement w : clickText) {
            clickTextToplam += w.getText().length();
        }
        sonuc = down32toplam - clickTextToplam;
    }

    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucun_oldugunu_dogrulayin(int toplam) {
        Assert.assertEquals("sonuc esit degil",toplam,sonuc);
    }

}
