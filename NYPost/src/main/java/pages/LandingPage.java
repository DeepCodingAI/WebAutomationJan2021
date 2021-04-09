package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage {

    @FindBy(how = How.CSS, using = "nav#page-nav.page-nav")
    public static WebElement sectionNavBarWebElement;

    @FindBy(how = How.CSS,using = "span.search-text")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS,using = "#page-nav .icon-email")
    public static WebElement signUpWebElement;

    public void clickOnSearch(){
        searchWebElement.click();
    }
    public void signUp(){
        signUpWebElement.click();
    }

    public void clickOnSignUp(){
        signUpWebElement.click();
    }

    public void clickOnSectionMenu()throws InterruptedException{
        try {
            sectionNavBarWebElement.click();
        }catch(Exception ex){
            CommonAPI.navigateBack();
            Thread.sleep(2000);
            sectionNavBarWebElement.click();
        }
    }
}
