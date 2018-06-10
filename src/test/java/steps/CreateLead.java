package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
//	public static RemoteWebDriver driver;
//	@Given("Invoke Testleaf application")
//	public void invokeApp() {
//		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//	@And("Enter username as (.*)")
//	public void enterUserName(String data) {
//		driver.findElementById("username").sendKeys(data);
//	}
//	@And("Enter password as (.*)")
//	public void enterPassword(String data) {
//		driver.findElementById("password").sendKeys(data);
//	}
//	@And("Click on login button")
//	public void clicklogin() {
//		driver.findElementByClassName("decorativeSubmit").click();
//	}
//	@And("click crmsfa link")
//	public void clickcrmsfa() {
//		driver.findElementByLinkText("CRM/SFA").click();		
//	}
//	@And("click Leads tab")
//	public void clickLeads() {
//		driver.findElementByLinkText("Leads").click();
//	}
//	@And("create lead button")
//	public void clickCreateLead() {
//		driver.findElementByLinkText("Create Lead").click();
//	}
//	@And("Enter company name as (.*)")	
//	public void entercname(String data) {
//		driver.findElementById("createLeadForm_companyName").sendKeys(data);			
//	}
//	@And("Enter First Name as (.*)")	
//	public void enterFname(String data) {
//		driver.findElementById("createLeadForm_firstName").sendKeys(data);			
//	}
//	@And("Enter Last Name as (.*)")	
//	public void enterLname(String data) {
//		driver.findElementById("createLeadForm_lastName").sendKeys(data);			
//	}
//	@When("click on Create Lead button")
//	public void clickCreateLeadsubmit() {
//		driver.findElementByName("submitButton").click();
//	}
//	@Then("Verify login is successful")
//	public void verifyLogin() {
//		System.out.println("Login is successful");
//	}	
//	@Then("Verify lead is created successfully")
//	public void createdLead() {
//		String status = driver.findElementById("viewLead_statusId_sp").getText();
//		if(status.equals("Assigned"))
//		{
//			System.out.println("Lead created succesfully");
//		}
//		else
//		{
//			System.out.println("Please check the error");
//		}
//		driver.close();
//	}
	
}