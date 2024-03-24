package tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InsiderPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class InsiderPageClass {




    @Test

    public void test() throws IOException, InterruptedException {

        InsiderPages pages=new InsiderPages();
        Driver.getDriver().get(ConfigReader.getProperty("insiderUrl"));
        ReusableMethods.getScreenshot("tüm ekran resmi");
        ReusableMethods.waitForVisibility(pages.insiderlogo,5);
        Assert.assertTrue(InsiderPages.insiderlogo.isDisplayed());
        pages.accept.click();

        ReusableMethods.getScreenshot("tüm ekran resmi");
        pages.company.click();
        ReusableMethods.getScreenshot("tüm ekran resmi");
        Assert.assertTrue(InsiderPages.career.isEnabled());
        pages.career.click();
        ReusableMethods.waitForVisibility(pages.bigtitle,5);
        ReusableMethods.getScreenshot("tüm ekran resmi");
        Assert.assertTrue(InsiderPages.bigtitle.isDisplayed());


        Driver.getDriver().get(ConfigReader.getProperty("insidercareers"));

        ReusableMethods.waitForVisibility(pages.bigtitle2,5);
        ReusableMethods.getScreenshot("tüm ekran resmi");

        Assert.assertTrue(InsiderPages.bigtitle2.isDisplayed());

        pages.seealljob.click();
        ReusableMethods.getScreenshot("tüm ekran resmi");

        Thread.sleep(3000);

        ReusableMethods.waitForVisibility(pages.positiontitle,10);
        ReusableMethods.getScreenshot("tüm ekran resmi");
        Assert.assertTrue(InsiderPages.positiontitle.isDisplayed());


        ReusableMethods.waitForVisibility(pages.filterlocation,10);
        Assert.assertTrue(InsiderPages.filterlocation.isEnabled());

        Thread.sleep(3000);
        Select slc=new Select(pages.filterlocation);
        slc.selectByIndex(1);
        ReusableMethods.getScreenshot("tüm ekran resmi");


        Select slc2=new Select(pages.filterdepartmen);
        slc2.selectByVisibleText("Quality Assurance");
        ReusableMethods.getScreenshot("tüm ekran resmi");

        ReusableMethods.waitForVisibility(pages.browseposition,10);
        Assert.assertTrue(pages.browseposition.isDisplayed());
        Thread.sleep(5000);

        Actions actions=new Actions(Driver.getDriver());
        actions.click(pages.role).perform();

        Thread.sleep(5000);


        ReusableMethods.getScreenshot("tüm ekran resmi");

        ReusableMethods.switchToWindow("Senior Software Quality");
        String expectedtitle="Senior Software Quality";
        String actualtitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualtitle.contains(expectedtitle));

        Thread.sleep(5000);
        Driver.closedriver();
    }
}
