package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MetroPage extends News {

    private final WebDriver driver;
    public MetroPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "div.headline-container a:nth-child(2) h3")
    public static WebElement headLineNewsWebElement;

    public WebElement getHeadLineNewsWebElement(){
        return headLineNewsWebElement;
    }
    public String getHeadLineNewsText(){
        String headLine = getHeadLineNewsWebElement().getText();
        return headLine;
    }

}
