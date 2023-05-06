package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionClass {
    public static void main(String[] args)  throws InterruptedException {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        String url = "https://www.saucedemo.com/";
        chromeDriver.get(url);

       WebElement usernanameInput = chromeDriver.findElement(By.xpath("//input[@id='user-name']"));
       usernanameInput.click();
       usernanameInput.sendKeys("standard_user");
       Thread.sleep(5000);

        WebElement passwordInput = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.click();
      passwordInput.sendKeys("secret_sauce");
        Thread.sleep(5000);

        WebElement webElement = chromeDriver.findElement((By.xpath("//input[@name='login-button']")));
        webElement.click();

        Thread.sleep(5000);

        chromeDriver.close();

    }
}
