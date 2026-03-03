import java.io.FileWriter;
import java.io.IOException;

public class program15 {
  public static void main(String[] args) {
    String fileName = "example.txt"; // Existing file name
    String textToAppend = "This text will be appended to the file.\n";

    try {
      // true → append mode
      FileWriter fw = new FileWriter(fileName, true);

      fw.write(textToAppend);
      fw.close();

      System.out.println("Text appended successfully to " + fileName);
    } catch (IOException e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }
}
