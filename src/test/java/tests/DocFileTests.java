package tests;

import org.junit.jupiter.api.Test;
import utils.EducationFiles;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DocFileTests {
    @Test
    public void checkDocTest() throws IOException {
        String docFilePath = "./src/test/resources/selenide.doc";
        String expectedData = "Contributions to Selenide are both welcomed and appreciated.";

        String actualData = EducationFiles.readDocFromPath(docFilePath);

        assertThat(actualData).contains(expectedData);
    }
}
