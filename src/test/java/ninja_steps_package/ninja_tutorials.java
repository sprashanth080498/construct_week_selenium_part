package ninja_steps_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ninja_tutorials {
	WebDriver driver;//webdriver instance is created
	@Given("User opens the url in chrome browser.") //Given is the preconditions before proceeding to execute the test cases.
	public void user_opens_the_url_in_chrome_browser() //feature file line
	{
		driver=new ChromeDriver();//chrome driver instance is created
		driver.get("https://tutorialsninja.com/demo/");//the link to open the application
		driver.manage().window().maximize();//command to maximize the window
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//default time in selenium is 30 seconds here we are adding additional time of 10 seconds using implicit wait
		// we have used implicit wait as it interacts with the web elements in the time provided and executes the code faster.
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Given("Logins in the application")//feature file line
	public void logins_in_the_application()
	{
	    // Write code here that turns the phrase above into concrete actions
		WebElement acc=driver.findElement(By.linkText("My Account"));//selecting the "my account" field in the home page of the application
		acc.click();//performing the click operation
		WebElement log=driver.findElement(By.linkText("Login"));//logging in the application 
		log.click();//performing the click operation
		driver.findElement(By.cssSelector("#input-email")).sendKeys("sarathkumar1234@gmail.com");//sending the values in the email id field
		driver.findElement(By.cssSelector("#input-password")).sendKeys("sarathkumar1234");//sending the values in the password field
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();//clicking on the submit button
	  }

	@When("user enters a product name in the search text, clicks search button.")
	public void user_enters_a_product_name_in_the_search_text_clicks_search_button()
	{
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("search")).sendKeys("Nikon D300");//entering the product name in the search field area
	driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();//clicking the search symbol
	}

	@When("clicks on the product displayed in the search results.")
	public void clicks_on_the_product_displayed_in_the_search_results() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("img-responsive")).click();//selecting the searched object displayed on the search results page
	    }

	@When("clicks on add to wishlist.")
	public void clicks_on_add_to_wishlist() {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.cssSelector("#button-cart")).click();//clicking the add to wishlist option
	}

	@Then("a message is displayed")
	public void a_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		//Alert A=driver.switchTo().alert();
		//WebElement ele=driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]"));
		String val=driver.getTitle();//storing the title in a string variable
		System.out.println(val);//printing the value
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit wait
		Assert.assertEquals("Nikon D300", val);//asserting the test displayed in the title field 
	System.out.println("Assertion passed:"+val);//this line will be printed if the assertion is passed
	//I have used the hard assertions here.

	}

	@Then("user clicks add-to-wishlist link.")
	public void user_clicks_add_to_wishlist_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("shopping cart")).click();
		driver.close();//closes the webpage
	}

}
