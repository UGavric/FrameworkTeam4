package home;

import BasePackage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by mchowdhury123 on 4/25/14.
 */
public class NavTab extends BaseClass{
    @Test
    public void test() throws InterruptedException {

        List<WebElement> navTabLinks = getWebEelementsByCss("#cnn_hdr-nav li");
        System.out.println(navTabLinks.size());
        for(int i=1; i<navTabLinks.size(); i++){
            if(i==1 || i==14 || i==15){
                navTabLinks.get(i).findElement(By.tagName("a")).click();
                navigateBack();

            }else{

                navTabLinks.get(i).findElement(By.tagName("a")).click();
                if(i==5|| i==6){
                    navTabLinks = getWebEelementsByCss("#cnn_hdr-nav li");
                    System.out.println("--------------------------- " +navTabLinks.get(i).getText()+" -----------------------------------------");
                    clickOnNews("#cnn_mtt1rgtarea .cnn_bulletbin");
                }
            }
            navTabLinks = getWebEelementsByCss("#cnn_hdr-nav li");
        }
    }

    public void clickOnNews(String locator){
        List<String> news = getListOfString(locator);
        for(String st:news){
            System.out.println(st);

        }
    }

}


