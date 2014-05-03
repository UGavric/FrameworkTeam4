package BasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by mchowdhury123 on 4/25/14.
 */
public class BaseClass {

    public WebDriver driver = null;

    @Parameters({"browser","url"})
    @BeforeClass
//    public void setUp(boolean useSauceLabs,String userName,String key,String os, String browser,String browserVersion,
//                      String url) throws IOException{
//        if(useSauceLabs==true){
//            setUpSauce(userName,key,os,browser,browserVersion,url);
//        }else{ getDriver(browser,url);
//
//        }
//    }
//    //driver to run on SauceLabs
//    public void setUpSauce(String userName,String key,String os, String browser,String browserVersion,
//                           String url) throws IOException {
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setBrowserName(browser);
//        capabilities.setCapability("version", browserVersion);
//        capabilities.setCapability("platform", os);
//        this.driver = new RemoteWebDriver(
//                new URL("http://" + userName + ":" + key + "@ondemand.saucelabs.com:80/wd/hub"),
//                capabilities);
//        driver.navigate().to(url);
//        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }
    //driver to run on local
    public WebDriver getDriver(String browser,String url) {
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if(browser.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        } else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", System.setProperty("path","path"));
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("internetexplorer")){
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();

        return driver;
    }
    @AfterClass
    public void aftertest(){
        driver.close();
    }


    //UTILITY Methods for WebDriver

    //navigation
    public void navigateBack(){
        driver.navigate().back();
    }
    // clicking features
    public void clickById(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void clickByXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickByTagName(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void clickByCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void clicksByCss(String locator){
        driver.findElements(By.cssSelector(locator));
    }

    //get WebElements
    public WebElement getWebEelementByCss(String locator){
        WebElement element = driver.findElement(By.cssSelector(locator));
        return element;
    }
    public List<WebElement> getWebEelementsByCss(String locator1){
        List<WebElement> elementList = driver.findElements(By.cssSelector(locator1));

        return elementList;
    }

    public String getElementText(String locator){

        String st = getWebEelementByCss(locator).getText();

        return st;
    }

    //get text using WebElements
    public List<String> getListOfString(String locator1){
        List<WebElement> elementList = getWebEelementsByCss(locator1);
        List<String> list = new ArrayList<String>() ;
        for(WebElement element:elementList){
            list.add(element.getText());
        }
        return list;
    }


}
