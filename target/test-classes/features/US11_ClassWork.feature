@US1011ClasWork
Feature: US1011ClasWork
  Scenario: Herocap sitesi buton tarama

    And kullanici "https://the-internet.herokuapp.com/add_remove_elements/" sayfasina gider
    And Add Element butona basin
    And kullanici 3 saniye bekler
    And Delete butonu gorunur oluncaya kadar bekleyin
    And Delete butonunun gorunur oldugunu test edin
    And kullanici 3 saniye bekler
    And Delete butonuna basarak butonu silin
    And AddRemove Elements yazisinin gorunurlugunu test eder
    And kullanici 3 saniye bekler
    And Delete butonunun gorunmedigini test edin
    And kullanici 3 saniye bekler
    And sayfayi kapatir
