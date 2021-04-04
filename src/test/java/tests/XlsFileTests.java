package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import com.codeborne.xlstest.XLS;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.EducationFiles.getXls;

public class XlsFileTests {

    @Test
    public void checkXlsSimpleTest() throws IOException {
        String xlsFilePath = "./src/test/resources/xlsexample.xls";
        String expectedData = "Hashimoto";

        XLS xls = getXls(xlsFilePath);
        String actualData = xls.excel.getSheetAt(0).getRow(2).getCell(2).toString();
        assertThat(actualData, containsString(expectedData));
    }
}
