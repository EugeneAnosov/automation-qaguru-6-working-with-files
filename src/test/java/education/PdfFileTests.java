package education;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;
import static utils.EducationFiles.getPdf;

public class PdfFileTests {

    @Test
    public void pdfTest() throws IOException {
        String pdfFilePath = "./src/test/resources/educationfiles/1.pdf";
        String expectedData = "How to download a file with Selenide";

        PDF pdf = getPdf(pdfFilePath);
        assertThat(pdf).containsExactText(expectedData);
    }
}
