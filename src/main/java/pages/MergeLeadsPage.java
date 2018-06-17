package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{

	public MergeLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	private WebElement eleFromLeadlookup;

	public FromLeadPopupPage clickFromLead(){
		clickWithNoSnap(eleFromLeadlookup);
		switchToWindow(1);
		return new FromLeadPopupPage();		
	}
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleToLeadlookup;

	public ToLeadPopupPage clickToLead(){
		clickWithNoSnap(eleToLeadlookup);
		switchToWindow(1);
		return new ToLeadPopupPage();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMergebutton;

	public ViewLeadsPage clickMergeLead(){
		clickWithNoSnap(eleMergebutton);
		acceptAlert();
		return new ViewLeadsPage();		
	}
	}
