package homepage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AllFunctionality;

public class TestAllFunctionality extends CommonAPI {

    @Test
    public void newsFeatures(){
        AllFunctionality featureNews = PageFactory.initElements(driver, AllFunctionality.class);
        featureNews.sectionMenu(driver);
    }
}
