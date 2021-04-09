package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage {

    @FindBy(how = How.CSS, using = "#contact_fields_email")
    public static WebElement emailFieldWebElement;

    @FindBy(how = How.CSS, using = "div.submit-field > input[type=submit]")
    public static WebElement signUpWebElement;

    public WebElement getEmailFieldWebElement(){
        return emailFieldWebElement;
    }

    public WebElement getSignUpWebElement(){
        return signUpWebElement;
    }

    public void enterEmailAddress(String value){
        getEmailFieldWebElement().sendKeys(value);
    }

    public void clickOnSignUp(){
        getSignUpWebElement().click();
    }

}
