package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SectionPage {

    @FindBy(how = How.CSS,using = "#sections > span.pages.menu-icon > svg")
    public static WebElement sectionMenuWebElement;

    @FindBy(how = How.CSS,using = ".menu-main-menu li:nth-child(3) a")
    public static WebElement metroMenuWebElement;

    @FindBy(how = How.CSS,using = ".menu-main-menu li:nth-child(6) a")
    public static WebElement businessMenuWebElement;

    public BusinessPage goToBusinesssPage(WebDriver driver){
        businessMenuWebElement.click();

        return new BusinessPage(driver);
    }
}
