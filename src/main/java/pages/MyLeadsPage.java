package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.LINK_TEXT,using="Create Lead" )
	private WebElement eleCreateLead;
	@And("create lead button")
	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads" )
	private WebElement eleFindLead;
	
	public FindLeadPage clickFindLead() {
		click(eleFindLead);
		return new FindLeadPage();
	}
	
}
