package lib.src;
import java.nio.file.attribute.*;
import java.nio.file.*;
import java.util.zip.*;
import java.io.*;
class DirectoryCompression extends SimpleFileVisitor<Path> {
    private static ZipOutputStream zos;
    private Path path;
    public DirectoryCompression(Path path) {this.path = path;}
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {
        try {
            zos.putNextEntry(new ZipEntry(path.relativize(file).toString()));
            byte[] bytes = Files.readAllBytes(file);
            zos.write(bytes, 0, bytes.length);
            zos.closeEntry();
        } catch(IOException e) {System.err.println(e);}
        return FileVisitResult.CONTINUE;
    }
    public static void main(String[] args) {
        Path path = Paths.get(args[0]);
        try {
            zos = new ZipOutputStream(new FileOutputStream(args[0].concat(".zip")));
            Files.walkFileTree(path, new DirectoryCompression(path));
            zos.close();
        } catch(IOException e) {System.err.println("I/O Error: " + e);}
    }
}
