package StepDefinition;

import java.util.List;
import java.util.Map;
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

public class CRMMapdealClass {
	WebDriver driver;

	@Given("user already login pages")
	public void user_already_login_pages() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://ui.cogmento.com/");
	}
	@When("title of login page is free CRMs")
	public void title_of_login_page_is_free_crms() {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
	 System.out.println("this is oooooooooooooooooooooo"+title);
	 Assert.assertEquals("Cogmento CRM", title);
	}


	@Then("user enter username and passwords")
	public void user_enter_username_and_passwords(DataTable credentials) throws InterruptedException {
		// List<List<String>> data = credentials.asLists(String.class);
		for(Map<String,String> data: credentials.asMaps(String.class,String.class)) {
	WebElement element=driver.findElement(By.xpath("//input[@name='email']"));
element.sendKeys(data.get("username"));
 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get("password"));
 Thread.sleep(3000);

		//WebElement element=driver.findElement(By.xpath("//input[@name='email']")); 
		
		  // element.sendKeys(dataTable.);
		   //WebElement password1=driver.findElement(By.xpath("//input[@name='password']")); 
		   //password1.sendKeys(password);
		}
	}
@And("user click login buttonss")
public void user_click_login_buttonss()
{
	 WebElement password=driver.findElement(By.xpath("//div[text()='Login']")); 
	   password.click();
}

@And("user is on home pagess")
public void user_is_on_home_pagess() {
    // Write code here that turns the phrase above into concrete actions
	//  WebElement password=driver.findElement(By.xpath("//span[contains(text(),'purushotham')]"));
	 //;
 // System.out.println(password.getText());
//span[contains(text(),'purushotham')]
	System.out.println("this is one two");
}
@Then("user enter deal detailss")
public void user_enter_deal_detailss(DataTable table) throws InterruptedException {
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
for(Map<String,String> map:table.asMaps(String.class,String.class)) {
//List<List<String>> data=table.asLists(String.class);
WebElement first_name=driver.findElement(By.xpath("//input[@name='title']"));
first_name.sendKeys(map.get("title"));
WebElement last_name=driver.findElement(By.name("description"));
last_name.sendKeys(map.get("description"));
WebElement amount=driver.findElement(By.xpath("//input[@name='amount']"));
amount.sendKeys(map.get("amount"));
WebElement commission=driver.findElement(By.xpath("//input[@name='commission']"));
commission.sendKeys(map.get("commission"));
//[class='save icon']
WebElement save=driver.findElement(By.xpath("//i[@class='save icon']"));
save.click();
Thread.sleep(3000);
WebElement element3=driver.findElement(By.xpath("//i[@class='money icon']"));
//WebElement icon=driver.findElement(By.xpath("//a[@href='/contacts']"));
////i[@class='plus inverted icon']
Actions action3=new Actions(driver);
action3.moveToElement(element3).perform();	
WebElement icon3=driver.findElement(By.xpath("//a[@href='/deals']"));
icon3.click();
WebElement icon13=driver.findElement(By.xpath("//a[@href='/deals/new']"));
icon13.click();

}
}
}
