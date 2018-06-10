package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.ID,using="createLeadForm_companyName" )
	private WebElement eleCName;
	@And("Enter company name as (.*)")
	public CreateLeadPage typeCName(String data) {
		type(eleCName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName" )
	private WebElement eleFName;
	@And("Enter First Name as (.*)")
	public CreateLeadPage typeFName(String data) {
		type(eleFName,data);
		return new CreateLeadPage();
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName" )
	private WebElement eleLName;
	@And("Enter Last Name as (.*)")
	public CreateLeadPage typeLName(String data) {
		type(eleLName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail" )
	private WebElement eleEmail;
	
	public CreateLeadPage typeEmail(String data) {
		type(eleEmail,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber" )
	private WebElement eleMobNum;
	
	public CreateLeadPage typeMobNum(String data) {
		type(eleMobNum,data);
		return this;
	}
	
	@FindBy(how=How.NAME,using="submitButton" )
	private WebElement eleSubButton;
	@When("click on Create Lead button")
	public ViewLeadsPage clickSubmit() {
		click(eleSubButton);
		return new ViewLeadsPage();
	}
}
