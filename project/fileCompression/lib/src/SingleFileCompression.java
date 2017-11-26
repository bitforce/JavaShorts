package lib.src;
import java.util.zip.*;
import java.nio.file.*;
import java.io.*;
class SingleFileCompression {
    private static void zip(String path) {
        FileOutputStream fos = null; // A.1
        ZipOutputStream zos = null; // A.2
        String fname = null;
        File file = null;
        File dir = null;
        try {
            file = new File(path); // A.3
            fname = file.getName().concat(".zip"); // A.4
            fos = new FileOutputStream(fname); // A.5
            zos = new ZipOutputStream(fos); // A.6
            zos.putNextEntry(new ZipEntry(file.getName())); // A.7
            byte[] bytes = Files.readAllBytes(Paths.get(path)); // A.8
            zos.write(bytes, 0, bytes.length); // A.9
            // A.10:2J
            zos.closeEntry();
            zos.close();
        }
        catch(FileNotFoundException e) {System.err.format("%s does not exist", path);}
        catch(IOException e) {System.err.format("I/O error " + e);}
    }
    public static void main(String[] args) {zip(args[0]);}
}
