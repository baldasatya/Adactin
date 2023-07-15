package org.example;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver WD = new ChromeDriver();
        WD.navigate().to("http://183.82.103.245/nareshit/login.php");
        WD.findElement(By.name("txtUserName")).sendKeys("nareshit");
        WD.findElement(By.name("txtPassword")).sendKeys("nareshit");
        WD.findElement(By.name("Submit")).click();
        Thread.sleep(3000);
        WD.switchTo().frame("rightMenu");
        WD.findElement(By.name("loc_code")).click();
        WebElement drpdwn = WD.findElement(By.xpath("//*[@id=\"loc_code\"]"));
        int r = drpdwn.findElements(By.xpath("//*[@id=\"loc_code\"]/option")).size();
        System.out.println(r);
        for (int i = 1; i < r; i++) {
            String A = WD.findElement(By.xpath("//*[@id=\"loc_code\"]/option[" + i + "]")).getText();
            System.out.println(A);

        }
        WD.switchTo().defaultContent();
        WD.findElement(By.linkText("Logout")).click();
        WD.close();
    }
}