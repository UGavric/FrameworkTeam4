package TestCases;

import BasePackage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by mchowdhury123 on 4/27/14.
 */
public class NewTab extends BaseClass {

    @Test
    public void newtab() throws InterruptedException {
        Thread.sleep(3000);
//        String newtabs = Keys.chord(Keys.SHIFT, Keys.RETURN);
//        Thread.sleep(3000);
//        driver.findElement(By.id("nav-your-amazon")).sendKeys(newtabs);

        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
        driver.findElement(By.id("nav-your-amazon")).sendKeys(selectLinkOpeninNewTab);
        Thread.sleep(3000);
    }
}
