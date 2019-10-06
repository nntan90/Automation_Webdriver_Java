package upload;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class UploadTests extends BaseTests  {

    @Test
    public void testUploadFile(){
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("D:\\workspace\\Automation_Webdriver_Java\\resources\\chromedriver.exe");
        assertEquals(fileUploadPage.getUploadedFile(),"chromedriver.exe", "Uploaded File not found");
    }
}
