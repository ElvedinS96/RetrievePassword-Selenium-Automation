package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailReset {
    private WebDriver driver;
    public By alertText = By.id("content");
    public EmailReset(WebDriver driver){
        this.driver=driver;
    }
    public String getEmailResettext(){
        return driver.findElement(alertText).getText();
    }
}
