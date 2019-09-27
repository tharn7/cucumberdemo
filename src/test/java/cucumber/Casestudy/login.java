package cucumber.Casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;
	@Given("^User is in the login page$")
	public void user_is_in_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/login.htm");
		  //Assert.assertEquals(driver.getTitle(), "Login");
	}

	@When("^user enter the \"([^\"]*)\"$")
	public void user_enter_the(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^user enters the \"([^\"]*)\"$")
	public void user_enters_the(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 //driver.findElement(By.name("password")).click();
		 driver.findElement(By.name("password")).sendKeys(arg1);
		 driver.findElement(By.name("Login")).click();
	}

	@Then("^the user is logged in$")
	public void the_user_is_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getTitle(),"Home");
	}


}
