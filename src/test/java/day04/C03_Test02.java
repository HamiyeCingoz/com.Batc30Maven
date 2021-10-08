package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C03_Test02 {
    public static void main(String[] args) {
        //1. http://zero.webappsecurity.com sayfasina gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(" http://zero.webappsecurity.com");

        //2. Signin buttonuna tiklayin
        WebElement signInButonu=driver.findElement(By.xpath("//button[@id='signin_button']"));
        signInButonu.click();
        //3. Login alanine  “username” yazdirin
        WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("username");
        //4. Password alanine “password” yazdirin
        WebElement passWord=driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("password");
        //5. Sign in buttonuna tiklayin
        WebElement signInButonTikla=driver.findElement(By.xpath("//input[@type='submit']"));
        signInButonTikla.click();
        //6. Pay Bills sayfasina gidin
        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        //8. tarih kismina “2020-09-10” yazdirin
        //9. Pay buttonuna tiklayin
        //10. “The payment was successfully submitted.” mesajinin ciktigini control edin
    }
}
