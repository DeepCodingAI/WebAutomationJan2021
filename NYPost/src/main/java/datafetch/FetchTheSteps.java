package datafetch;

import datasource.ConnectToExcelFile;

import java.io.IOException;

public class FetchTheSteps {

    ConnectToExcelFile excelFile = new ConnectToExcelFile();

    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"/NYPost/data/nyp-test-steps.xls";
        String [] data = excelFile.fileReader2(path,0);

        return data;
    }

}
