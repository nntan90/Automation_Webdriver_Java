package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By completeWebFormLink = By.linkText("Complete Web Form");


    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public CompleteWebFormPage clickCompleteWebForm(){
        driver.findElement(completeWebFormLink).click();
        return new CompleteWebFormPage(driver);
    }

    public DropDownPage clickDropDownLink(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public HoversPage clickHorvers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public JavaScriptAlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
