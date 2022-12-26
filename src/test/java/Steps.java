import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class Steps extends BaseTest{
    String xdxd = "//*[@text='22:00']";
    @Step("<x> saniye kadar bekle")
    public void waitxSeconds(int x) throws InterruptedException {
        Thread.sleep(1000*x);
    }

    @Step("Uygulamanin Acilmasi Kontrolu")
    public void acilisKontrolu(){
        MobileElement element = appiumDriver.findElement(By.xpath("//*[@text='Skip']"));
        if (element.isDisplayed()){
            System.out.println("-----UYGULAMA ACILDI----");
        }else {
            System.out.println("-----UYGULAMA ACILAMADI-----");
        }
    }
    @Step("<xd> xpathli elemente tikla")
    public void xpathClick(String xd){
        appiumDriver.findElement(By.xpath(xd)).click();
    }
    @Step("<id> idli elemente tikla")
    public void idClick(String id){
        appiumDriver.findElement(By.id("com.m.qr:id/push_consent_decline")).click();
    }
    @Step("<xpath> xpathli elemente <value> text degerini yaz")
    public void sendKeyByxpath(String xpath ,String value){
        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        element.clear();
        element.sendKeys(value);
    }
    @Step("Secim Ekrani Kontrolu")
    public void secimEkraniKontrolu(){
        String selam = "//*[@resource-id='com.m.qr:id/rvmp_results_count']";
        MobileElement element = appiumDriver.findElement(By.xpath(selam));
        if (element.isDisplayed()){
            System.out.println("-----UCUS SECIM EKRANI ACILDI ----");
        }else {
            System.out.println("-----UCUS SECIM EKRANI ACILAMADI-----");
        }
    }
    @Step("Ucus Secimi")
    public void ucusSecimi(){
        String xdxd = "//*[@text='22:00']";
        appiumDriver.findElement(By.xpath(xdxd)).click();

    }
    @Step("Ucus Saati Kontrol")
    public void ucusSaatiKontrol(){
        if (xdxd == "//*[@text='22:00']"){
            System.out.println("UCUS SECIM SAATINIZ BASARIYLA GETIRILDI!!");
        }else {
            System.out.println("UCUS SECIM SAATI DEGISTIRILDI!!!");
        }

    }

}