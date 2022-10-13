
@All
Feature: Amazon Search
  @gp1
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given Kullanici "amznUrl" sayfasına gider
    Then Kullanici nutella aratır
    And sonuclarin nutella icerdigini test eder

  @gp3
  Scenario: TC02 kullanici amazonda Selenium aratir

    Given Kullanici "amznUrl" sayfasına gider
    Then Kullanici selenium aratır
    And sonuclarin selenium icerdigini test eder

  @gp2
  Scenario: TC03 kullanici amazonda iphone aratir

    Given Kullanici "amznUrl" sayfasına gider
    Then Kullanici iphone aratır
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir