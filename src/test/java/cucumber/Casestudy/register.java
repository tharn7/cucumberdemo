package cucumber.Casestudy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class register {
	WebDriver driver;
	Select sel;
	@Given("^user is in the registration page$")
	public void user_is_in_the_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
		  Assert.assertEquals(driver.getTitle(), "Sign Up");
	}

	@When("^user enter the username \"([^\"]*)\"$")
	public void user_enter_the_username(String arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^user enter the first name \"([^\"]*)\"$")
	public void user_enter_the_first_name(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
	    
	}

	@When("^user enters the last name \"([^\"]*)\"$")
	public void user_enters_the_last_name(String arg1) throws Throwable {
		  driver.findElement(By.name("lastName")).sendKeys(arg1);
	}

	@When("^user enters the Password \"([^\"]*)\"$")
	public void user_enters_the_Password(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@When("^user enters the password to confirm \"([^\"]*)\"$")
	public void user_enters_the_password_to_confirm(String arg1) throws Throwable {
		driver.findElement(By.id("pass_confirmation")).sendKeys(arg1);
	}

	@When("^user selects the gender\"([^\"]*)\"$")
	public void user_selects_the_gender(String arg1) throws Throwable {
		  driver.findElement(By.xpath("//input[@type='radio' and @value='"+arg1+"']")).click();
	}

	@When("^user enters the E-Mail\"([^\"]*)\"$")
	public void user_enters_the_E_Mail(String arg1) throws Throwable {
		 driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}

	@When("^user enters the Mobile Number\"([^\"]*)\"$")
	public void user_enters_the_Mobile_Number(String arg1) throws Throwable {
		  driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}

	@When("^user enters the Date of Birth\"([^\"]*)\"$")
	public void user_enters_the_Date_of_Birth(String arg1) throws Throwable {
		 driver.findElement(By.name("dob")).sendKeys(arg1);
	}

	@When("^user enters the Address\"([^\"]*)\"$")
	public void user_enters_the_Address(String arg1) throws Throwable {
		  driver.findElement(By.name("address")).sendKeys(arg1);
	}

	@When("^user selects the the Security Question \"([^\"]*)\"$")
	public void user_selects_the_the_Security_Question(String arg1) throws Throwable {
		 sel = new Select(driver.findElement(By.name("securityQuestion")));
		  sel.selectByVisibleText(arg1);
	}

	@When("^user enters the Answer to the security Question \"([^\"]*)\"$")
	public void user_enters_the_Answer_to_the_security_Question(String arg1) throws Throwable {
		  driver.findElement(By.name("answer")).sendKeys(arg1);
		  driver.findElement(By.name("Submit")).click();
	}

	@Then("^The user is navigated to the login page$")
	public void the_user_is_navigated_to_the_login_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Login");
	}


}
