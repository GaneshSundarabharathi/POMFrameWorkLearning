package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.FindLeadPage;
import pages.FromLeadPopupPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MergeLeadsPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadsPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLead";
		testDescription="Merge leads in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Ganesh";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void createLeads(String uName,String pwd,String fNamefromMerge,String fNametoMerge) {

		FromLeadPopupPage flpp = new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmButton()
		.clickLeadsTab()
		.clickMergeLead()
		.clickFromLead()
		.typeFromFirstName(fNamefromMerge)
		.clickFindLeadforFromlead();
		String firstLeadID = flpp.getFirstLeadId();
		
		flpp.clickFromLeadforMerge()
		.clickToLead()
		.typeToFirstName(fNametoMerge)
		.clickFindLeadforTolead()
		.clickToLeadforMerge()
		.clickMergeLead()
		.clickFindLead()
		.typeSearchId(firstLeadID)
		.clickSearch()
		.verifyNoResult();
	}
}
