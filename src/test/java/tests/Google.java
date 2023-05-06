package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        if(driver.getTitle().equals("Hi Google")){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }
        driver.navigate().to("https://amazon.com");
        System.out.println(driver.getTitle());
        if(driver.getTitle().equals("Hey Amazon!")){
            System.out.println("passed");
        }
        else {
            System.out.println("failed");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();


    }
}
