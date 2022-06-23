package PageObject;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configuration.Base;

public class PlaceOrderPO extends Base {

	@FindBy(xpath = "//a[@href='https://qacrm.shakedeal.com/admin/proposals']")
	private WebElement ClickEnquiry;

	@FindBy(xpath = "//a[@class='btn btn-info pull-left display-block']")
	private WebElement ClickNewEnquiry;

	@FindBy(xpath = "//input[@id='search']")
	private WebElement SearchCustomerOrLead;

	@FindBy(xpath = "//i[@class='fa fa-balance-scale menu-icon']")
	private WebElement ClickSales;

	@FindBy(xpath = "//div[text()='qaautomation -- Found in Customers']")
	private WebElement SelectCustomer;

	@FindBy(xpath = "//input[@id='subject']")
	private WebElement AddSubject;

	@FindBy(xpath = "//input[@id='zip']")
	private WebElement AddZip;

	@FindBy(xpath = "//*[@id=\"proposal-form\"]/div[2]/div/div[3]/div[1]/div[1]/div/div/div/div/input")
	private WebElement ChooseSDBSH0100200;

	@FindBy(xpath = "//*[@id=\"proposal-form\"]//span[text()='Add Item']")
	private WebElement ClickAddItem;
	
	@FindBy(xpath = "//input[@value='1']")
	private WebElement IncreaseQty;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div/form/div[1]/div/div/div[2]/button[1]")
	private WebElement ClickSaveAndreadyToQuote;

	public WebElement getClickSaveAndreadyToQuote() {
		return ClickSaveAndreadyToQuote;
	}

	public WebElement getIncreaseQty() {
		return IncreaseQty;
	}

	public WebElement getAddZip() {
		return AddZip;
	}

	public WebElement getChooseSDBSH0100200() {
		return ChooseSDBSH0100200;
	}

	public WebElement getClickAddItem() {
		return ClickAddItem;
	}

	public WebElement getAddSubject() {
		return AddSubject;
	}

	public WebElement getSelectCustomer() {
		return SelectCustomer;
	}

	public WebElement getClickSales() {
		return ClickSales;
	}

	public WebElement getClickEnquiry() {
		return ClickEnquiry;
	}

	public WebElement getClickNewEnquiry() {
		return ClickNewEnquiry;
	}

	public WebElement getSearchCustomerOrLead() {
		return SearchCustomerOrLead;
	}

	public PlaceOrderPO(WebDriver driver) {
		Base.driver = driver;

		PageFactory.initElements(driver, this);
	}

}
