package utils;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class Zip {
    public static void unZip(String path, String unzipPath, String password) throws ZipException {
        ZipFile zipFile = new ZipFile(path);
        if (zipFile.isEncrypted()) {
            zipFile.setPassword(password);
        }
        zipFile.extractAll(unzipPath);
    }

    public static void unZipWithoutPassword(String path, String unzipPath) throws ZipException {
        ZipFile zipFile = new ZipFile(path);
        zipFile.extractAll(unzipPath);
    }
}
