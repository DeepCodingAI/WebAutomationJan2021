package homepage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.AllFunctionality;
import reporting.TestLogger;

import java.io.IOException;

public class TestAllFunctionality extends CommonAPI {

    @Test
    public void newsFeatures() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AllFunctionality featureNews = PageFactory.initElements(driver, AllFunctionality.class);
        featureNews.runAllTheFeatureTest(driver);
    }
}
