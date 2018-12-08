package com.ibm.seleniumconcepts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SeleniumBrowser {

	public static void main(String[] args) throws InterruptedException {
/** 
    
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	WebDriver driver =new ChromeDriver();	
	driver.get("https://magento.com/");
	
	
  	//title
 
	String title = driver.getTitle();
	System.out.println("Title of the page = "+title);
	
	//current url
	String url = driver.getCurrentUrl();
	System.out.println("Current page url = "+url);
	
	if (title.equals("eCommerce Platform | Best eCommerce Software for Selling Online | Magento"))
	{
		System.out.println("Test Case passed!!!");
	}
	else
	{
		System.out.println("Test Case failed!");
	}
	
		
	String pageSource = driver.getPageSource();
	
	System.out.println(pageSource);
	
	if (pageSource.contains("Built for Flexibility"))
	{
		System.out.println("Test case passed");
	}
	else
	{
		System.out.println("Test case failed");
	}
	
*/
	
		/**
		 //Using implicit wait
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		WebDriver driver =new ChromeDriver();	
		WebDriverWait wait=new WebDriverWait(driver, 60);//60, 90
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//30,40,50
		
		driver.get("https://magento.com/");
	

		WebElement myAccountEle= driver.findElement(By.linkText("My Account"));		
		myAccountEle.click();
		
		Thread.sleep(10000);
		
		WebElement emailEle= driver.findElement(By.id("email"));
		emailEle.sendKeys("december18.mn@gmail.com");
		
		WebElement passEle= driver.findElement(By.name("login[password]"));
		passEle.sendKeys("Mn710265");
		
		WebElement loginEle= driver.findElement(By.id("send2"));
		loginEle.click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Out")));
		
		String title= driver.getTitle();
		System.out.println(title);
		
		WebElement logOutEle= driver.findElement(By.partialLinkText("Out"));
		logOutEle.click();
		
	}
}
*/
//Using implicit wait and explicit wait
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		WebDriver driver =new ChromeDriver();	
		WebDriverWait wait=new WebDriverWait(driver, 60);//60, 90
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//30,40,50
		
		driver.get("https://magento.com/");	

		
		WebElement myAccountEle= driver.findElement(By.xpath("//span[text()='Account']/ancestor::a"));
		myAccountEle.click();
		
		/**WebElement emailEle= driver.findElement(By.xpath("//input[@title='Email']"));
		emailEle.sendKeys("december18.mn@gmail.com");
		
		WebElement passEle= driver.findElement(By.xpath("//input[@id='pass']"));
		passEle.sendKeys("Mn710265");*/
		
		WebElement loginEle= driver.findElement(By.xpath("//button[@type='button']"));
		loginEle.click();
		
		/**WebElement registerEle= driver.findElement(By.xpath("//button[@type='button']"));
		registerEle.click();*/
		
		WebElement firstName= driver.findElement(By.xpath("//input[@title='First Name']"));
		firstName.sendKeys("Manjunath");
		
		WebElement lastName= driver.findElement(By.xpath("//input[@title='Last Name']"));
		lastName.sendKeys("N R");
		
		WebElement emailEle= driver.findElement(By.xpath("//input[@title='Email Address']"));
		emailEle.sendKeys("manjunar@!in.ibm.com");
		
		WebElement passWord= driver.findElement(By.xpath("//input[@title='Password']"));
		passWord.sendKeys("Mn710265");
		
		WebElement confirmPassword= driver.findElement(By.xpath("//input[@title='Confirm Password']"));
		confirmPassword.sendKeys("Mn710265");
		
		/**wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Log Out']")));
		
		String title= driver.getTitle();
		System.out.println(title);
		
		WebElement logOutEle= driver.findElement(By.xpath("//a[text()='Log Out']"));
		logOutEle.click();*/
		
		System.out.println("Entered details for new registration, except dropdowns, captcha and submit button");
		
	}
}
