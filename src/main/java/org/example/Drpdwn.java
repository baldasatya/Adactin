package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Drpdwn {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver WD = new ChromeDriver();
        WD.navigate().to("http://183.82.103.245/nareshit/login.php");
        Thread.sleep(300);
        WD.findElement(By.name("txtUserName")).sendKeys("nareshit");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        WD.findElement(By.name("txtPassword")).sendKeys("nareshit");
        WD.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WD.switchTo().frame("rightMenu");
        WD.findElement(By.xpath("//input[@value='Add']")).click();
        WD.findElement(By.id("txtEmpLastName")).sendKeys("Hrudhay");
        WD.findElement(By.name("txtEmpFirstName")).sendKeys("Balda");
        WD.findElement(By.id("photofile")).sendKeys("C:\\Users\\Admin\\Downloads\\photo.jpg");
        WD.findElement(By.className("savebutton")).click();
        WD.findElement(By.className("editbutton")).click();
        WD.findElement(By.className("savebutton")).click();
        WD.findElement(By.className("backbutton")).click();
        Thread.sleep(3000);
        WD.switchTo().defaultContent();
        WD.findElement(By.linkText("Logout")).click();
        Thread.sleep(2000);
        WD .get("file:///C:/Users/Admin/Downloads/multiplewindows.html");
        ArrayList<String> wind = new ArrayList<>(WD.getWindowHandles());

        WebDriver ND= new ChromeDriver();
        ND.findElement(By.id("btn1")).click();
        Thread.sleep(2000);
        ND.findElement(By.id("btn2")).click();
        ND.findElement(By.id("btn3")).click();
//        Thread.sleep(2000);
        ND.switchTo().window(wind.get(0));
//        Thread.sleep(2000);
        ND.switchTo().window(wind.get(1));
//        Thread.sleep(2000);
        ND.switchTo().window(wind.get(2));




    }
}
