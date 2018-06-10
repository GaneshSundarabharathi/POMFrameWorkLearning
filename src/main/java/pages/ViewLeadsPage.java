package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods{

	public ViewLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.XPATH,using="//span[@id='viewLead_companyName_sp']")
	private WebElement eleCreatedCName;
	@Then("Verify lead is created successfully")
	public  ViewLeadsPage verifyCreatedCName1() {
		System.out.println("Lead Created Succesfully");
		return this;		
	}
	public  ViewLeadsPage verifyCreatedCName(String data) {
		verifyPartialText(eleCreatedCName, data);
		return this;		
	}
	@FindBy(how=How.XPATH,using="//span[@id='viewLead_firstName_sp']")
	private WebElement eleCreatedFName;

	public  ViewLeadsPage verifyCreatedFName(String data) {
		verifyPartialText(eleCreatedFName, data);
		return this;		
	}

	@FindBy(how=How.XPATH,using="//span[@id='viewLead_lastName_sp']")
	private WebElement eleCreatedLName;

	public  ViewLeadsPage verifyCreatedLName(String data) {
		verifyPartialText(eleCreatedLName, data);
		return this;		
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Edit')]")
	private WebElement eleEditButton;

	public  EditLeadPage clickEditButton() {
		click(eleEditButton);
		return new EditLeadPage();		
	}

	@FindBy(how=How.ID,using="viewLead_industryEnumId_sp")
	private WebElement eleVerifyIndustry;

	public ViewLeadsPage verifyIndustry(String data) {
		verifyPartialText(eleVerifyIndustry, data);
		return this;		
	}
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleDelete;

	public MyLeadsPage deleteLead(){
		click(eleDelete);
		return new MyLeadsPage();		
	}
	}
