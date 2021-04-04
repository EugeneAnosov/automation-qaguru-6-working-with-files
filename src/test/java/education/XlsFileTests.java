package education;


import org.junit.jupiter.api.Test;

import java.io.IOException;

import com.codeborne.xlstest.XLS;
import static com.codeborne.xlstest.XLS.*;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.containsString;
import static utils.EducationFiles.getXls;
import static utils.EducationFiles.readXlsxFromPath;

public class XlsFileTests {

    @Test
    public void xlsSimpleTest() throws IOException {
        String xlsFilePath = "./src/test/resources/educationfiles/1.xls";
        String expectedData = "hello qa.guru students!";

        XLS xls = getXls(xlsFilePath);
        assertThat(xls, containsText(expectedData));
    }

    @Test
    public void xlsCellTest() throws IOException {
        String xlsFilePath = "./src/test/resources/files/1.xls";
        String expectedData = "hello qa.guru students!";

        XLS xls = getXls(xlsFilePath);
        String actualData = xls.excel.getSheetAt(0).getRow(3).getCell(1).toString();
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    public void xlsxCellTest() {
        String xlsxFilePath = "./src/test/resources/educationfiles/1.xlsx";
        String expectedData = "hello qa.guru students!";

        String actualData = readXlsxFromPath(xlsxFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
