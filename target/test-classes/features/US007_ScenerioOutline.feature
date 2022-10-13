Feature: US007 Scenario Outline Kullanimi

  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
    Given kullanici "<gidielecekUrl>" sayfasina gider
    Then kullanici 1 saniye bekler
    And sayfayi kapatir
    Examples:
      | gidielecekUrl |
      | amznUrl       |
      | faceUrl       |





