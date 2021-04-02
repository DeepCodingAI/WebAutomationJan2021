package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage {

    @FindBy(how = How.CSS, using = "#page-nav")
    public static WebElement sectionNavBarWebElement;

    @FindBy(how = How.CSS,using = "span.search-text")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS,using = "#page-nav .icon-email")
    public static WebElement signUpWebElement;

    public void clickOnSectionMenu(){
        sectionNavBarWebElement.click();
    }
    public void clickOnSearch(){
        searchWebElement.click();
    }
    public void signUp(){
        signUpWebElement.click();
    }
}
