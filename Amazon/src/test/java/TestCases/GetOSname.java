package TestCases;

import BasePackage.BaseClass;
import org.openqa.selenium.os.WindowsUtils;
import org.testng.annotations.Test;

/**
 * Created by mchowdhury123 on 4/27/14.
 */
public class GetOSname extends BaseClass {

    @Test
    public void registry(){
        String osname = WindowsUtils.readStringRegistryValue("HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Productname");
        System.out.println("The OS You are using is " + osname);
    }
}
