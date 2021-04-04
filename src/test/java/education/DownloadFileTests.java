package education;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import utils.EducationFiles;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DownloadFileTests {

    @Test
    void selenideDownloadReadmeTest() throws IOException {

        Configuration.downloadsFolder = "./src/resources/educationfiles/income";

        open("https://github.com/selenide/selenide/blob/master/README.md");
        File downloadedFile = $("#raw-url").download();
        String fileContent = EducationFiles.readTextFromFile(downloadedFile);
        assertThat(fileContent).contains("Selenide = UI Testing Framework powered by Selenium WebDriver");

        //Selenide = UI Testing Framework powered by Selenium WebDriver
    }
}
