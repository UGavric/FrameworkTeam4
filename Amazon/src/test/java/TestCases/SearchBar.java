package TestCases;

import BasePackage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by mchowdhury123 on 4/26/14.
 */
public class SearchBar extends BaseClass{

    @Test

    public void SearchBar(){
        clickByCss("#twotabsearchtextbox");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Microwave", Keys.ENTER);
        System.out.println(driver.findElement(By.cssSelector("#twotabsearchtextbox")).getText());

    }
}
