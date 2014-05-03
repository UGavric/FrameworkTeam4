package TestCases;

import BasePackage.BaseClass;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

/**
 * Created by mchowdhury123 on 4/26/14.
 */
public class Dimensions extends BaseClass{

    @Test
    public void dimensioning() throws InterruptedException {
        System.out.println(driver.manage().window().getSize());
        Dimension d = new Dimension(420,600);
        driver.manage().window().setSize(d);
        Thread.sleep(4000);


        Dimension E = new Dimension(500,700);
        driver.manage().window().setSize(E);
        Thread.sleep(4000);

        Dimension F = new Dimension(900, 1295);
        driver.manage().window().setSize(F);
        Thread.sleep(3000);
    }
}
