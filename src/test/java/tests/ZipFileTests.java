package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.EducationFiles.readTextFromPath;
import static utils.Zip.unZip;

public class ZipFileTests {

    @Test
    public void checkZipFileWithPasswordTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/testzip1.zip";
        String unzipFolderPath = "./src/test/resources/unzip";
        String unzipTxtFilePath = "./src/test/resources/unzip/testzip1.txt";
        String password = "111";
        String expectedData = "This is .zip archive";

        unZip(zipFilePath, unzipFolderPath, password);

        String actualData = readTextFromPath(unzipTxtFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
