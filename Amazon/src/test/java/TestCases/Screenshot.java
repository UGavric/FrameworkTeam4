package TestCases;

import BasePackage.BaseClass;
import com.sun.jna.platform.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by mchowdhury123 on 4/27/14.
 */
public class Screenshot extends BaseClass {

    @Test
    public void screen(){
        clickByCss("#nav-your-amazon");
    try{
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        org.apache.commons.io.FileUtils.copyFile(scrFile, new File("C:\\Users\\Miad\\Desktop\\screenies\\Amazon_page.png"));

    }catch (Exception e){
        e.printStackTrace();
    }

}
}
