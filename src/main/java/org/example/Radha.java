package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Radha {
        public static void main (String args[]) throws Exception{
            WebDriver driver;
            driver = new ChromeDriver();
            driver.navigate().to("http://183.82.103.245/nareshit/index.php");

            System.out.println("URL open");
            System.out.println(driver.getTitle());
            driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
//driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
            Thread.sleep(5000);
            driver.findElement(By.name("Submit")).click();
            System.out.println("login completed");
            Alert a;
            a = driver.switchTo().alert();
            a.accept();
            driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
            driver.findElement(By.name("Submit")).click();
            driver.switchTo().frame("rightMenu");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@value='Add']")).click();
            Thread.sleep(4000);
            driver.findElement(By.name("txtEmpLastName")).sendKeys("Chilke");
            driver.findElement(By.name("txtEmpFirstName")).sendKeys("Radha");
            driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Subhash");
            driver.findElement(By.name("txtEmpNickName")).sendKeys("Kamini");
            driver.findElement(By.id("photofile")).sendKeys("Downloads\\photo.jpg");
            Thread.sleep(4000);
            driver.findElement(By.id("btnEdit")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//input[@onclick='goBack()']")).click();
            Thread.sleep(4000);
            driver.switchTo().defaultContent();
            System.out.println("exit from frame completed");
            driver.findElement(By.partialLinkText("Logout")).click();
            Thread.sleep(4000);

            driver.close();

        }
    }

