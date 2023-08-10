package ProjectDemoBlaze;

import Utilities.Baseedriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass {
    public POMClass() {

        PageFactory.initElements(Baseedriver.driver, this);
    }

    @FindBy(css = "a[id='login2']")
    public WebElement LoginButton;

    @FindBy(css="input[id='loginusername']")
    public WebElement Username;

    @FindBy(css="input[id='loginpassword']")
    public  WebElement Password;

    @FindBy(css="button[class='btn btn-primary'][onclick='logIn()']")
    public WebElement clickLoginButton;




}

