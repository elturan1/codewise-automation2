package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CashWise {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cashwise.us");
        System.out.println(driver.getTitle());
        driver.manage().window().fullscreen();
        String expectedCashWiseTittle = "Cashwise is best!";
        String expectedCashWiseURL = "https://cashwise.us";

        if(driver.getTitle().equals(expectedCashWiseTittle)){
            System.out.println("Cashwise title passed");
        }
        else{
            System.out.println("Cashwise title  failed");
        }
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        if( driver.getCurrentUrl().equals(expectedCashWiseURL)){
            System.out.println("Cashwise url passed");
        }
        else {
            System.out.println("Cashwise url failed");
        }
        System.out.println(driver.getPageSource());



    }
}
