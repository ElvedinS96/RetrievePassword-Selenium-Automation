package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    private WebDriver driver;
    private By emailInput = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");
    public ForgotPassword(WebDriver driver){
        this.driver=driver;
    }
    public void clickEmailInput (String email){

        driver.findElement(emailInput).sendKeys(email);
    }
    public EmailReset clickRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
        return new EmailReset(driver);
    }


}
