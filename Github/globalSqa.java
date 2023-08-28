package com.selenium.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class globalSqa {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nganganagoudar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	 //chrome permission
		 ChromeOptions co=new ChromeOptions();
        co.setBinary("C:\\Users\\nganganagoudar\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver=new ChromeDriver(co);
        //opening globalsqa
        driver.navigate().to("https://www.globalsqa.com/");
         driver.findElement(By.name("s")).sendKeys("Selenium",Keys.ENTER);
         
         //maximizing the screen
          driver.manage().window().maximize();
          
          //clicking on search box and finding selenium
          driver.findElement(By.xpath("//*[@id=\"s\"]")).click();
        Thread.sleep(5000);
        
        //clicking introduction to selenium webdriver
       // driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[2]/div/div[2]/ol/li[2]/div/h3/a")).click();
      
        //clicking tester's hub
        driver.findElement(By.xpath("//*[@id=\"menu-item-2822\"]/a")).click();
        
        
//        WebElement testershub =driver.findElement(By.xpath("//*[@id=\"menu-item-6898\"]/a"));                
//        String valuesoftestershub = testershub.getAttribute("maxlength");
        String s= driver.findElement(By.cssSelector("#wrapper > div.content_bgr > div.full_container_page_title > div > div > div > div.page_heading > h1")).getText();
        System.out.println(s);
        
        
      
	}

}
