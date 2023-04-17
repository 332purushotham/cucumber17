package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class CRMDealsClass {
	WebDriver driver;
	@Given("user already login page")
	public void user_already_login_page() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://ui.cogmento.com/");
	}
	@When("title of login page is free CRM")
	public void title_of_login_page_is_free_crm() {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
	 System.out.println("this is oooooooooooooooooooooo"+title);
	 Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("user enter username and password")
	public void user_enter_username_and_password(DataTable credentials) {
		 List<List<String>> data = credentials.asLists(String.class);
	WebElement element=driver.findElement(By.xpath("//input[@name='email']"));
element.sendKeys(data.get(0).get(0));
element.sendKeys(data.get(1).get(0));
 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));
 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(1).get(1));

		//WebElement element=driver.findElement(By.xpath("//input[@name='email']")); 
		
		  // element.sendKeys(dataTable.);
		   //WebElement password1=driver.findElement(By.xpath("//input[@name='password']")); 
		   //password1.sendKeys(password);
	}
@And("user click login buttons")
public void user_click_login_buttons()
{
	 WebElement password=driver.findElement(By.xpath("//div[text()='Login']")); 
	   password.click();
}

@And("user is on home pages")
public void user_is_on_home_pages() {
    // Write code here that turns the phrase above into concrete actions
	//  WebElement password=driver.findElement(By.xpath("//span[contains(text(),'purushotham')]"));
	 //;
 // System.out.println(password.getText());
//span[contains(text(),'purushotham')]
	System.out.println("this is one two");
}
@Then("user enter deal details")
public void user_enter_deal_details(DataTable table) {
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	WebElement element=driver.findElement(By.xpath("//i[@class='money icon']"));
	//WebElement icon=driver.findElement(By.xpath("//a[@href='/contacts']"));
	////i[@class='plus inverted icon']
Actions action=new Actions(driver);
action.moveToElement(element).perform();	
WebElement icon=driver.findElement(By.xpath("//a[@href='/deals']"));
icon.click();
WebElement icon1=driver.findElement(By.xpath("//a[@href='/deals/new']"));
icon1.click();
List<List<String>> data=table.asLists(String.class);
WebElement first_name=driver.findElement(By.xpath("//input[@name='title']"));
first_name.sendKeys(data.get(0).get(0));
WebElement last_name=driver.findElement(By.name("description"));
last_name.sendKeys(data.get(0).get(1));
WebElement amount=driver.findElement(By.xpath("//input[@name='amount']"));
amount.sendKeys(data.get(0).get(2));
WebElement commission=driver.findElement(By.xpath("//input[@name='commission']"));
commission.sendKeys(data.get(0).get(3));
}
}
