//Called in _Assignment2.java Class
import java.io.File;
import java.io.IOException;

public class FileClass {
    //For IOException

    /*public static void openfile() throws IOException{

            File file = new File("C:\\abc.txt");
            file.createNewFile();*/

    // For IllegalStateException

    public static void test() throws IllegalStateException {
        throw new IllegalStateException();


    }
}
