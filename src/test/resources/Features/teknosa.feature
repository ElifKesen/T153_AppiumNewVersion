Feature: Kullanici teknosa uyfulamasinda ilgili gorevleri yerine getirir

  Scenario: Kullanici uygulama uzerinde ilgili bolumu test eder
    Given Uygulama baslatilir
    When Ilk ekran bolumunden Atla ya tiklanir
    When Alt bolumden "Kategoriler" bolumune tiklanir
    And Kategoriler bolumunden kaydirarak "Ev ve Yaşam" bolumune tiklanir
    And Acilan sayfadan "Aydınlatma" secimi yapilir
    And Filtrele bolumune tiklanir
    Then Marka "Osram" bolumunden marka secimi yapilir
  @teknosa
  Scenario:Kullanici uygulama uzerinde ilgili bolumu test eder
    Given Uygulama baslatilir
    When Ilk ekran bolumunden Atla ya tiklanir
    When Alt bolumden "Kategoriler" bolumune tiklanir
    And kategoriler bolumunden "Kişisel Bakım" bolumune tiklanir
    And Acilan sayfadan "Saç Bakım" secimi yapilir
    And Filtrele bolumune tiklanir
    Then Marka "Arzum" bolumunden marka secimi yapilir
    When siralama yapilirak "Artan Fiyat" secilir
    Then fiyatlarin artan duzende oldugu test edilir
