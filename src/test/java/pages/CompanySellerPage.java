package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CompanySellerPage {
    public CompanySellerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(partialLinkText = "Seller Join Now")
    public WebElement company_sellerJoinNow;
    @FindBy(xpath = "//input[@id='company_name']")
    public WebElement company_company_name;
    @FindBy(xpath = "//input[@id='company_mobile']")
    public WebElement company_company_mobile;
    @FindBy(xpath = "//textarea[@id='company_address']")
    public WebElement company_company_address;
    @FindBy(xpath = "//input[@id='vender_name']")
    public WebElement company_full_name;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement company_email;
    @FindBy(xpath = "//input[@id='sub_domain']")
    public WebElement company_sub_domain;
    @FindBy(xpath = "//input[@id='vender_mobile']")
    public WebElement company_mobile_number;
    @FindBy(xpath = "//select[@name='country']")
    public WebElement company_country_box;
    @FindBy(xpath = "//input[@id='select_state']")
    public WebElement company_state;
    @FindBy(xpath = "//input[@id='select_city']")
    public WebElement company_city;
    @FindBy(xpath = "//textarea[@id='vender_address']")
    public WebElement company_address;
    @FindBy(xpath = "//input[@id='zip_code_input']")
    public WebElement company_Zip_code;
    @FindBy(xpath = "//select[@name='category']")
    public WebElement company_categories;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement company_password;
    @FindBy(xpath = "//button[@value='Login']")
    public WebElement company_registration;
    @FindBy(xpath = "//p[contains(text(),'Thank you to join our team. You are Registered Suc')]")
    public WebElement company_successmessage;
}
