package education;

import org.junit.jupiter.api.Test;
import utils.EducationFiles;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TxtFileTests {

    @Test
    public void txtTest() throws IOException {
        String textFilePath = "./src/test/resources/educationfiles/1.txt";
        String expectedData = "hello qa.guru students!";

        String actualData = EducationFiles.readTextFromPath(textFilePath);

        assertThat(actualData).contains(expectedData);
    }

    @Test
    public void csvTest() throws IOException {
        String csvFilePath = "./src/test/resources/educationfiles/1.csv ";
        String expectedData = "hello qa.guru students!";

        String actualData = EducationFiles.readTextFromPath(csvFilePath );

        assertThat(actualData).contains(expectedData);
    }
}
