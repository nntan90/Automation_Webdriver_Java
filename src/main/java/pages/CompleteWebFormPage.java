package pages;


import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompleteWebFormPage {
    private WebDriver driver;
    private By firstNameLocator = By.id("first-name");
    private By lastNameLocator = By.id("last-name");
    private By jobTitleLocator = By.id("job-title");

    //Option 1 High School
    private By radioButton1Locator = By.id("radio-button-1");
    //Option 2 College
    private By radioButton2Locator = By.id("radio-button-2");
    //Option 3 Grad School
    private By radioButton3Locator = By.id("radio-button-3");

    //Checkbox Male
    private By checkBox1Locator = By.id("checkbox-1");
    //Checkbox Female
    private By checkBox2Locator = By.id("checkbox-2");
    //Checkbox Prefer not to say
    private By checkBox3Locator = By.id("checkbox-3");

    private By selectMenuLocator = By.id("select-menu");


    public CompleteWebFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputFirstName(String firstName) {
        driver.findElement(firstNameLocator).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        driver.findElement(lastNameLocator).sendKeys(lastName);
    }

    public void inputJobTitle(String jobTitle) {
        driver.findElement(jobTitleLocator).sendKeys(jobTitle);
    }

    //select Radio Button
    public void selectRadioBtnOpt1() {
        driver.findElement(radioButton1Locator).click();
    }

    public void selectRadioBtnOpt2() {
        driver.findElement(radioButton2Locator).click();
    }

    public void selectRadioBtnOpt3() {
        driver.findElement(radioButton3Locator).click();
    }

    //Select checkbox
    public void selectCheckBoxOpt1() {
        driver.findElement(checkBox1Locator).click();
    }

    public void selectCheckBoxOpt2() {
        driver.findElement(checkBox2Locator).click();
    }

    public void setCheckBox3Locator() {
        driver.findElement(checkBox3Locator).click();
    }

}
