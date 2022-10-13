@Background
Feature:US001 Background Kullanimi
  Background: Ortak Calisacak Kisim
    Given Kullanici amazon sayfasına gider
@Login
  Scenario: TC01 Kullanici amazonda nutella aratir
    Then Kullanici nutella aratır
    And sonuclarin nutella icerdigini test eder

  Scenario: TC02 Kullanici amazonda selenium aratir
    Then Kullanici selenium aratır
    And sonuclarin selenium icerdigini test eder

  Scenario: TC03 Kullanici amazonda iphone aratir
    Then Kullanici iphone aratır
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir
    