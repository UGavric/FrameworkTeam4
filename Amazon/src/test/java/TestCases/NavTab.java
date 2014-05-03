package TestCases;

import BasePackage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by mchowdhury123 on 4/25/14.
 */
public class NavTab extends BaseClass {

    @Test

    public void miad(){
       List<WebElement> tabs = driver.findElements(By.cssSelector("#nav-cross-shop-links a"));
        for(WebElement tab:tabs){
            System.out.println(tab.getText());
            System.out.println(tab.getAttribute("href"));
            System.out.println(tab.getSize());

        }
        for(int i=1; i<=tabs.size(); i++){
            clickByCss("#nav-cross-shop-links a:nth-child("+ i +")");
            navigateBack();

            if(i==1){
                navigateBack();
            }
            else{
                continue;
            }

        }



    }


    }

