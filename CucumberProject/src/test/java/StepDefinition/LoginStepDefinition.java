package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {
	WebDriver driver;
@Given("user already in login page")
public void user_already_in_login_page()
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://ui.cogmento.com/");
}
@When("title of login page is free crm")
public void title_of_login_page_is_free_crm() {
String title=driver.getTitle();
String actual="#1 Free CRM Software for every business";
//Assert.assertEquals(actual,title);
driver.getPageSource().contains(title);
}
//\"(.*)\" and \"(.*)\"

@Then("user enters {string} and {string}")
public void user_enters_and(String username, String password) {
   WebElement element=driver.findElement(By.xpath("//input[@name='email']")); 
   element.sendKeys(username);
   WebElement password1=driver.findElement(By.xpath("//input[@name='password']")); 
   password1.sendKeys(password);
   
}



@And("user click login button")
public void user_click_login_button() {
    // Write code here that turns the phrase above into concrete actions//
	////div[text()='Login']
	   WebElement password=driver.findElement(By.xpath("//div[text()='Login']")); 
	   password.click();
   }

@And("user is on home page")
public void user_is_on_home_page() {
    // Write code here that turns the phrase above into concrete actions
	//  WebElement password=driver.findElement(By.xpath("//span[contains(text(),'purushotham')]"));
	 //;
 // System.out.println(password.getText());
//span[contains(text(),'purushotham')]
	System.out.println("this is one two");
}
@Then("user moves to new contact page")
public void user_moves_to_new_contact_page() throws InterruptedException {
	
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath("//i[@class='users icon']"));
		//WebElement icon=driver.findElement(By.xpath("//a[@href='/contacts']"));
		////i[@class='plus inverted icon']
	Actions action=new Actions(driver);
	action.moveToElement(element).perform();
	
	
     
    
}

@When("User add contact details after sucessfull login")
public void user_add_contact_details_after_sucessfull_login() {
    // Write code here that turns the phrase above into concrete actions
	WebElement icon=driver.findElement(By.xpath("//a[@href='/contacts']"));
	icon.click();
	////a[@href='/contacts/new']
	WebElement icon1=driver.findElement(By.xpath("//a[@href='/contacts/new']"));
	icon1.click();
}


@Then("user enters contact details {string} and {string}")
public void user_enters_contact_details_and_and(String firstname, String lastname) {
	////input[@name='first_name']
	WebElement first_name=driver.findElement(By.xpath("//input[@name='first_name']"));
	first_name.sendKeys(firstname);
	WebElement last_name=driver.findElement(By.xpath("//input[@name='last_name']"));
	last_name.sendKeys(lastname);
}
//
//@Then("Close the browser")
//public void close_the_browser() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
}
