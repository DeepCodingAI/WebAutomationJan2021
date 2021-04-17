package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SectionPage {

    @FindBy(how = How.CSS,using = "#sections > span.pages.menu-icon > svg")
    public static WebElement sectionMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(3) a")
    public static WebElement metroMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(6) a")
    public static WebElement businessMenuWebElement;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(8) a")
    public static WebElement entertainmentMenuWebElement;

    public WebElement getSectionMenuWebElement(){

        return sectionMenuWebElement;
    }

    public WebElement getMetroMenuWebElement(){

        return metroMenuWebElement;
    }
    public WebElement getBusinessMenuWebElement(){

        return businessMenuWebElement;
    }
    public WebElement getEntertainmentMenuWebElement(){

        return entertainmentMenuWebElement;
    }
    public void clickOnSectionMenuTab(){
        getSectionMenuWebElement().click();
    }
    public MetroPage goToMetroPage(WebDriver driver){
        getMetroMenuWebElement().click();
        return new MetroPage(driver);
    }
    public BusinessPage goToBusinessPage(WebDriver driver)throws InterruptedException{
        try {
            getBusinessMenuWebElement().click();
        }catch (Exception ex){
            CommonAPI.navigateBack();
            Thread.sleep(1000);
            getBusinessMenuWebElement().click();
        }
        return new BusinessPage(driver);
    }
    public EntertainmentPage goToEntertainmentPage(WebDriver driver){
        getEntertainmentMenuWebElement().click();
        return new EntertainmentPage(driver);
    }
}
