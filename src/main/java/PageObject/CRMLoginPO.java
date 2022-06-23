package PageObject;


import javax.xml.xpath.XPath; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configuration.Base;

public class CRMLoginPO extends Base {
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement EmailField;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement PasswordField;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement ClickLogin;
	
	@FindBy(xpath = "//a[@href='https://qacrm.shakedeal.com/admin/clients']")
	private WebElement ClickCustomer;
	
	@FindBy(xpath = "//a[@class='btn btn-info mright5 test   pull-left display-block']")
	private WebElement ClickNewCustomer;
	
	@FindBy(id = "company")
	private WebElement EnterCompanyName;
	
	@FindBy(id="address")
	private WebElement EnterCustomerAddress;
	
	@FindBy(id="city")
	private WebElement EnterCity;
	
	@FindBy(id="phonenumber")
	private WebElement EnterPhoneNumber;
	
	@FindBy(id="zip")
	private WebElement EnterZipCode;
	
	@FindBy(xpath = "//span[text()='Select State']")
	private WebElement ClickStateDropdown;
	
	@FindBy(xpath = "//li[@data-original-index=\"14\"]//span[text()='Karnataka']")
	private WebElement SelectKarnataka;
	
	@FindBy(xpath = "//a[@href='#billing_and_shipping']")
	private WebElement ClickBillingShipping;
	
	@FindBy(xpath = "//small[text()='Same as Customer Info']")
	private WebElement ClickSameasCustomerInfo;
	
	@FindBy(xpath="//small[text()='Copy Billing Address']")
	private WebElement CopyBillingAddress;
	
	@FindBy(xpath = "//button[@class='btn btn-info save-and-add-contact customer-form-submiter']")
	private WebElement ClickSaveAndCreateContact;
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement EnterFirstNAme;
	
	@FindBy(xpath = "//input[@id='lastname']")
	private	WebElement EnterLastName;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement EnterEmailAddress;
	
	@FindBy(xpath = "//div[@class='modal-content']//input[@name='phonenumber']")
	private WebElement EnterPhoneNumberInPopup;
	
	@FindBy(xpath = "//a[@class='generate_password']")
	private WebElement GeneratePassword;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement ClickSave;
	
	@FindBy(xpath = "//input[@jsaction='paste:puy29d;']")
	private WebElement GoogleSearch;
	
	@FindBy(xpath = "//span[@style='display:block;margin-left:53px']")
	private WebElement ClickNext;

//	@FindBy(xpath = "//li[@id='top_search']//input[@class='form-control']")
//	private WebElement SearchState;
	
//	public WebElement getSearchState() {
//		return SearchState;
//	}

	public WebElement getClickNext() {
		return ClickNext;
	}

	public WebElement getGoogleSearch() {
		return GoogleSearch;
	}

	public WebElement getGeneratePassword() {
		return GeneratePassword;
	}

	public WebElement getClickSave() {
		return ClickSave;
	}

	public WebElement getEnterFirstNAme() {
		return EnterFirstNAme;
	}

	public WebElement getEnterLastName() {
		return EnterLastName;
	}

	public WebElement getEnterEmailAddress() {
		return EnterEmailAddress;
	}

	public WebElement getEnterPhoneNumberInPopup() {
		return EnterPhoneNumberInPopup;
	}

	public WebElement getClickSameasCustomerInfo() {
		return ClickSameasCustomerInfo;
	}

	public WebElement getClickSaveAndCreateContact() {
		return ClickSaveAndCreateContact;
	}

	public WebElement getCopyBillingAddress() {
		return CopyBillingAddress;
	}

	public WebElement getClickBillingShipping() {
		return ClickBillingShipping;
	}

	public WebElement getSelectKarnataka() {
		return SelectKarnataka;
	}

	

	public WebElement getEmailField() {
		return EmailField;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public WebElement getClickLogin() {
		return ClickLogin;
	}
	
	public WebElement getClickCustomer() {
		return ClickCustomer;
	}
	
	public WebElement getClickNewCustomer() {
		return ClickNewCustomer;
	}

	public WebElement getEnterCompanyName() {
		return EnterCompanyName;
	}

	public WebElement getEnterCustomerAddress() {
		return EnterCustomerAddress;
	}

	public WebElement getEnterCity() {
		return EnterCity;
	}

	public WebElement getEnterPhoneNumber() {
		return EnterPhoneNumber;
	}

	public WebElement getEnterZipCode() {
		return EnterZipCode;
	}

	public WebElement getClickStateDropdown() {
		return ClickStateDropdown;
	}
	
	
	
	public CRMLoginPO(WebDriver driver) {
		Base.driver = driver;
		
		PageFactory.initElements(driver ,this);
	}
	

	

	
	
	
	
	
	
	
	}

