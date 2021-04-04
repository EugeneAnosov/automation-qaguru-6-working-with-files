package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;
import static utils.EducationFiles.getPdf;

public class PdfFileTests {

    @Test
    public void checkPdfFileTest() throws IOException {
        String pdfFilePath = "./src/test/resources/pdfexample.pdf";
        String expectedData = "Collaborate With Others";

        PDF actualData = getPdf(pdfFilePath);
        assertThat(actualData).containsExactText(expectedData);
    }
}
