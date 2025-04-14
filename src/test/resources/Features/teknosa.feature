Feature: Kullanici teknosa uyfulamasinda ilgili gorevleri yerine getirir
  @teknosa
  Scenario: Kullanici uygulama uzerinde ilgili bolumu test eder
    Given Uygulama baslatilir
    When Ilk ekran bolumunden Atla ya tiklanir
    When Alt bolumden "Kategoriler" bolumune tiklanir
    And Kategoriler bolumunden kaydirarak "Ev ve Yaşam" bolumune tiklanir
    And Acilan sayfadan "Aydınlatma" secimi yapilir
    And Filtrele bolumune tiklanir
    Then Marka "Orbus" bolumunden marka secimi yapilir