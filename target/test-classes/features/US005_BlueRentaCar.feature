@deneme
Feature: aaa
  Scenario: aaaa

    Given kullanici "brcUrl" ana sayfasinda
    Then Login yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder


