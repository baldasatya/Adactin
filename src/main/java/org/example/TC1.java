package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://183.82.103.245/nareshit/login.php");
        driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
        driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
        driver.findElement(By.name("Submit")).click();
        driver.switchTo().frame("rightMenu");

        WebElement table = driver.findElement(By.xpath("//*[@id=\"standardView\"]/table"));
        int rowCount = table.findElement(By.tagName("tbody"))
                .findElements(By.tagName("tr"))
                .size();

        System.out.println("Number of rows in the table: " + rowCount);
        for (int i = 1; i <= rowCount; i = i + 2) {
            driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr["+i+"]/td[1]/input")).click();



        }
    }
}
