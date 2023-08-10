package ProjectDemoBlaze;

import Utilities.Baseedriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class PlaceOrderTest extends Baseedriver {

    @Test
    void placeOrderTest(){
        login();
        POMClass elements=new POMClass();
        elements.LoginButton.click();
        elements.clickLoginButton.click();
        elements.Username.sendKeys("Burcu246");
        elements.Password.sendKeys("Burcu246");


    }
}
