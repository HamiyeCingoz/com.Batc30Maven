package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C02_Test01 {
    public static void main(String[] args) {
        //1-Test01 isimli bir class olusturun
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //2- https://www.walmart.com/ adresine gidin
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.walmart.com/ ");
        //3- Browseri tam sayfa yapin
        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Save” ifadesi icerdigini control edin
        String beklenenIcerik="Save";
        String guncelIcerik=driver.getTitle();
        if (guncelIcerik.contains("save")){
            System.out.println("beklenen icerik goruldu");
        }else{
            System.out.println("beklenen icerik gorulmedi");
        }
        //6-Sayfa basliginin “Walmart.com | Save Money.Live Better” a esit oldugunu control ediniz
        String beklenenBaslik="Walmart.com | Save Money.Live Better";
        String guncelBaslik=driver.getTitle();
        if (beklenenBaslik.equals(guncelBaslik)){
            System.out.println("baslik "+beklenenBaslik+" dir");
        }else {
            System.out.println("beklenen baslik gorulmedi");
        }
        //7- URL in walmart.com icerdigini control edin
        String actuelUrl=driver.getCurrentUrl();
        String urlArananKelime="walmart.com";
        if (actuelUrl.contains(urlArananKelime)){
            System.out.println("beklenen url iceriyor test pass");
        }else{
            System.out.println("aranan kelime bulunamadi url testi failed");
        }
        //8-”Nutella” icin arama yapiniz

        //9- Kac sonuc bulundugunu yaziniz
        //10-Sayfayi kapatin
    }
}
