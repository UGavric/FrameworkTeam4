package TestCases;

import BasePackage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by mchowdhury123 on 4/27/14.
 */
public class Iframe extends BaseClass {

    @Test
    public void Iframes() throws InterruptedException {
        driver.findElement(By.cssSelector(".user_buttons a:nth-child(2)")).click();
        Thread.sleep(3000);
//        List<WebElement> AlliFrameID = driver.findElements(By.tagName("iframe"));
//        System.out.println(AlliFrameID.size());
//        for(int i=0;i<=AlliFrameID.size();i++){
//            System.out.println(AlliFrameID.get(i).getAttribute("id"));
//        }

        WebElement iFrame = driver.findElement(By.cssSelector("#surf-xdm iframe:nth-child(1)"));
        driver.switchTo().frame(iFrame);
//        List<WebElement> frms= driver.findElements(By.tagName("iframe"));
//        System.out.println(frms.size());

        WebElement iFrame2 = driver.findElement(By.cssSelector("#display-frame"));
        driver.switchTo().frame(iFrame2);
        driver.findElement(By.cssSelector("#input_username")).sendKeys("miad");
        driver.findElement(By.cssSelector("#input_password")).sendKeys("Miad");
        Thread.sleep(3000);
    }
}
