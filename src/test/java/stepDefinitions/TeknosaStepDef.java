package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TeknosaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TeknosaStepDef {
    TeknosaPage page=new TeknosaPage();

    @Given("Uygulama baslatilir")
    public void uygulama_baslatilir() {
        Driver.getAndroidDriver();
    }
    @When("Ilk ekran bolumunden Atla ya tiklanir")
    public void ilk_ekran_bolumunden_atla_ya_tiklanir() {
        page.AtlaButon.click();
    }
    @When("Alt bolumden {string} bolumune tiklanir")
    public void alt_bolumden_bolumune_tiklanir(String string) {
        ReusableMethods.bekle(3);
        page.KategorilerButon.click();

    }
    @When("Kategoriler bolumunden kaydirarak {string} bolumune tiklanir")
    public void kategoriler_bolumunden_kaydirarak_bolumune_tiklanir(String kategoriAdi) {
        ReusableMethods.bekle(3);
        ReusableMethods.dikeyKaydirma(Driver.getAndroidDriver(),0.80,0.20,0.50,100);
        ReusableMethods.bekle(3);
        ReusableMethods.scrollWithUiScrollableAndClick(kategoriAdi);
        ReusableMethods.bekle(3);
    }
    @When("Acilan sayfadan {string} secimi yapilir")
    public void acilan_sayfadan_secimi_yapilir(String bolum) {
        ReusableMethods.scrollWithUiScrollableAndClick(bolum);
        ReusableMethods.bekle(3);
    }
    @When("Filtrele bolumune tiklanir")
    public void filtrele_bolumune_tiklanir() {
        page.FiltreleButonu.click();
        ReusableMethods.bekle(3);

    }
    @Then("Marka {string} bolumunden marka secimi yapilir")
    public void marka_bolumunden_marka_secimi_yapilir(String marka) {
        page.markaButonu.click();
        ReusableMethods.bekle(3);
        page.markaMetinYazmaKutusu.sendKeys(marka);
        ReusableMethods.bekle(3);
        page.filtrelenmisMarkaKutusu.click();
        ReusableMethods.bekle(3);
        page.SonuclariGosterButonu.click();
        ReusableMethods.bekle(3);
    }

    @When("kategoriler bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumunden_bolumune_tiklanir(String kategori) {
        ReusableMethods.scrollWithUiScrollableAndClick(kategori);
        ReusableMethods.bekle(3);

    }
    @When("siralama yapilirak {string} secilir")
    public void siralama_yapilirak_secilir(String secim) {
        page.SiralaButonu.click();
        ReusableMethods.bekle(3);
        ReusableMethods.scrollWithUiScrollableAndClick(secim);
        ReusableMethods.bekle(3);
    }
    @Then("fiyatlarin artan duzende oldugu test edilir")
    public void fiyatlarin_artan_duzende_oldugu_test_edilir() {

       String dusukFiyat =page.DusukFiyat.getText();
       dusukFiyat=dusukFiyat.replaceAll("\\D","");
       ReusableMethods.bekle(3);

        ReusableMethods.dikeyKaydirma(Driver.getAndroidDriver(),0.80,0.20,0.50,100);
        ReusableMethods.bekle(3);

        String YuksekFiyat =page.YuksekFiyat.getText();
        YuksekFiyat=YuksekFiyat.replaceAll("\\D","");
        ReusableMethods.bekle(3);
        Assert.assertTrue(Integer.parseInt(YuksekFiyat)>Integer.parseInt(dusukFiyat));
    }

    @Then("Kullanici ekran fotografi almak icin {string} secer")
    public void kullanici_ekran_fotografi_almak_icin_secer(String kirpilmisGoruntu) throws IOException {
        ReusableMethods.bekle(3);
        ReusableMethods.screenShotElement(kirpilmisGoruntu);

    }


}
