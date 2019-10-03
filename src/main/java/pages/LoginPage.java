package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By loginBtnLocator = By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String username){
        driver.findElement(userNameLocator).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordLocator).sendKeys(password);
    }
    public SecureAreaPage clickLoginBtn(){
        driver.findElement(loginBtnLocator).click();
        return new SecureAreaPage(driver);
    }


}
