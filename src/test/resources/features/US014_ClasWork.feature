Feature: US014 Class Work
  Scenario: Kullanici ve Url Testi

    Given url sayfasina git : "http://webdriveruniversity.com/"
    Then kullanici Login Portala kadar asagi iner
    And kullanici Login Portala tiklar
    And kullanici diger windowa gecer
    And kullanici "username" kutusuna bilgileri girer
    And kullanici "password" kutusuna bilgileri girer
    And kullanıci login butonuna basar
    And kullanıci Popup'ta cikan yazinin validation failed oldugunu test eder
    And kullanıci Ok diyerek Popup'i kapatir
    And kullanıci ilk sayfaya geri doner
    And kullanıci ilk sayfaya donuldugunu test eder