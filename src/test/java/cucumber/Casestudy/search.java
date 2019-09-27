package cucumber.Casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class search {
	WebDriver driver;
	@Given("^The user searches the product$")
	public void the_user_searches_the_product() throws Throwable {
		driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/login.htm");
		  //Assert.assertEquals(driver.getTitle(), "Home"); 
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		 driver.findElement(By.name("password")).sendKeys("password123");
		 driver.findElement(By.name("Login")).click();
		 
	}

	@When("^the user enters the product name\"([^\"]*)\"$")
	public void the_user_enters_the_product_name(String arg1) throws Throwable {
		 driver.findElement(By.name("products")).sendKeys(arg1);
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		 
		 
	}

	@When("^The user is navigated to the product page$")
	public void the_user_is_navigated_to_the_product_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Search"); 
	}

	@When("^The product is added to cart$")
	public void the_product_is_added_to_cart() throws Throwable {
		driver.findElement(By.linkText("Add to cart")).click();
		driver.findElement(By.partialLinkText("Cart")).click();
		driver.findElement(By.linkText("Checkout")).click();
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	   
	}

	@When("^The user is navigated to the payment page$")
	public void the_user_is_navigated_to_the_payment_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/label/i")).click();
		  driver.findElement(By.id("btn")).click(); 
			driver.findElement(By.name("username")).sendKeys("123459");
			driver.findElement(By.name("password")).sendKeys("Pass@459");
			driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
			driver.findElement(By.name("transpwd")).click();
			driver.findElement(By.name("transpwd")).sendKeys("Trans@459");
			driver.findElement(By.xpath("//input[@value='PayNow']")).click();
		
	}

	@Then("^The product is purchased$")
	public void the_product_is_purchased() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Order Details");
		driver.findElement(By.linkText("Home")).click();
	}

	@Given("^The user searches the product name$")
	public void the_user_searches_the_product_name() throws Throwable {
		driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  Assert.assertEquals(driver.getTitle(), "Home"); 
	}

	@When("^user enters the product name\"([^\"]*)\"$")
	public void user_enters_the_product_name(String arg1) throws Throwable {
		driver.findElement(By.name("products")).sendKeys(arg1);
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("^user is shown the \"([^\"]*)\"$")
	public void user_is_shown_the(String arg1) throws Throwable {
		Assert.assertEquals("0",driver.findElement(By.id("itemscount")).getText());
	}


}
