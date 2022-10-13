Feature: Trendyol Urun Arama
  Scenario: Trendyol Urun Arama
    Given Google gidin
    Then trendyolu aratin
    And trendyol linkini bulup siteye gidin
    And trendyolda makas aratin
    And trendyolda toplam urun sayisini alin
    And yeni sekmede morhipoya gidiniz
    And morhipoda makas aratiniz
    And morhipoda toplam urun sayisini aliniz
    And iki sitedeki toplam makas sayisini karsilastirin
    And urun sayisi fazla olan siteyi kapatınız
    And sonra diger sayfayida kapatin