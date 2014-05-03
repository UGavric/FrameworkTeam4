package TestCases;

import BasePackage.BaseClass;
import org.testng.annotations.Test;

/**
 * Created by mchowdhury123 on 4/27/14.
 */
public class NavTab2 extends BaseClass {

    @Test

    public void tabbing() throws InterruptedException {
        for(int i=1; i<=8; i++){
            clickByCss(".gwcswNavWrap tbody tr td:nth-child("+ i +")");
            Thread.sleep(3000);
        }
    }



}
