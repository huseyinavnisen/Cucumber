package stepDefinitions;

import io.cucumber.java.en.And;
import pages.GuruPage;

public class GuruStepDefinition {
    GuruPage guru = new GuruPage();

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String sutunBasligi) {
        for (int i = 0; i < guru.basliklar.size(); i++) {
            if (guru.basliklar.get(i).equals(sutunBasligi)) {
                System.out.println(guru.basliklar.get(i).getText());
            }
        }
    }


}

