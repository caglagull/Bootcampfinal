package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InsiderPages {

    public InsiderPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//*[@id='wt-cli-accept-all-btn']")
    public WebElement accept;

    @FindBy(xpath = "(//img[@src='https://useinsider.com/assets/img/logo-old.png'])[1]")
    public static WebElement insiderlogo;



    @FindBy(xpath = "(//*[@id='navbarDropdownMenuLink'])[5]")
    public WebElement company;

    @FindBy(xpath = "//*[@class='dropdown-sub' and text()='Careers']")
    public  static WebElement career;

    @FindBy(xpath = "//*[@class='big-title big-title-media mt-4 mt-lg-0']")
    public static WebElement bigtitle;


    @FindBy(xpath = "//*[@class='btn btn-info rounded mr-0 mr-md-4 py-3' and text()='Find your dream job']")
    public WebElement findjob;



    @FindBy(xpath = "//*[@class='big-title big-title-media mt-4 mt-lg-0']")
    public static WebElement bigtitle2;


    @FindBy(xpath = "//*[@class='btn btn-outline-secondary rounded text-medium mt-2 py-3 px-lg-5 w-100 w-md-50']")
    public WebElement seealljob;


    @FindBy(css = ".mb-2")
    public static WebElement positiontitle;


    @FindBy(xpath = "//select[@id='filter-by-location']")
    public static WebElement filterlocation;

    @FindBy(xpath = "//select[@id='filter-by-department']")
    public static  WebElement filterdepartmen;

    @FindBy(className = "mb-0")
    public WebElement browseposition;

    @FindBy(xpath = "(//*[@class='btn btn-navy rounded pt-2 pr-5 pb-2 pl-5'])[1]")
    public WebElement role;

    @FindBy(xpath = "//*[@class='button button-sm cc-btn cc-dismiss']")
    public WebElement dismiss;



}
