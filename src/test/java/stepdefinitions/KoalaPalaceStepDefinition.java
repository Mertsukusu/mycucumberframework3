package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hr.Kad;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.KoalaPalacePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class KoalaPalaceStepDefinition {

    KoalaPalacePage koalaPalacePage = new KoalaPalacePage();
    @Given("User is on Koalapalace main page")
    public void user_is_on_koalapalace_main_page() {
        Driver.getDriver().get(ConfigReader.getProperty("kaola_url"));
    }

    @Given("user clicks login button")
    public void user_clicks_login_button() {
       koalaPalacePage.LoginButton.click();
    }

    @When("user enters username")
    public void user_enters_username() {
        koalaPalacePage.usernameBox.sendKeys(ConfigReader.getProperty("username"));
    }

    @When("user enter password")
    public void user_enter_password() {
        koalaPalacePage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @When("user click submit button")
    public void user_click_submit_button() {
        koalaPalacePage.loginSubmitButton.click();
    }

    @When("user clicks add hotelroom button")
    public void user_clicks_add_hotelroom_button() throws InterruptedException {
        koalaPalacePage.hotelManagement.click();
        Thread.sleep(3000);
        koalaPalacePage.hotelRooms.click();
    }

    @When("user selects idhotel")
    public void user_selects_idhotel() throws InterruptedException {
        Thread.sleep(3000);
        koalaPalacePage.addHotelRoomButton.click();
        Select select = new Select(koalaPalacePage.idHotelDropdown);
        select.selectByValue("6");
    }

    @When("user enters the code")
    public void user_enters_the_code() {
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        koalaPalacePage.code.sendKeys(ConfigReader.getProperty("kaolahotel_code"));
    }

    @When("user enters the name")
    public void user_enters_the_name() {
        koalaPalacePage.name.sendKeys(ConfigReader.getProperty("kaola_name"));
    }

    @When("user enters the location")
    public void user_enters_the_location() {
        koalaPalacePage.location.sendKeys(ConfigReader.getProperty("kaolalocation"));
    }

    @When("user enters description")
    public void user_enters_description() {
        koalaPalacePage.description.sendKeys(ConfigReader.getProperty("description"));
    }

    @When("user enter the price")
    public void user_enter_the_price() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(3000);
        //Perform drag and drop
        actions.dragAndDrop(koalaPalacePage.frompriceOption, koalaPalacePage.topriceBox).perform();
    }

    @When("user selects the room type")
    public void user_selects_the_room_type() throws InterruptedException {
        Thread.sleep(3000);
        Select selectRoomType = new Select(koalaPalacePage.roomTypeDropdown);
        selectRoomType.selectByVisibleText("King");
    }

    @When("user enters the max adult count")
    public void user_enters_the_max_adult_count() {
        koalaPalacePage.maxAdultCount.sendKeys(ConfigReader.getProperty("kaola_max_adult"));
    }

    @When("user enters the max children count")
    public void user_enters_the_max_children_count() {
        koalaPalacePage.maxChildrenCount.sendKeys(ConfigReader.getProperty("kaola_max_children"));
    }

    @When("user clicks approved button")
    public void user_clicks_approved_button() {
        koalaPalacePage.approvedCheckbox.click();

    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
        koalaPalacePage.saveButton.click();
    }

    @When("user verify the alert has successfully")
    public void user_verify_the_alert_has_successfully() throws InterruptedException {
        Thread.sleep(4000);
        String successMessage = koalaPalacePage.successMessage.getText();
        Assert.assertEquals(successMessage,"HotelRoom was inserted successfully");
    }

    @When("user clicks ok button")
    public void user_clicks_ok_button() throws InterruptedException {
        koalaPalacePage.okButton.click();
        Thread.sleep(3000);
        Driver.closeDriver();
    }

    @When("user search in code box data")
    public void user_search_in_code_box_data() {
        koalaPalacePage.codeSearchButton.sendKeys("9191");
    }

    @Then("verify name field with your hotel code")
    public void verify_name_field_with_your_hotel_code() {
        Assert.assertTrue(koalaPalacePage.codeSearchButton.isDisplayed());
    }

}
