package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


import java.io.File;

public class Screenshot {
    public static void main(String[] args) throws Exception {

            WebDriver web = new ChromeDriver();
            try{
                web.navigate().to("http://183.82.103.245/nareshit/login.php");
            web.findElement(By.name("txtUserName")).sendKeys("nareshit");
            web.findElement(By.name("txtPassword")).sendKeys("nareshit");
            web.findElement(By.name("Submit")).click();
            web.switchTo().frame("rightMenu");

            WebElement table = web.findElement(By.xpath("//*[@id=\"standardView\"]/table"));
            int rowCount = table.findElement(By.tagName("tbody"))
                    .findElements(By.tagName("tr"))
                    .size();

            System.out.println("Number of rows in the table: " + rowCount);
            for (int i = 1; i <= rowCount; i = i + 2) {
                web.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[" + i + "]/td[1]/input")).click();

            }
        }
        catch (Exception e){
            File f1=((TakesScreenshot)web).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(f1,new File("E:\\Testing\\PROJECT$$$\\HRMS\\ScreenShot\\result.png") );

        }
            web.quit();
    }

}
