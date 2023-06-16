import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void read() {

        FileReader file = null;
        try {
            file = new FileReader("text.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("The file not found");
        }
        finally {
            try {
                file.close();
            } catch (IOException e) {
                System.out.print(e.getMessage());
            }
        }

    }

    public static void main(String[] args) {

        read();

    }
}