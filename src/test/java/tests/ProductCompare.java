package tests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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
	
	@Test(priority=13)
	public void verifyProductCompareSuccessMessage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("iMac")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		String actualSuccessMessage = successMessageElement.getText();
		String expectedSuccessMessage = "Success: You have added "+productName+" to your product comparison!";
		Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage));
		String xpathText = "//div[@class='alert alert-success alert-dismissible']//a[text()='"+productName+"']";
		driver.findElement(By.xpath(xpathText)).click();
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle,productName);
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		driver.findElement(By.linkText("product comparison")).click();
		actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle,"Product Comparison");
		driver.quit();
		
	}
	
	@Test(priority=14)
	public void verifyProductComparisonPageWhenOnlyOneProductIsAddedForComparison() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("iMac")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		driver.findElement(By.linkText("product comparison")).click();
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle,"Product Comparison");
		int acutalProductCount = driver.findElements(By.xpath("//td[text()='Product']/following-sibling::td")).size();
		Assert.assertEquals(acutalProductCount,1);
		String xpathText = "//td[text()='Product']/following-sibling::td/a/strong[text()='"+productName+"']";
		Assert.assertTrue(driver.findElement(By.xpath(xpathText)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Image']/following-sibling::td/img")).isDisplayed());
		String expectedPrice = "$122.00";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Price']/following-sibling::td")).getText(), expectedPrice);
		String expectedProductModel = "Product 14";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Model']/following-sibling::td")).getText(), expectedProductModel);
		String expectedBrand = "Apple";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Brand']/following-sibling::td")).getText(), expectedBrand);
		String expectedAvailability = "Out Of Stock";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Availability']/following-sibling::td")).getText(), expectedAvailability);
		int actualRatingsSize = driver.findElements(By.xpath("//td[text()='Rating']/following-sibling::td/span")).size();
		Assert.assertEquals(actualRatingsSize,5);
		String expectedSummary = "Just when you thought iMac had everything, now there´s even more. More powerful Intel Core 2 Duo processors. And more memory standard. Combine this with Mac OS X Leopard and iLife ´08, and it´s mor..";
		String actualSummary = driver.findElement(By.xpath("//td[text()='Summary']/following-sibling::td")).getText();
		Assert.assertTrue(actualSummary.contains(expectedSummary));
		String expectedWait = "5.00kg";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td")).getText(), expectedWait);
		String expectedDimensions = "0.00cm x0.00cm x0.00cm";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Dimensions (L x W x H)']/following-sibling::td")).getText(), expectedDimensions);
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Add to Cart']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.linkText("Remove")).isDisplayed());
		driver.quit();
	
	}
	
	@Test(priority=15)
	public void verifyProductComparisonPageWhenOnlyTwoProductsAreAddedForComparison() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameTwo = "iPhone";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameTwo);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		driver.findElement(By.linkText("product comparison")).click();
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle,"Product Comparison");
		int acutalProductCount = driver.findElements(By.xpath("//td[text()='Product']/following-sibling::td")).size();
		Assert.assertEquals(acutalProductCount,2);
		String xpathText = "//td[text()='Product']/following-sibling::td/a/strong[text()='"+productName+"']";
		Assert.assertTrue(driver.findElement(By.xpath(xpathText)).isDisplayed());
		String xpathTextTwo = "//td[text()='Product']/following-sibling::td/a/strong[text()='"+productNameTwo+"']";
		Assert.assertTrue(driver.findElement(By.xpath(xpathTextTwo)).isDisplayed());
		int actualImageCount = driver.findElements(By.xpath("//td[text()='Image']/following-sibling::td/img")).size();
		Assert.assertEquals(actualImageCount,2);
		String expectedPriceOne = "$122.00";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Price']/following-sibling::td[1]")).getText(), expectedPriceOne);
		String expectedPriceTwo = "$123.20";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Price']/following-sibling::td[2]")).getText(), expectedPriceTwo);
		String expectedProductModelOne = "Product 14";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Model']/following-sibling::td[1]")).getText(), expectedProductModelOne);
		String expectedProductModelTwo = "product 11";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Model']/following-sibling::td[2]")).getText(), expectedProductModelTwo);
		String expectedBrandOne = "Apple";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Brand']/following-sibling::td[1]")).getText(), expectedBrandOne);
		String expectedBrandTwo = "Apple";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Brand']/following-sibling::td[2]")).getText(), expectedBrandTwo);
		String expectedAvailabilityOne = "Out Of Stock";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Availability']/following-sibling::td[1]")).getText(), expectedAvailabilityOne);
		String expectedAvailabilityTwo = "Out Of Stock";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Availability']/following-sibling::td[2]")).getText(), expectedAvailabilityTwo);
		int actualRatingsSizeOne = driver.findElements(By.xpath("//td[text()='Rating']/following-sibling::td[1]/span")).size();
		Assert.assertEquals(actualRatingsSizeOne,5);
		int actualRatingsSizeTwo = driver.findElements(By.xpath("//td[text()='Rating']/following-sibling::td[2]/span")).size();
		Assert.assertEquals(actualRatingsSizeTwo,5);
		
		String expectedSummaryOne = "Just when you thought iMac had everything, now there´s even more. More powerful Intel Core 2 Duo processors. And more memory standard. Combine this with Mac OS X Leopard and iLife ´08, and it´s mor..";
		String actualSummaryOne = driver.findElement(By.xpath("//td[text()='Summary']/following-sibling::td[1]")).getText();
		Assert.assertTrue(actualSummaryOne.contains(expectedSummaryOne));
		
		String expectedSummaryTwo = "iPhone is a revolutionary new mobile phone that allows you to make a call by simply tapping a name or number in your address book, a favorites list, or a call log. It also automatically syncs all y..";
		String actualSummaryTwo = driver.findElement(By.xpath("//td[text()='Summary']/following-sibling::td[2]")).getText();
		Assert.assertTrue(actualSummaryTwo.contains(expectedSummaryTwo));
		
		String expectedWaitOne = "5.00kg";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td[1]")).getText(), expectedWaitOne);
		
		String expectedWaitTwo = "10.00kg";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td[2]")).getText(), expectedWaitTwo);
		
		String expectedDimensionsOne = "0.00cm x0.00cm x0.00cm";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Dimensions (L x W x H)']/following-sibling::td[1]")).getText(), expectedDimensionsOne);
		
		String expectedDimensionsTwo = "0.00cm x0.00cm x0.00cm";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Dimensions (L x W x H)']/following-sibling::td[2]")).getText(), expectedDimensionsTwo);
		
		Assert.assertTrue(driver.findElements(By.xpath("//input[@value='Add to Cart']")).size()==2);
		Assert.assertTrue(driver.findElements(By.linkText("Remove")).size()==2);
		
		driver.quit();
		
	}
	
	@Test(priority=16)
	public void verifySameProductAddedForComparisonTwice() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		driver.findElement(By.linkText("product comparison")).click();
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle,"Product Comparison");
		int acutalProductCount = driver.findElements(By.xpath("//td[text()='Product']/following-sibling::td")).size();
		Assert.assertEquals(acutalProductCount,1);
		String xpathText = "//td[text()='Product']/following-sibling::td/a/strong[text()='"+productName+"']";
		Assert.assertTrue(driver.findElement(By.xpath(xpathText)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Image']/following-sibling::td/img")).isDisplayed());
		String expectedPrice = "$122.00";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Price']/following-sibling::td")).getText(), expectedPrice);
		String expectedProductModel = "Product 14";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Model']/following-sibling::td")).getText(), expectedProductModel);
		String expectedBrand = "Apple";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Brand']/following-sibling::td")).getText(), expectedBrand);
		String expectedAvailability = "Out Of Stock";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Availability']/following-sibling::td")).getText(), expectedAvailability);
		int actualRatingsSize = driver.findElements(By.xpath("//td[text()='Rating']/following-sibling::td/span")).size();
		Assert.assertEquals(actualRatingsSize,5);
		String expectedSummary = "Just when you thought iMac had everything, now there´s even more. More powerful Intel Core 2 Duo processors. And more memory standard. Combine this with Mac OS X Leopard and iLife ´08, and it´s mor..";
		String actualSummary = driver.findElement(By.xpath("//td[text()='Summary']/following-sibling::td")).getText();
		Assert.assertTrue(actualSummary.contains(expectedSummary));
		String expectedWait = "5.00kg";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td")).getText(), expectedWait);
		String expectedDimensions = "0.00cm x0.00cm x0.00cm";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Dimensions (L x W x H)']/following-sibling::td")).getText(), expectedDimensions);
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Add to Cart']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.linkText("Remove")).isDisplayed());
		driver.quit();
		
	}
	
	@Test(priority=17)
	public void verifyProductComparisonPageWhenOnlyThreeProductsAreAddedForComparison() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameTwo = "iPhone";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameTwo);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameThree = "MacBook Air";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameThree);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		driver.findElement(By.linkText("product comparison")).click();
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle,"Product Comparison");
		
		int acutalProductCount = driver.findElements(By.xpath("//td[text()='Product']/following-sibling::td")).size();
		Assert.assertEquals(acutalProductCount,3);
		
		String xpathText = "//td[text()='Product']/following-sibling::td/a/strong[text()='"+productName+"']";
		Assert.assertTrue(driver.findElement(By.xpath(xpathText)).isDisplayed());
		String xpathTextTwo = "//td[text()='Product']/following-sibling::td/a/strong[text()='"+productNameTwo+"']";
		Assert.assertTrue(driver.findElement(By.xpath(xpathTextTwo)).isDisplayed());
		String xpathTextThree = "//td[text()='Product']/following-sibling::td/a/strong[text()='"+productNameThree+"']";
		Assert.assertTrue(driver.findElement(By.xpath(xpathTextThree)).isDisplayed());
		
		int actualImageCount = driver.findElements(By.xpath("//td[text()='Image']/following-sibling::td/img")).size();
		Assert.assertEquals(actualImageCount,3);
		
		String expectedPriceOne = "$122.00";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Price']/following-sibling::td[1]")).getText(), expectedPriceOne);
		String expectedPriceTwo = "$123.20";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Price']/following-sibling::td[2]")).getText(), expectedPriceTwo);
		String expectedPriceThree = "$1,202.00";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Price']/following-sibling::td[3]")).getText(), expectedPriceThree);
		
		String expectedProductModelOne = "Product 14";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Model']/following-sibling::td[1]")).getText(), expectedProductModelOne);
		String expectedProductModelTwo = "product 11";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Model']/following-sibling::td[2]")).getText(), expectedProductModelTwo);
		String expectedProductModelThree = "Product 17";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Model']/following-sibling::td[3]")).getText(), expectedProductModelThree);
		
		String expectedBrandOne = "Apple";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Brand']/following-sibling::td[1]")).getText(), expectedBrandOne);
		String expectedBrandTwo = "Apple";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Brand']/following-sibling::td[2]")).getText(), expectedBrandTwo);
		String expectedBrandThree = "Apple";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Brand']/following-sibling::td[3]")).getText(), expectedBrandThree);
		
		String expectedAvailabilityOne = "Out Of Stock";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Availability']/following-sibling::td[1]")).getText(), expectedAvailabilityOne);
		String expectedAvailabilityTwo = "Out Of Stock";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Availability']/following-sibling::td[2]")).getText(), expectedAvailabilityTwo);
		String expectedAvailabilityThree = "Out Of Stock";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Availability']/following-sibling::td[3]")).getText(), expectedAvailabilityThree);
		
		int actualRatingsSizeOne = driver.findElements(By.xpath("//td[text()='Rating']/following-sibling::td[1]/span")).size();
		Assert.assertEquals(actualRatingsSizeOne,5);
		int actualRatingsSizeTwo = driver.findElements(By.xpath("//td[text()='Rating']/following-sibling::td[2]/span")).size();
		Assert.assertEquals(actualRatingsSizeTwo,5);
		int actualRatingsSizeThree = driver.findElements(By.xpath("//td[text()='Rating']/following-sibling::td[3]/span")).size();
		Assert.assertEquals(actualRatingsSizeThree,5);
		
		String expectedSummaryOne = "Just when you thought iMac had everything, now there´s even more. More powerful Intel Core 2 Duo processors. And more memory standard. Combine this with Mac OS X Leopard and iLife ´08, and it´s mor..";
		String actualSummaryOne = driver.findElement(By.xpath("//td[text()='Summary']/following-sibling::td[1]")).getText();
		Assert.assertTrue(actualSummaryOne.contains(expectedSummaryOne));
		
		String expectedSummaryTwo = "iPhone is a revolutionary new mobile phone that allows you to make a call by simply tapping a name or number in your address book, a favorites list, or a call log. It also automatically syncs all y..";
		String actualSummaryTwo = driver.findElement(By.xpath("//td[text()='Summary']/following-sibling::td[2]")).getText();
		Assert.assertTrue(actualSummaryTwo.contains(expectedSummaryTwo));
		
		String expectedSummaryThree = "MacBook Air is ultrathin, ultraportable, and ultra unlike anything else. But you don’t lose inches and pounds overnight. It’s the result of rethinking conventions. Of multiple wireless ..";
		String actualSummaryThree = driver.findElement(By.xpath("//td[text()='Summary']/following-sibling::td[3]")).getText();
		Assert.assertTrue(actualSummaryThree.contains(expectedSummaryThree));
		
		String expectedWaitOne = "5.00kg";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td[1]")).getText(), expectedWaitOne);
		
		String expectedWaitTwo = "10.00kg";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td[2]")).getText(), expectedWaitTwo);
		
		String expectedWaitThree = "0.00kg";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td[3]")).getText(), expectedWaitThree);
		
		String expectedDimensionsOne = "0.00cm x0.00cm x0.00cm";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Dimensions (L x W x H)']/following-sibling::td[1]")).getText(), expectedDimensionsOne);
		
		String expectedDimensionsTwo = "0.00cm x0.00cm x0.00cm";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Dimensions (L x W x H)']/following-sibling::td[2]")).getText(), expectedDimensionsTwo);
		
		String expectedDimensionsThree = "0.00mm x0.00mm x0.00mm";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Dimensions (L x W x H)']/following-sibling::td[3]")).getText(), expectedDimensionsThree);
		
		Assert.assertTrue(driver.findElements(By.xpath("//input[@value='Add to Cart']")).size()==3);
		Assert.assertTrue(driver.findElements(By.linkText("Remove")).size()==3);
		
		driver.quit();
		
	}
	
	@Test(priority=18)
	public void verifyProductComparisonPageWhenOnlyFourProductsAreAddedForComparison() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameTwo = "iPhone";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameTwo);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameThree = "MacBook Air";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameThree);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameFour = "MacBook";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameFour);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		driver.findElement(By.linkText("product comparison")).click();
		
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle,"Product Comparison");
		
		int acutalProductCount = driver.findElements(By.xpath("//td[text()='Product']/following-sibling::td")).size();
		Assert.assertEquals(acutalProductCount,4);
		
		String xpathText = "//td[text()='Product']/following-sibling::td/a/strong[text()='"+productName+"']";
		Assert.assertTrue(driver.findElement(By.xpath(xpathText)).isDisplayed());
		String xpathTextTwo = "//td[text()='Product']/following-sibling::td/a/strong[text()='"+productNameTwo+"']";
		Assert.assertTrue(driver.findElement(By.xpath(xpathTextTwo)).isDisplayed());
		String xpathTextThree = "//td[text()='Product']/following-sibling::td/a/strong[text()='"+productNameThree+"']";
		Assert.assertTrue(driver.findElement(By.xpath(xpathTextThree)).isDisplayed());
		String xpathTextFour = "//td[text()='Product']/following-sibling::td/a/strong[text()='"+productNameFour+"']";
		Assert.assertTrue(driver.findElement(By.xpath(xpathTextFour)).isDisplayed());
		
		int actualImageCount = driver.findElements(By.xpath("//td[text()='Image']/following-sibling::td/img")).size();
		Assert.assertEquals(actualImageCount,4);
		
		String expectedPriceOne = "$122.00";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Price']/following-sibling::td[1]")).getText(), expectedPriceOne);
		String expectedPriceTwo = "$123.20";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Price']/following-sibling::td[2]")).getText(), expectedPriceTwo);
		String expectedPriceThree = "$1,202.00";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Price']/following-sibling::td[3]")).getText(), expectedPriceThree);
		String expectedPriceFour = "$602.00";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Price']/following-sibling::td[4]")).getText(), expectedPriceFour);
		
		String expectedProductModelOne = "Product 14";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Model']/following-sibling::td[1]")).getText(), expectedProductModelOne);
		String expectedProductModelTwo = "product 11";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Model']/following-sibling::td[2]")).getText(), expectedProductModelTwo);
		String expectedProductModelThree = "Product 17";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Model']/following-sibling::td[3]")).getText(), expectedProductModelThree);
		String expectedProductModelFour = "Product 16";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Model']/following-sibling::td[4]")).getText(), expectedProductModelFour);
		
		String expectedBrandOne = "Apple";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Brand']/following-sibling::td[1]")).getText(), expectedBrandOne);
		String expectedBrandTwo = "Apple";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Brand']/following-sibling::td[2]")).getText(), expectedBrandTwo);
		String expectedBrandThree = "Apple";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Brand']/following-sibling::td[3]")).getText(), expectedBrandThree);
		String expectedBrandFour = "Apple";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Brand']/following-sibling::td[4]")).getText(), expectedBrandFour);
		
		
		String expectedAvailabilityOne = "Out Of Stock";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Availability']/following-sibling::td[1]")).getText(), expectedAvailabilityOne);
		String expectedAvailabilityTwo = "Out Of Stock";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Availability']/following-sibling::td[2]")).getText(), expectedAvailabilityTwo);
		String expectedAvailabilityThree = "Out Of Stock";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Availability']/following-sibling::td[3]")).getText(), expectedAvailabilityThree);
		String expectedAvailabilityFour = "Out Of Stock";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Availability']/following-sibling::td[4]")).getText(), expectedAvailabilityFour);
		
		int actualRatingsSizeOne = driver.findElements(By.xpath("//td[text()='Rating']/following-sibling::td[1]/span")).size();
		Assert.assertEquals(actualRatingsSizeOne,5);
		int actualRatingsSizeTwo = driver.findElements(By.xpath("//td[text()='Rating']/following-sibling::td[2]/span")).size();
		Assert.assertEquals(actualRatingsSizeTwo,5);
		int actualRatingsSizeThree = driver.findElements(By.xpath("//td[text()='Rating']/following-sibling::td[3]/span")).size();
		Assert.assertEquals(actualRatingsSizeThree,5);
		int actualRatingsSizeFour = driver.findElements(By.xpath("//td[text()='Rating']/following-sibling::td[4]/span")).size();
		Assert.assertEquals(actualRatingsSizeFour,5);
		
		String expectedSummaryOne = "Just when you thought iMac had everything, now there´s even more. More powerful Intel Core 2 Duo processors. And more memory standard. Combine this with Mac OS X Leopard and iLife ´08, and it´s mor..";
		String actualSummaryOne = driver.findElement(By.xpath("//td[text()='Summary']/following-sibling::td[1]")).getText();
		Assert.assertTrue(actualSummaryOne.contains(expectedSummaryOne));
		
		String expectedSummaryTwo = "iPhone is a revolutionary new mobile phone that allows you to make a call by simply tapping a name or number in your address book, a favorites list, or a call log. It also automatically syncs all y..";
		String actualSummaryTwo = driver.findElement(By.xpath("//td[text()='Summary']/following-sibling::td[2]")).getText();
		Assert.assertTrue(actualSummaryTwo.contains(expectedSummaryTwo));
		
		String expectedSummaryThree = "MacBook Air is ultrathin, ultraportable, and ultra unlike anything else. But you don’t lose inches and pounds overnight. It’s the result of rethinking conventions. Of multiple wireless ..";
		String actualSummaryThree = driver.findElement(By.xpath("//td[text()='Summary']/following-sibling::td[3]")).getText();
		Assert.assertTrue(actualSummaryThree.contains(expectedSummaryThree));
		
		String expectedSummaryFour = "Intel Core 2 Duo processor Powered by an Intel Core 2 Duo processor at speeds up to 2.16GHz, the new MacBook is the fastest ever. 1GB memory, larger hard drives The new MacBoo..";
		String actualSummaryFour = driver.findElement(By.xpath("//td[text()='Summary']/following-sibling::td[4]")).getText();
		Assert.assertTrue(actualSummaryFour.contains(expectedSummaryFour));
		
		String expectedWaitOne = "5.00kg";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td[1]")).getText(), expectedWaitOne);
		
		String expectedWaitTwo = "10.00kg";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td[2]")).getText(), expectedWaitTwo);
		
		String expectedWaitThree = "0.00kg";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td[3]")).getText(), expectedWaitThree);
		
		String expectedWaitFour = "0.00kg";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td[4]")).getText(), expectedWaitFour);
		
		String expectedDimensionsOne = "0.00cm x0.00cm x0.00cm";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Dimensions (L x W x H)']/following-sibling::td[1]")).getText(), expectedDimensionsOne);
		
		String expectedDimensionsTwo = "0.00cm x0.00cm x0.00cm";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Dimensions (L x W x H)']/following-sibling::td[2]")).getText(), expectedDimensionsTwo);
		
		String expectedDimensionsThree = "0.00mm x0.00mm x0.00mm";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Dimensions (L x W x H)']/following-sibling::td[3]")).getText(), expectedDimensionsThree);
		
		String expectedDimensionsFour = "0.00mm x0.00mm x0.00mm";
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Dimensions (L x W x H)']/following-sibling::td[4]")).getText(), expectedDimensionsFour);
		
		Assert.assertTrue(driver.findElements(By.xpath("//input[@value='Add to Cart']")).size()==4);
		Assert.assertTrue(driver.findElements(By.linkText("Remove")).size()==4);
		
		driver.quit();
		
	}
	
	@Test(priority=19)
	public void verifyProductComparingIsNotPossibleWithMoreThanFourProducts()  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameTwo = "iPhone";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameTwo);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameThree = "MacBook Air";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameThree);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameFour = "MacBook";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameFour);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameFive = "Canon";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameFive);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		driver.findElement(By.linkText("product comparison")).click();
		
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle,"Product Comparison");
		
		int acutalProductCount = driver.findElements(By.xpath("//td[text()='Product']/following-sibling::td")).size();
		Assert.assertEquals(acutalProductCount,4);
		
		driver.quit();
		
	}
	
	@Test(priority=20)
	public void verifyAddingProductsToCartFromProductComparsionPage()  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		driver.findElement(By.linkText("product comparison")).click();
		
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle,"Product Comparison");
		
		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		driver.findElement(By.linkText("shopping cart")).click();
		
		actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle,"Shopping Cart");
		
		Assert.assertEquals(driver.findElement(By.xpath("(//div[@id='content']//a)[2]")).getText(), "iMac");
		
		String productNameTwo = "iPhone";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameTwo);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameThree = "MacBook Air";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameThree);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameFour = "MacBook";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameFour);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		driver.findElement(By.linkText("product comparison")).click();
		
		for(int i=2;i<=4;i++) {
			String xpathText = "(//input[@value='Add to Cart'])["+i+"]";
			driver.findElement(By.xpath(xpathText)).click();
		}
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		driver.findElement(By.linkText("shopping cart")).click();
	
		List<WebElement> products = driver.findElements(By.xpath("//form//table/tbody/tr/td[2]/a"));
		
		List<String> productNames = new ArrayList<String>();
		
		for(WebElement product : products) {
			
			productName = product.getText();
			productNames.add(productName);
			
		}
		
		Assert.assertTrue(productNames.contains(productName));
		Assert.assertTrue(productNames.contains(productNameTwo));
		Assert.assertTrue(productNames.contains(productNameThree));
		Assert.assertTrue(productNames.contains(productNameFour));
		
		driver.quit();
		
	}
	
	@Test(priority=21)
	public void verifyRemovingProductsFromProductComparsionPage()  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameTwo = "iPhone";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameTwo);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameThree = "MacBook Air";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameThree);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		String productNameFour = "MacBook";
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productNameFour);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		driver.findElement(By.linkText("product comparison")).click();
		
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle,"Product Comparison");
		
		int acutalProductCount = driver.findElements(By.xpath("//td[text()='Product']/following-sibling::td")).size();
		Assert.assertEquals(acutalProductCount,4);
		
		List<WebElement> removeButtons = driver.findElements(By.xpath("//a[text()='Remove']"));
		
		for(int i=1;i<=removeButtons.size();i++) {
			
			driver.findElement(By.xpath("//a[text()='Remove']")).click();
			
		}
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']/p[text()='You have not chosen any products to compare.']")).isDisplayed());
		
		driver.quit();
	}
	
	@Test(priority=22)
	public void verifyPageTitlePageHeadingPageURLOfProductComparisonPage()  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String productName = "iMac";
		driver.findElement(By.name("search")).sendKeys(productName);
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.findElement(By.cssSelector("button[onclick^='compare']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='alert alert-success alert-dismissible']")));
		driver.findElement(By.linkText("product comparison")).click();
		
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle,"Product Comparison");
		
		Assert.assertEquals(driver.getTitle(),"Product Comparison");
		Assert.assertEquals(driver.getCurrentUrl(),"https://tutorialsninja.com/demo/index.php?route=product/compare");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']/h1")).getText(),"Product Comparison");
		
		driver.quit();
		
	}
		

}
