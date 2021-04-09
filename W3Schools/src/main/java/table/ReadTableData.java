package table;

import base.CommonAPI;
import org.openqa.selenium.By;

public class ReadTableData extends CommonAPI {

    public void readTableData(){
        String tableData = driver.findElement(By.cssSelector(".w3-table-all.notranslate tr:nth-child(5) td:nth-child(4)")).getText();
        System.out.println(tableData);
    }
}
