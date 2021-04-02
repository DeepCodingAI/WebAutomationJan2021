package landingpage;

import base.CommonAPI;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;

public class DropDownMenu extends CommonAPI {

    @Test
    public void dropDownMenu(){
        List<String> menuList = getListOfText(".nav-search-dropdown.searchSelect option");
        for(String value:menuList){
            System.out.println(value);
        }
    }
}
