package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By completeWebFormLink = By.linkText("Complete Web Form");


    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public CompleteWebFormPage clickCompleteWebForm(){
        driver.findElement(completeWebFormLink).click();
        return new CompleteWebForm(driver);
    }
}
