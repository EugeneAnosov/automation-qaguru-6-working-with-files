package tests;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.xmlbeans.XmlException;
import org.junit.jupiter.api.Test;
import utils.EducationFiles;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DocxFileTests {
    @Test
    public void checkDocxTest() throws IOException, OpenXML4JException, XmlException {
        String docxFilePath = "./src/test/resources/allure-report.docx";
        String expectedData = "development process to extract maximum of useful information from everyday execution of tests.";

        String actualData = EducationFiles.readDocxFromPath(docxFilePath);

        assertThat(actualData).contains(expectedData);
    }
}
