package POM;

import Utility.BaseClass;
import org.openqa.selenium.By;

public class login extends BaseClass {

    public static void titleFetch() throws InterruptedException {
        String title=driver().getTitle();
        System.out.println("Title of the page: "+title);
        Thread.sleep(2000);
    }
    public static void hitUrl(){
        driver().get(config.getProperty("URL"));
    }
    public static void signIn(){
        driver().findElement(By.xpath(locators.getProperty("testLogin"))).click();
    }
    public static void enterCredentials(String username,String password){
        driver().findElement(By.xpath(locators.getProperty("username"))).sendKeys(username);
        System.out.println("Username entered: "+username);
        driver().findElement(By.xpath(locators.getProperty("password"))).sendKeys(password);
        System.out.println("password entered: "+password);
        driver().findElement(By.xpath(locators.getProperty("submit"))).click();
    }

}
