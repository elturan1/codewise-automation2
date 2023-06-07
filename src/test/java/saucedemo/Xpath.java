package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("problem_user");

        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("secret_sauce");

        WebElement logIn = driver.findElement(By.xpath("//*[@id='login-button']"));
        logIn.click();
        Thread.sleep(500);


        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[.='Add to cart']"));
        for(WebElement button: addToCartButtons){
            Thread.sleep(200);
            button.click();
        }

        WebElement cartNumber =driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        String itemQuantity = cartNumber.getText();

        int quantityInt = Integer.parseInt(itemQuantity);

        if (quantityInt == addToCartButtons.size()){
            System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }





    }
}
