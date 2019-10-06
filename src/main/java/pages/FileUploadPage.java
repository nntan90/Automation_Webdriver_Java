package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUploadButton = By.id("file-upload");
    private By fileSubmitButton = By.id("file-submit");
    private By uploadedFileLink = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickSubmitButton(){
        driver.findElement(fileSubmitButton).click();
    }

    public void uploadFile(String absolutePathOfFile){
        driver.findElement(fileUploadButton).sendKeys(absolutePathOfFile);
        clickSubmitButton();
    }

    public String getUploadedFile(){
        return driver.findElement(uploadedFileLink).getText();
    }

}
