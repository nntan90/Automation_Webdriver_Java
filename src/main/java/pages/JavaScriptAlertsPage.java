package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By alertLocator = By.xpath(".//button[text()='Click for JS Alert']");
    private By confirmLocator = By.xpath(".//button[text()='Click for JS Confirm']");
    private By promptLocator = By.xpath(".//button[text()='Click for JS Prompt']");

    private By resultLocator = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(alertLocator).click();
    }
    public void triggerConfirm(){
        driver.findElement(confirmLocator).click();
    }

    public void triggerPrompt(){
        driver.findElement(promptLocator).click();
    }

    public void alert_ClickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_ClickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void alert_EnterText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getTextFromAlert(){
        return driver.switchTo().alert().getText();
    }

    public String getResult(){
        return driver.findElement(resultLocator).getText();
    }

}
