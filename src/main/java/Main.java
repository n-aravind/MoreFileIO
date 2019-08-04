import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path file = Paths.get(System.getProperty("user.dir"),"logs","application.log");
        try {
            Files.createFile(file);
        } catch (FileAlreadyExistsException x) {
            System.err.format("file named %s" +
                    " already exists%n", file);
        } catch (IOException x) {
            System.err.format("createFile error: %s%n", x);
        }


        //temp file

        try{
            Path tempFile = Files.createTempFile("hello",".log");
            System.out.format("The temporary file" + " has been created: %s%n", tempFile);
        } catch (IOException x){
            x.printStackTrace();
        }


    }
}
