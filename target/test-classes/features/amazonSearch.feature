Feature: Amazon Search
  Scenario: TC01 Kullanici amazonda nutella aratir
    Given Kullanici amazon sayfasına gider
    Then Kullanici nutella aratır
    And sonuclarin nutella icerdigini test eder
    And sayfayi kapatir
