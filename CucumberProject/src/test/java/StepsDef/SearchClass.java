package StepsDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchClass {
	WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() {
		
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
	    System.out.println("browser is open");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.get("https://www.google.com");
		//driver.navigate().
	    // Write code here that turns the phrase above into concrete actions
		
	    System.out.println("user is on google search page");
	}

	@When("User enter a text in search box")
	public void user_enter_a_text_in_search_box() {
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("Facebook");
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User enter a text in search box");
	}

	@And("click enter button")
	public void click_enter_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys(Keys.ENTER);
System.out.println("click enter button");
	}

	@Then("navigate to search page")
	public void navigate_to_search_page() {
	    // Write code here that turns the phrase above into concrete actions
driver.getPageSource().contains("Join1111");
System.out.println("navigate to search page");
	}

}
