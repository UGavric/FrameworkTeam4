package TestCases;

import BasePackage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by mchowdhury123 on 4/26/14.
 */
public class Login extends BaseClass{

    //This test is intended to find all elements in the page and select one that is of interest.
    //In this case, we will look for the "no, i am a new costumer" radio button, then click it if
    //it is not clicked.  However, we will then select the "i am an existing customer" radio button
    //in order to log in.

    @Test
    public void test() throws InterruptedException {
        clickByCss("#nav-your-amazon");
        List<WebElement> buttons = driver.findElements(By.cssSelector("#ap_signin1a_pagelet"));
        for(WebElement button:buttons){

            System.out.println("This is the text " + button.getText());

            Thread.sleep(3000);




            if((!driver.findElement(By.id("ap_signin_create_radio")).isSelected())){
                driver.findElement(By.id("ap_signin_create_radio")).click();
                System.out.println("the radio button is now selected");
            }

            clickByCss("#ap_signin_existing_radio");
            driver.findElement(By.id("ap_email")).sendKeys("sanitarydegree@gmail.com");
            driver.findElement(By.cssSelector("#ap_password")).sendKeys("peoplentech");
            clickByCss("#signInSubmit-input");

            Thread.sleep(2000);

//            break;


        Thread.sleep(5000);
    }
    }
}




//Set<String> listOfWindow = driver.getWindowHandles();
//Iterator it = listOfWindow.iterator();
//    String homeWindow = driver.getWindowHandle();
//    clickByXpath(".//*[@id='hdr-auth']/ul/li[2]/a");
//    listOfWindow = driver.getWindowHandles();
//    it = listOfWindow.iterator();
//    String popUpWindow1 = (String) it.next();
//    driver.switchTo().window(popUpWindow1);
//    clickByCss(".cnnOvrlyBtn.cnnBtnLogIn");
//    listOfWindow = driver.getWindowHandles();
//    it = listOfWindow.iterator();
//    String popUpWindow2 = (String) it.next();
//    driver.switchTo().window(popUpWindow2);
//    typeByCss("input#cnnOverlayEmail1l","motiurhmn@gmail.com");
//    typeByCss("input#cnnOverlayPwd","rahman2012");
//    clickByCss(".cnnOvrlyBtn.cnnBtnLogIn");
//    driver.switchTo().window(homeWindow);
//    Thread.sleep(3);
//}

