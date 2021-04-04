package education;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.EducationFiles.readTextFromPath;
import static utils.Zip.unZip;
import static utils.Zip.unZipWithoutPassword;


public class ZipFileTests {

    @Test
    public void zipFileTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/educationfiles/1.zip";
        String unzipFolderPath = "./src/test/resources/educationfiles/unzip";
        String zipPassword = "";
        String unzipTxtFilePath = "./src/test/resources/educationfiles/unzip/1.txt";
        String expectedData = "hello qa.guru students!";

        unZip(zipFilePath, unzipFolderPath, zipPassword);

        String actualData = readTextFromPath(unzipTxtFilePath);

        assertThat(actualData, containsString(expectedData));
    }

    @Test
    public void zipFileWithoutPasswordTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/educationfiles/1.zip";
        String unzipFolderPath = "./src/test/resources/educationfiles/unzip";
        String unzipTxtFilePath = "./src/test/resources/educationfiles/unzip/1.txt";
        String expectedData = "hello qa.guru students!";

        unZipWithoutPassword(zipFilePath, unzipFolderPath);

        String actualData = readTextFromPath(unzipTxtFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
