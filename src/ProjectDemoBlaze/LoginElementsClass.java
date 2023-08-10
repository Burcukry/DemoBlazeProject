package ProjectDemoBlaze;

import Utilities.Baseedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.print.DocFlavor;

public class LoginElementsClass extends Baseedriver {

    @Test
    void ElementsClass() {

        driver.get("https://www.demoblaze.com/index.html");

        WebElement LoginButton = driver.findElement(By.cssSelector("a[id='login2']"));
        LoginButton.click();

        WebElement enterUsername = driver.findElement(By.cssSelector("input[id='loginusername']"));
        enterUsername.sendKeys("Burcu246");

        WebElement enterPassword = driver.findElement(By.cssSelector("input[id='loginpassword']"));
        enterPassword.sendKeys("Burcu246");

        WebElement Lgnbutton = driver.findElement(By.cssSelector("button[class='btn btn-primary'][onclick='logIn()']"));
        Lgnbutton.click();

        WebElement verifysuccessfully = driver.findElement(By.xpath("//a[text()='Welcome Burcu246']"));
        System.out.println(verifysuccessfully.getText());
        Assert.assertTrue(verifysuccessfully.getText().contains("Welcome Burcu246"));

        WebElement clickpHone = driver.findElement(By.xpath("//a[text()='Phones']"));
        clickpHone.click();

        WebElement verifyphonespage = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
        System.out.println(verifyphonespage.getText());
        Assert.assertTrue(verifyphonespage.getText().contains("Samsung galaxy s6"));

        WebElement clicklaptops = driver.findElement(By.xpath("//a[text()='Laptops']"));
        clicklaptops.click();

        WebElement clickMonitor = driver.findElement(By.xpath("//a[text()='Monitors']"));
        clickMonitor.click();

        WebElement logOut = driver.findElement(By.xpath("//a[text()='Log out']"));
        logOut.click();

    }

    public static void Wait() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

        @Test
        void ElementsClass2() {
            driver.get("https://www.demoblaze.com/index.html");

            WebElement LoginButton = driver.findElement(By.cssSelector("a[id='login2']"));
            LoginButton.click();

            WebElement enterUsername = driver.findElement(By.cssSelector("input[id='loginusername']"));
            enterUsername.sendKeys("Burcu246");

            WebElement enterPassword = driver.findElement(By.cssSelector("input[id='loginpassword']"));
            enterPassword.sendKeys("Burcu246");

            WebElement Lgnbutton = driver.findElement(By.cssSelector("button[class='btn btn-primary'][onclick='logIn()']"));
            Lgnbutton.click();

            WebElement verifysuccessfully = driver.findElement(By.xpath("//a[text()='Welcome Burcu246']"));
            System.out.println(verifysuccessfully.getText());
            Assert.assertTrue(verifysuccessfully.getText().contains("Welcome Burcu246"));

            WebElement clickpHone = driver.findElement(By.xpath("//a[text()='Phones']"));
            clickpHone.click();

            WebElement clickSamsung = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
            clickSamsung.click();

            WebElement AddtoCartSamsung= driver.findElement(By.xpath("//a[text()='Add to cart']"));
            AddtoCartSamsung.click();

            Wait();

            driver.switchTo().alert().accept();

            WebElement ClickCart1=driver.findElement(By.xpath("//a[text()='Cart']"));
            ClickCart1.click();

            WebElement Totalprice= driver.findElement(By.xpath("//div[@class='col-lg-1']/h2"));
            System.out.println(Totalprice.getText());
            Assert.assertTrue(Totalprice.getText().contains("Total"),"Test failed");

            WebElement Homepage= driver.findElement(By.xpath("//li[@class='nav-item active']/a"));
            Homepage.click();

            WebElement secondphone= driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']"));
            secondphone.click();

            WebElement secondaddtocart= driver.findElement(By.xpath("//a[@onclick='addToCart(2)']"));
            secondaddtocart.click();

            WebElement Clicksecondtimecartbutton= driver.findElement(By.xpath("//a[@id='cartur']"));
            Clicksecondtimecartbutton.click();






    }
}


