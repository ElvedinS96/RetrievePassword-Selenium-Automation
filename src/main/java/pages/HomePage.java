package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By forgotPassword=By.linkText("Forgot Password");
    public HomePage (WebDriver driver){
        this.driver=driver;
    }
    public ForgotPassword clickForgotPassword (){
        driver.findElement(forgotPassword).click();
        return new ForgotPassword(driver);
    }
}
