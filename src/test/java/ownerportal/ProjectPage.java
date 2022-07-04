package ownerportal;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import projectbased.base;

public class ProjectPage extends base{
	@Test
	public void createproject() throws IOException, InterruptedException {
		
		driver=initializedriver();
		driver.get("https://dev.productively.app/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mukul@futureapp.in");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mukul@13");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		AssertJUnit.assertEquals(driver.findElement(By.tagName("h4")).getText(), "Start Tracking Time");
		System.out.println(driver.findElement(By.tagName("h4")).getText());
		Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[text()='Clients']")).click();
		  Thread.sleep(2000);
		 //click on add client button
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         Thread.sleep(2000);
        //send name
         driver.findElement(By.xpath("//input[@name='name']")).sendKeys("client-1");
         Thread.sleep(2000);
        //send address
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("gota");
        Thread.sleep(2000);
        //contact name
        driver.findElement(By.xpath("//input[@name='contact_name']")).sendKeys("mrai");
        Thread.sleep(2000);
        //email
         driver.findElement(By.xpath("//input[@name='contact_email']")).sendKeys("abc@gmail.com");
         Thread.sleep(2000);
        //select currency
         driver.findElement(By.xpath("//mat-select[@formcontrolname='currency']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//span[text()=' INR ']")).click();
         Thread.sleep(2000);
        //number
        // await driver.findElement(By.xpath("//input[@name='contact_number']")).sendKeys(8764128989);
        // await driver.sleep(2000);
        //hourely rate
         driver.findElement(By.xpath("//input[@name='hourly_rate']")).sendKeys("2");
         Thread.sleep(2000);
        //click on create button
         driver.findElement(By.xpath("//span[text()='Create']")).click();
         Thread.sleep(2000);
	}
//	@Test
//	public void createclient(WebDriver driver) throws InterruptedException {
//		  driver.findElement(By.xpath("//a[text()='Clients']")).click();
//		  Thread.sleep(2000);
//		 //click on add client button
//         driver.findElement(By.xpath("//button[@type='submit']")).click();
//         Thread.sleep(2000);
//        //send name
//         driver.findElement(By.xpath("//input[@name='name']")).sendKeys("client-1");
//         Thread.sleep(2000);
//        //send address
//        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("gota");
//        Thread.sleep(2000);
//        //contact name
//        driver.findElement(By.xpath("//input[@name='contact_name']")).sendKeys("mrai");
//        Thread.sleep(2000);
//        //email
//         driver.findElement(By.xpath("//input[@name='contact_email']")).sendKeys("abc@gmail.com");
//         Thread.sleep(2000);
//        //select currency
//         driver.findElement(By.xpath("//mat-select[@formcontrolname='currency']")).click();
//         Thread.sleep(2000);
//         driver.findElement(By.xpath("//span[text()=' INR ']")).click();
//         Thread.sleep(2000);
//        //number
//        // await driver.findElement(By.xpath("//input[@name='contact_number']")).sendKeys(8764128989);
//        // await driver.sleep(2000);
//        //hourely rate
//         driver.findElement(By.xpath("//input[@name='hourly_rate']")).sendKeys("2");
//         Thread.sleep(2000);
//        //click on create button
//         driver.findElement(By.xpath("//span[text()='Create']")).click();
//         Thread.sleep(2000);
//	}
	}


