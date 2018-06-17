package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ToLeadPopupPage extends ProjectMethods{

	public ToLeadPopupPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement eleToFirstName;

	public ToLeadPopupPage typeToFirstName(String data){
		type(eleToFirstName,data);
		return new ToLeadPopupPage();		
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement eleFindLeadtoformerge;

	public ToLeadPopupPage clickFindLeadforTolead(){
		click(eleFindLeadtoformerge);
		return new ToLeadPopupPage();		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleSelectToLead;
	public MergeLeadsPage clickToLeadforMerge(){
		clickWithNoSnap(eleSelectToLead);
		switchToWindow(0);
		return new MergeLeadsPage();
	}
	}