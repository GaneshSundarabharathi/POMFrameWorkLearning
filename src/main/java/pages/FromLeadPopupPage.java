package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class FromLeadPopupPage extends ProjectMethods{

	public FromLeadPopupPage() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement eleFromFirstName;

	public FromLeadPopupPage typeFromFirstName(String data){
		type(eleFromFirstName,data);
		return new FromLeadPopupPage();		
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement eleFindLeadfromformerge;

	public FromLeadPopupPage clickFindLeadforFromlead(){
		click(eleFindLeadfromformerge);
		return new FromLeadPopupPage();		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleSelectFromLead;
	public MergeLeadsPage clickFromLeadforMerge(){
		clickWithNoSnap(eleSelectFromLead);
		switchToWindow(0);
		return new MergeLeadsPage();
	}
	public String getFirstLeadId() {
		String str = getText(eleSelectFromLead);
		return str;
	}
	}