package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excell {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://183.82.103.245/nareshit/login.php");
        driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
        driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
        driver.findElement(By.name("Submit"));
        

    }
}
