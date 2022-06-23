package stepdefination;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

import org.apache.commons.configuration.plist.XMLPropertyListConfiguration;
import org.openqa.selenium.Keys;

import CommonUtils.UtilElements;
import PageObject.CRMLoginPO;
import PageObject.PlaceOrderPO;

import configuration.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceCRMOrder extends Base{
	
	private CRMLoginPO CRMLogin = new CRMLoginPO(driver);
	private PlaceOrderPO PlaceOrder = new PlaceOrderPO(driver);
	public UtilElements utilelement= new UtilElements();

	@Given("user logins to crm")
	public void user_logins_to_crm() {
		
		
		driver.get("https://qacrm.shakedeal.com/");
		CRMLogin.getEmailField().sendKeys("surya.kc@shakedeal.com");
		 CRMLogin.getPasswordField().sendKeys("surya@123");
		 CRMLogin.getClickLogin().click();    
	}

	@When("user clicks on sales option")
	public void user_clicks_on_sales_option() {
		PlaceOrder.getClickSales().click();
		
	}

	@Then("click on Enquiries")
	public void click_on_enquiries() {
		PlaceOrder.getClickEnquiry().click();
		
	}

	@Then("click on New Enquiry")
	public void click_on_new_enquiry() {
	    PlaceOrder.getClickNewEnquiry().click();
		
	}

	@Then("user fills all the mandatory fields")
	public void user_fills_all_the_mandatory_fields() throws InterruptedException {
		PlaceOrder.getSearchCustomerOrLead().sendKeys("qaautomation01@gmail.com");
		PlaceOrder.getSelectCustomer().click();
		PlaceOrder.getAddSubject().sendKeys("test");
		PlaceOrder.getAddZip().sendKeys("560001");
		utilelement.jsclick(driver,PlaceOrder.getClickAddItem());
		PlaceOrder.getChooseSDBSH0100200().sendKeys("SDBSH0100200");
		
		//utilelement.fluenwait(driver).wait(10000);;
		Thread.sleep(10000);
		PlaceOrder.getChooseSDBSH0100200().sendKeys(Keys.ENTER);
		PlaceOrder.getClickSaveAndreadyToQuote().click();
		
	}

	@Then("clicks on sales option")
	public void clicks_on_sales_option() {
		PlaceOrder.getClickSales().click();
	   
	}

	@And("clicks on quote")
	public void clicks_on_quote() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("select the respective quote")
	public void select_the_respective_quote() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("edit quote, save")
	public void edit_quote_save() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
