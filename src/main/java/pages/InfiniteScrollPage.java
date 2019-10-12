package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    WebDriver driver;
    private By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToParagraph(int index){
        String script = "window.scroll(0, document.body.scrollHeight)";
        JavascriptExecutor jsExcutor = (JavascriptExecutor)driver;

        while(getNumberOfParagraph() < index){
            jsExcutor.executeScript(script);
        }
    }

    /**
     * Scroll until paragraph with index specific ís in view
     * @param
     */
    private int getNumberOfParagraph(){
        return driver.findElements(textBlocks).size();
    }

}
