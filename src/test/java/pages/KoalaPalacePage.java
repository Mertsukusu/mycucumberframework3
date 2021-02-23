package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaPalacePage {
    public KoalaPalacePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Log in")
    public WebElement LoginButton;
    @FindBy(id = "UserName")
    public WebElement usernameBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginSubmitButton;

    @FindBy(linkText = "Hotel Management")
    public WebElement hotelManagement;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRooms;

    @FindBy(xpath = "//span[contains(text(),'Add Hotelroom')]")
    public WebElement addHotelRoomButton;

    @FindBy(id = "IDHotel")
    public WebElement idHotelDropdown;

    @FindBy(id = "Code")
    public WebElement code;

    @FindBy(id = "Name")
    public WebElement name;

    @FindBy(id = "Location")
    public WebElement location;

    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement description;

    @FindBy(id = "Price")
    public WebElement topriceBox;

    @FindBy(partialLinkText = "200")
    public WebElement frompriceOption;

    @FindBy(id = "IDGroupRoomType")
    public WebElement roomTypeDropdown;

    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdultCount;

    @FindBy(id = "MaxChildCount")
    public WebElement maxChildrenCount;

    @FindBy(id = "IsAvailable")
    public WebElement approvedCheckbox;

    @FindBy(id = "btnSubmit")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successMessage;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement okButton;

    @FindBy(xpath = "//thead/tr[2]/td[3]/input[1]")
    public WebElement codeSearchButton;

    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement codeField;



}
