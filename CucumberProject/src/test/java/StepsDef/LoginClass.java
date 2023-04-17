package StepsDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginClass {
	WebDriver driver;
	@Given("open the browser")
	public void open_the_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver =new ChromeDriver();
	   driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	   driver.get("https://github.com/login");
	}

	@When("User enter username and password")
	public void user_enter_username_and_password(String username,String password) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    // Write code here that turns the phrase above into concrete actions
		WebElement element=driver.findElement(By.xpath("//input[@name='login']"));
		element.sendKeys(username);
		WebElement password1=driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys(password);
		Thread.sleep(50000);
	   
	}

	@And("user click submit button")
	public void user_click_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    //
	    WebElement element=driver.findElement(By.xpath("//input[@type='submit']"));
		element.click();
	    
	}

	@Then("navigate login page to home page")
	public void navigate_login_page_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.getPageSource().contains("Device verification");
	}

}
