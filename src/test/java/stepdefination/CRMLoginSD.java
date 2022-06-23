//package stepdefination;
//
//import java.util.Iterator;
//
//import org.openqa.selenium.Keys;
//
//import PageObject.CRMLoginPO;
//import configuration.Base;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class CRMLoginSD extends Base{
//	private CRMLoginPO CRMLogin = new CRMLoginPO(driver);
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		driver.get("https://qacrm.shakedeal.com/");
//	   
//	}
//
//	@When("user enters user name {string} and password {string}")
//	public void user_enters_user_name_and_password(String Email, String password) {
//		 CRMLogin.getEmailField().sendKeys("surya.kc@shakedeal.com");
//		 CRMLogin.getPasswordField().sendKeys("surya@123");	    
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//		CRMLogin.getClickLogin().click();
//	    
//		
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		
//		String Title= driver.getTitle();
//		
//		if(Title.equals("Dashboard")) 
//			System.out.println("correct page title");
//		else 
//			System.out.println("Incorrect page");
//	    	}
//	
//}
