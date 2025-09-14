package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductDisplayPage {
	
	@Test(priority=1)
	public void verifyProductDisplayPageThumbnails() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("iMac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("iMac")).click();
		
		driver.findElement(By.xpath("//ul[@class='thumbnails']//a")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//figure")));
		
		Assert.assertTrue(driver.findElement(By.xpath("//figure")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//button[@title='Previous (Left arrow key)']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']")).isDisplayed());
		
		driver.findElement(By.xpath("//button[@title='Previous (Left arrow key)']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='3 of 3']")).isDisplayed());
		driver.findElement(By.xpath("//button[@title='Previous (Left arrow key)']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='2 of 3']")).isDisplayed());
		driver.findElement(By.xpath("//button[@title='Previous (Left arrow key)']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='1 of 3']")).isDisplayed());
		driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='2 of 3']")).isDisplayed());
		driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='3 of 3']")).isDisplayed());
		driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='1 of 3']")).isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='×']")).click();
		
		boolean b = false;
		
		try {
		  b = driver.findElement(By.xpath("//figure")).isDisplayed();
		}catch(NoSuchElementException e) {
			b = false;
		}
		
		Assert.assertFalse(b);
		
		driver.findElement(By.xpath("(//ul[@class='thumbnails']//a)[2]")).click();
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//figure")));
		
		Assert.assertTrue(driver.findElement(By.xpath("//figure")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//button[@title='Previous (Left arrow key)']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']")).isDisplayed());
		
		driver.findElement(By.xpath("//button[@title='Previous (Left arrow key)']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='1 of 3']")).isDisplayed());
		driver.findElement(By.xpath("//button[@title='Previous (Left arrow key)']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='3 of 3']")).isDisplayed());
		driver.findElement(By.xpath("//button[@title='Previous (Left arrow key)']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='2 of 3']")).isDisplayed());
		driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='3 of 3']")).isDisplayed());
		driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='1 of 3']")).isDisplayed());
		driver.findElement(By.xpath("//button[@title='Next (Right arrow key)']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='2 of 3']")).isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='×']")).click();
		
		b = false;
		
		try {
		  b = driver.findElement(By.xpath("//figure")).isDisplayed();
		}catch(NoSuchElementException e) {
			b = false;
		}
		
		Assert.assertFalse(b);
		
		driver.quit();
	}
	
	@Test(priority=2)
	public void verifyProductNameBrandCodeInProductDisplayPage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("iMac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("iMac")).click();		
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']//h1")).getText(),"iMac");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']//li[contains(text(),'Brand')]/a")).getText(),"Apple");
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']//li[contains(text(),'Product Code')]")).getText().contains("Product 14"));
	
		driver.quit();
	}
	
	@Test(priority=3)
	public void verifyAvailabilityStatusInProductDisplayPage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("iMac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("iMac")).click();		
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']//li[contains(text(),'Availability')]")).getText().contains("Out Of Stock"));
		
		driver.quit();
		
	}
	
	@Test(priority=4)
	public void verifyPriceWithAndWithoutTaxInProductDisplayPage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("iMac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("iMac")).click();		
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']//li/h2")).getText(),"$122.00");
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']//li[contains(text(),'Ex Tax')]")).getText().contains("$100.00"));
		
		driver.quit();
		
	}
	
	@Test(priority=5)
	public void verifyProductQuantityInProductDisplayPage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("iMac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("iMac")).click();		
		
		Assert.assertEquals(driver.findElement(By.name("quantity")).getAttribute("value"),"1");
		
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("2");
		
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-success alert-dismissible']")));
	
		driver.findElement(By.linkText("shopping cart")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='table-responsive']//input[contains(@name,'quantity')]")).getAttribute("value"),"2");
	
		driver.quit();
	
	}
	
	@Test(priority=6)
	public void verifyProductDescriptionInProductDisplayPage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("iMac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("iMac")).click();		
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='tab-description']/div")).getText().contains("Just when you thought iMac had everything, now there´s even more. More powerful Intel Core 2 Duo processors. And more memory standard. Combine this with Mac OS X Leopard and iLife ´08, and it´s more all-in-one than ever. iMac packs amazing performance into a stunningly slim space."));
		driver.quit();

	}
	
	@Test(priority=7)
	public void verifyProductSpecificationsInProductDisplayPage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("Apple Cinema 30\"");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("Apple Cinema 30\"")).click();		
		
		driver.findElement(By.linkText("Specification")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//table//td[text()='Clockspeed']/following-sibling::td")).getText(),"100mhz");
		
		driver.quit();
		
	}
	
	@Test(priority=8)
	public void verifyWritingReviewForAProduct() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("Apple Cinema 30\"");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("Apple Cinema 30\"")).click();		
		
		driver.findElement(By.xpath("//a[contains(text(),'Review')]")).click();
		
		driver.findElement(By.id("input-name")).sendKeys("Arun Motoori");
		
		String reviewText = "My name is Arun Motoori. I am reviewing this product. This product is very good.";
		
		driver.findElement(By.id("input-review")).sendKeys(reviewText);
		driver.findElement(By.xpath("//input[@value='5']")).click();
		driver.findElement(By.id("button-review")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-success alert-dismissible']")));
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText().contains("Thank you for your review. It has been submitted to the webmaster for approval."));
		
		driver.quit();
		
	}

}
