package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductCompare {
	
	@Test(priority=1)
	public void verifyAddingProductForComparisionFromProductDisplayPage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("iMac")).click();
		String actualToolTip = driver.findElement(By.cssSelector("button[onclick^='compare']")).getAttribute("data-original-title");
		Assert.assertEquals(actualToolTip,"Compare this Product");
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		String actualSuccessMessage = successMessageElement.getText();
		String expectedSuccessMessage = "Success: You have added "+productName+" to your product comparison!";
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage));
		driver.findElement(By.linkText("product comparison")).click();
		String pageHeading = driver.findElement(By.cssSelector("div[id='content'] > h1")).getText();
		Assert.assertEquals(pageHeading,"Product Comparison");
		String actualProduct = driver.findElement(By.xpath("//td[text()='Product']/following-sibling::td//strong")).getText();
		Assert.assertEquals(actualProduct,productName);
		driver.quit();
	
	}
	
	@Test(priority=2)
	public void verifyAddingProductForComparisonFromListView() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.id("list-view")).click();	
		String actualToolTip = driver.findElement(By.cssSelector("button[onclick^='compare']")).getAttribute("data-original-title");
		Assert.assertEquals(actualToolTip,"Compare this Product");
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		String actualSuccessMessage = successMessageElement.getText();
		String expectedSuccessMessage = "Success: You have added "+productName+" to your product comparison!";
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage));
		driver.findElement(By.linkText("product comparison")).click();
		String pageHeading = driver.findElement(By.cssSelector("div[id='content'] > h1")).getText();
		Assert.assertEquals(pageHeading,"Product Comparison");
		String actualProduct = driver.findElement(By.xpath("//td[text()='Product']/following-sibling::td//strong")).getText();
		Assert.assertEquals(actualProduct,productName);
		driver.quit();
		
	}
	
	@Test(priority = 3)
	public void verifyAddingProductForComparisonFromGridView() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.id("grid-view")).click();
		String actualToolTip = driver.findElement(By.cssSelector("button[onclick^='compare']")).getAttribute("data-original-title");
		Assert.assertEquals(actualToolTip,"Compare this Product");
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		String actualSuccessMessage = successMessageElement.getText();
		String expectedSuccessMessage = "Success: You have added "+productName+" to your product comparison!";
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage));
		driver.findElement(By.linkText("product comparison")).click();
		String pageHeading = driver.findElement(By.cssSelector("div[id='content'] > h1")).getText();
		Assert.assertEquals(pageHeading,"Product Comparison");
		String actualProduct = driver.findElement(By.xpath("//td[text()='Product']/following-sibling::td//strong")).getText();
		Assert.assertEquals(actualProduct,productName);
		driver.quit();
		
	}
	
	@Test(priority = 4)
	public void verifyAddingProductForComparisonFromProductCategoryListView() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Show AllDesktops")).click();
		driver.findElement(By.id("list-view")).click();	
		String actualToolTip = driver.findElement(By.cssSelector("button[onclick^='compare']")).getAttribute("data-original-title");
		Assert.assertEquals(actualToolTip,"Compare this Product");
		String productName = driver.findElement(By.xpath("//div[@class='product-thumb']//h4/a")).getText();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		String actualSuccessMessage = successMessageElement.getText();
		String expectedSuccessMessage = "Success: You have added "+productName+" to your product comparison!";
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage));
		driver.findElement(By.linkText("product comparison")).click();
		String pageHeading = driver.findElement(By.cssSelector("div[id='content'] > h1")).getText();
		Assert.assertEquals(pageHeading,"Product Comparison");
		String actualProduct = driver.findElement(By.xpath("//td[text()='Product']/following-sibling::td//strong")).getText();
		Assert.assertEquals(actualProduct,productName);
		driver.quit();
		
	}
	
	@Test(priority = 5)
	public void verifyAddingProductForComparisonFromProductCategoryGridView() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Show AllDesktops")).click();
		driver.findElement(By.id("grid-view")).click();	
		String actualToolTip = driver.findElement(By.cssSelector("button[onclick^='compare']")).getAttribute("data-original-title");
		Assert.assertEquals(actualToolTip,"Compare this Product");
		String productName = driver.findElement(By.xpath("//div[@class='product-thumb']//h4/a")).getText();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		String actualSuccessMessage = successMessageElement.getText();
		String expectedSuccessMessage = "Success: You have added "+productName+" to your product comparison!";
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage));
		driver.findElement(By.linkText("product comparison")).click();
		String pageHeading = driver.findElement(By.cssSelector("div[id='content'] > h1")).getText();
		Assert.assertEquals(pageHeading,"Product Comparison");
		String actualProduct = driver.findElement(By.xpath("//td[text()='Product']/following-sibling::td//strong")).getText();
		Assert.assertEquals(actualProduct,productName);
		driver.quit();
		
	}
	
	@Test(priority = 6)
	public void verifyAddingProductForComparisonFromRelatedProductsSection() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("iMac")).click();
		String actualToolTip = driver.findElement(By.xpath("(//button[contains(@onclick,'compare')])[2]")).getAttribute("data-original-title");
		Assert.assertEquals(actualToolTip,"Compare this Product");
		String relatedProductName = driver.findElement(By.xpath("//h3[text()='Related Products']/following-sibling::div//h4/a")).getText();
		driver.findElement(By.xpath("(//button[contains(@onclick,'compare')])[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		String actualSuccessMessage = successMessageElement.getText();
		String expectedSuccessMessage = "Success: You have added "+relatedProductName+" to your product comparison!";
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage));
		driver.findElement(By.linkText("product comparison")).click();
		String pageHeading = driver.findElement(By.cssSelector("div[id='content'] > h1")).getText();
		Assert.assertEquals(pageHeading,"Product Comparison");
		String actualProduct = driver.findElement(By.xpath("//td[text()='Product']/following-sibling::td//strong")).getText();
		Assert.assertEquals(actualProduct,relatedProductName);
		driver.quit();
		
	}
	
	@Test(priority = 7)
	public void verifyAddingProductForComparisonFromFeaturedSectionOfHomePage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String actualToolTip = driver.findElement(By.cssSelector("button[onclick^='compare']")).getAttribute("data-original-title");
		Assert.assertEquals(actualToolTip,"Compare this Product");
		String productName = driver.findElement(By.xpath("//h3[text()='Featured']/following-sibling::div//h4/a")).getText();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		String actualSuccessMessage = successMessageElement.getText();
		String expectedSuccessMessage = "Success: You have added "+productName+" to your product comparison!";
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage));
		driver.findElement(By.linkText("product comparison")).click();
		String pageHeading = driver.findElement(By.cssSelector("div[id='content'] > h1")).getText();
		Assert.assertEquals(pageHeading,"Product Comparison");
		String actualProduct = driver.findElement(By.xpath("//td[text()='Product']/following-sibling::td//strong")).getText();
		Assert.assertEquals(actualProduct,productName);
		driver.quit();
		
	}
	
	@Test(priority = 8)
	public void verifyNavigatingToProductComparePageUsingProductCompareLinkInSearchResults() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.id("compare-total")).click();
		String pageHeading = driver.findElement(By.cssSelector("div[id='content'] > h1")).getText();
		Assert.assertEquals(pageHeading,"Product Comparison");
		driver.quit();
		
	}
	
	@Test(priority = 9)
	public void verifyNavigatingToProductComparePageUsingProductCompareLinkInCategoryPage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Show AllDesktops")).click();
		driver.findElement(By.id("compare-total")).click();
		String pageHeading = driver.findElement(By.cssSelector("div[id='content'] > h1")).getText();
		Assert.assertEquals(pageHeading,"Product Comparison");
		driver.quit();
		
	}
	
	@Test(priority = 10)
	public void verifyProductComparePageWhenNoProductAreAddedForComparison() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Show AllDesktops")).click();
		driver.findElement(By.id("compare-total")).click();
		String noProductMessage = driver.findElement(By.xpath("//div[@id='content']/p")).getText();
		Assert.assertEquals(noProductMessage,"You have not chosen any products to compare.");
		driver.quit();
		
	}
	
	@Test(priority = 11)
	public void verifyContinueButtonOnProductComparePage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Show AllDesktops")).click();
		driver.findElement(By.id("compare-total")).click();
		driver.findElement(By.linkText("Continue")).click();
		Assert.assertEquals(driver.getTitle(),"Your Store");
		driver.quit();
		
	}
	
	@Test(priority = 12)
	public void verifyBreadCrumbOfProductComparePage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Show AllDesktops")).click();
		driver.findElement(By.id("compare-total")).click();
		driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Product Comparison']")).click();
		Assert.assertEquals(driver.getTitle(),"Product Comparison");
		driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[contains(@href,'home')]")).click();
		Assert.assertEquals(driver.getTitle(),"Your Store");
		driver.quit();
		
	}
	
	
	

}
