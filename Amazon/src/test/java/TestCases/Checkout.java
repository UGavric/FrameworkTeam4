package TestCases;

import BasePackage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.List;

/**
 * Created by mchowdhury123 on 4/26/14.
 */
public class Checkout extends BaseClass{

    @Test
    public void Login() throws InterruptedException {
    driver.findElement(By.cssSelector("#nav-your-amazon")).click();
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



    }
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Microwave", Keys.ENTER);
        List<WebElement> results = driver.findElements(By.cssSelector("#atfResults"));
        for(WebElement result:results){
            System.out.println(result.getText());
            System.out.println(result.getAttribute("href"));
        }


             driver.findElement(By.cssSelector("#nav-cart-count")).click();



        Thread.sleep(3000);

    }
}
