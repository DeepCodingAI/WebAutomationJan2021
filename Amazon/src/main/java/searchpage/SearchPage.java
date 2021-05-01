package searchpage;

import base.CommonAPI;
import datasuply.DataReader;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends CommonAPI{
    DataReader dataReader = new DataReader();
    public void searchItemsOnAmazon() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = dataReader.getItemListFromDB();
        for(String items:list){
            typeOnCss("#twotabsearchtextbox", items);
            sleepFor(1);
            clearInputField("#twotabsearchtextbox");
        }
    }
}
