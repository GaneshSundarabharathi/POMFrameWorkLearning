package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.FindLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadsPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_DeleteLeads";
		testDescription="delete leads in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Ganesh";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void createLeads(String uName,String pwd,String fName) {

		FindLeadPage flp= new LoginPage()
				.enterUserName(uName)
				.enterPassword(pwd)
				.clickLogIn()
				.clickCrmButton()
				.clickLeadsTab()
				.clickFindLead()
				.typeSearchName(fName)
				.clickSearch();

		String firstLeadID = flp.getFirstLeadId();

		flp.clickSearchresult()
		.deleteLead()
		.clickFindLead()
		.typeSearchId(firstLeadID)
		.clickSearch()
		.verifyNoResult();
	}
}
