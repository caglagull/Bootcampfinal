package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {


    static WebDriver driver;


    public static WebDriver getDriver(){



        if(driver==null){
            switch (ConfigReader.getProperty("browser")){

                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;

                case"edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case"mozilla":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case"safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
            }
            driver.manage().window().maximize();


        }
        return driver;


    }

    public static void closedriver(){

        if(driver!=null)
            driver.quit();
        driver=null;

    }
}
