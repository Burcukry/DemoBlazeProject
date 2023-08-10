package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Baseedriver{

    public static WebDriver driver;


    @BeforeClass(alwaysRun = true)

    public void createDriver() {
        closePreviousDrivers();
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        Duration duration = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(duration);
        driver.manage().timeouts().implicitlyWait(duration);
    }

    @AfterClass(alwaysRun = true)
    public void quitDriver() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


    }

    public static void closePreviousDrivers() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void login(){

        driver.get("https://www.demoblaze.com/index.html");

        WebElement LoginButton = driver.findElement(By.cssSelector("a[id='login2']"));
        LoginButton.click();

        WebElement enterUsername = driver.findElement(By.cssSelector("input[id='loginusername']"));
        enterUsername.sendKeys("Burcu246");

        WebElement enterPassword = driver.findElement(By.cssSelector("input[id='loginpassword']"));
        enterPassword.sendKeys("Burcu246");

        WebElement Lgnbutton = driver.findElement(By.cssSelector("button[class='btn btn-primary'][onclick='logIn()']"));
        Lgnbutton.click();

    }

   public static void Wait(){

       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }

}
