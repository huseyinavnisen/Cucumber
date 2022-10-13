Feature: US006 Kullanıcı Amazonda istedigi urunleri aratır
  Scenario Outline: TC01 Kullanici istediği urunleri aratir
    Given kullanici "amznUrl" sayfasina gider
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella | nutella |
      | selenium  | selenium |
      | sql | sql |
      | java | java |

