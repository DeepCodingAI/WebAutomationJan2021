package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;

public class SectionArticleNews extends CommonAPI {

    @Test
    public void getSectionNews(){
        driver.findElement(By.cssSelector("#sections span.menu-icon .menu-icon-svg")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector(".menu.menu-main-menu li a"));
        for(WebElement element:elements) {
            System.out.println(element.getText());
        }
    }
}
