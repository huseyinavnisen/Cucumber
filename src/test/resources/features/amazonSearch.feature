

Feature: Amazon Search
  @gp1
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici "https://amazon.com" sayfasina gider
    Then Kullanici nutella aratır
    And sonuclarin nutella icerdigini test eder


  Scenario: TC02 kullanici amazonda Selenium aratir

    Given kullanici "https://amazon.com" sayfasina gider
    Then Kullanici selenium aratır
    And sonuclarin selenium icerdigini test eder


  Scenario: TC03 kullanici amazonda iphone aratir

    Given kullanici "https://amazon.com" sayfasina gider
    Then Kullanici iphone aratır
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir