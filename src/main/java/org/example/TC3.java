package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TC3 {
    public static void main(String[] args) {
        WebDriver d =new ChromeDriver();
        d.navigate().to("http://WWW.google.com");
        List<WebElement> Langs =d.findElements(By.xpath("//*[@id=\"SIvCob\"]/a"));
        int lang = Langs.size();
        for(int i =0;i<lang;i++){
            String A = Langs.get(i).getAttribute("href");
            String B = Langs.get(i).getText();
            System.out.println(B+"="+A);
        }
    }
}
