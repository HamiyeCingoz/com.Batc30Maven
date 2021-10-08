package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C03_Test03 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
        //2. Username kutusuna “standard_user” yazdirin
        WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userName.sendKeys("standard_user");
        //3. Password kutusuna “secret_sauce” yazdirin
        WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");
        //4. Login tusuna basin
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrunIsmi=driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
        String ilkUrunKayit=ilkUrunIsmi.getText();
        System.out.println("ilk urun ismi : "+ ilkUrunIsmi);
        //6. Add to Cart butonuna basin
        driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")).click();
        //7. Alisveris sepetine tiklayin
        WebElement sepet=driver.findElement(By.linkText("1"));
        sepet.click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement sepettekiUrun=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String urun=sepettekiUrun.getText();
        if (ilkUrunKayit.equals(urun)){
            System.out.println("urun sepette PASS");
        }else{
            System.out.println("urun sepette gorulmedi");
        }
        //9. Sayfayi kapatin
        driver.close();
        //saucedemo.comsaucedemo.com
        //Swag Labs
        //Sauce Labs Swag Labs app
        
    }
}
