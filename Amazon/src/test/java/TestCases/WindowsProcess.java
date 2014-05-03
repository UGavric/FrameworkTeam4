package TestCases;

import BasePackage.BaseClass;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.testng.annotations.Test;

/**
 * Created by mchowdhury123 on 4/27/14.
 */
public class WindowsProcess extends BaseClass {

@Test
    public void kill(){
    WindowsUtils.tryToKillByName("firefox.exe");
    driver = new FirefoxDriver();
    driver.get("http://www.amazon.com");
    driver.manage().window().maximize();
}
}
