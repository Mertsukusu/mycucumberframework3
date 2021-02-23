package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CompanySellerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class CompanySellerStepDefinition {

    CompanySellerPage companySellerPage = new CompanySellerPage();
    @Given("user is on the Global Trader page")
    public void user_is_on_the_Global_Trader_page() {
        Driver.getDriver().get(ConfigReader.getProperty("globaltrader_url"));
    }
    @Given("user is on click Seller Join Now")
    public void user_is_on_click_Seller_Join_Now() {
        companySellerPage.company_sellerJoinNow.click();
    }


    @When("user enters company name")
    public void user_enters_company_name() throws InterruptedException {
        Thread.sleep(4000);
        companySellerPage.company_company_name.sendKeys("CoTrader");
    }

    @When("user enters company Mobile")
    public void user_enters_company_Mobile() {
        companySellerPage.company_company_mobile.sendKeys("8572724455");
    }

    @When("user enter company address")
    public void user_enter_company_address() {
        companySellerPage.company_company_address.sendKeys("12 Centre St.");
    }

    @When("user enters the fullname")
    public void user_enters_the_fullname() {
        companySellerPage.company_full_name.sendKeys("John Sanders");
    }

    @When("user enters the email")
    public void user_enters_the_email() {
        companySellerPage.company_email.sendKeys("abcderfgh43@gmail.com");
    }

    @When("user enter Sub Domain")
    public void user_enter_Sub_Domain() {
        companySellerPage.company_sub_domain.sendKeys("tradebest");
    }

    @When("user enter Mobile Number")
    public void user_enter_Mobile_Number() {
        companySellerPage.company_mobile_number.sendKeys("8571112545");
    }
    @When("user select to country")
    public void user_select_to_country() throws InterruptedException {
        Thread.sleep(4000);
        Select options = new Select(companySellerPage.company_country_box);
        options.selectByValue("94");
    }

    @When("user enter to state")
    public void user_enter_to_state() {
        companySellerPage.company_state.sendKeys("TX");
    }

    @When("user enter to city")
    public void user_enter_to_city() {
        companySellerPage.company_city.sendKeys("Austin");
    }
    @When("user enter address")
    public void user_enter_address() {
        companySellerPage.company_address.sendKeys("13 Centre St.");
    }

    @When("user enter to postal code")
    public void user_enter_to_postal_code() {
        companySellerPage.company_Zip_code.sendKeys("12321");
    }
    @When("Select to categories")
    public void select_to_categories() {
        Select options = new Select(companySellerPage.company_categories);
        options.selectByValue("1");
    }
    @When("Enter to password")
    public void enter_to_password() {
        companySellerPage.company_password.sendKeys("123456");
    }

    @When("Click to Registration Button")
    public void click_to_Registration_Button() {
        companySellerPage.company_registration.click();
    }
    @Then("Verify to registration data")
    public void verify_to_registration_data() throws InterruptedException {
            Thread.sleep(3000);
            Assert.assertTrue(companySellerPage.company_successmessage.getText().contains("Thank you to join our team. You are Registered Successfully."));
        }
    }
