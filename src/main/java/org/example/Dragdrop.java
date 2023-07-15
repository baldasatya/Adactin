package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dragdrop {
    public static void main(String[] args) {
        WebDriver wb = new ChromeDriver();
        wb.navigate().to("https://jqueryui.com/droppable/&quot");

    }
}
