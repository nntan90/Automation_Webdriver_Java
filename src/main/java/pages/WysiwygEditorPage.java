package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String iframeEditor = "mce_0_ifr";
    private By editorLocator = By.id("tinymce");
    private By increaseIndentBtn = By.id("mceu_12");


    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void clearText(){
        switchToEditor();
        driver.findElement(editorLocator).clear();
        switchToParent();
    }

    public void inputText(String text){
        switchToEditor();
        driver.findElement(editorLocator).sendKeys(text);
        switchToParent();
    }

    public String getText(){
        switchToEditor();
        String text = driver.findElement(editorLocator).getText();
        switchToParent();
        return text;
    }

    public void clickIncreaseIndent(){
        driver.findElement(increaseIndentBtn).click();
    }

    private void switchToEditor(){
        driver.switchTo().frame(iframeEditor);
    }

    private void switchToParent(){
        driver.switchTo().parentFrame();
    }
}
