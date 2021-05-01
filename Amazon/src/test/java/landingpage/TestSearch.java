package landingpage;

import base.CommonAPI;
import datasuply.DataReader;
import org.testng.annotations.Test;
import reporting.TestLogger;
import searchpage.SearchPage;

import java.util.List;

public class TestSearch extends SearchPage {
    DataReader dataReader = new DataReader();
    @Test
    public void searchTest() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchItemsOnAmazon();
    }
}
