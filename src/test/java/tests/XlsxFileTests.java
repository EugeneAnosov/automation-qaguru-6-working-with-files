package tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.EducationFiles.readXlsxFromPath;

public class XlsxFileTests {

    @Test
    public void checkXlsxCellTest() {
        String xlsxFilePath = "./src/test/resources/xlsx2.xlsx";
        String expectedData = "ListMonths";

        String actualData = readXlsxFromPath(xlsxFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
