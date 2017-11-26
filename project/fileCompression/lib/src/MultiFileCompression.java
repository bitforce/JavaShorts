package lib.src;
import java.util.zip.*;
import java.nio.file.*;
import java.io.*;
class MultiFileCompression {
    private static void zip(String... paths) {
        try {
            ZipOutputStream zos = 
                new ZipOutputStream(new FileOutputStream
                        (new File(paths[0]).getName().concat(".zip")));
            for(String fname : paths) {
                zos.putNextEntry(new ZipEntry(new File(fname).getName()));
                byte[] bytes = Files.readAllBytes(Paths.get(fname));
                zos.write(bytes, 0, bytes.length);
                zos.closeEntry();
            }
            zos.close();
        }
        catch(FileNotFoundException e) {System.err.format("%s does not exist", e);}
        catch(IOException e) {System.err.format("I/O error: ", e);}
    }
    public static void main(String[] args) {zip(args);}
}
