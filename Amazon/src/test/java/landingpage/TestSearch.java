package landingpage;

import base.CommonAPI;
import datasuply.DataReader;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearch extends CommonAPI {
    DataReader dataReader = new DataReader();
    @Test
    public void search() throws Exception {
        List<String> list = dataReader.getItemListFromDB();
        for(String items:list){
            typeOnCss("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }
}
