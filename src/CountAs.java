// Create a function that takes a filename as string parameter,
// counts the occurrences of the letter "a", and returns it as a number.
// If the file does not exist, the function should return 0 and not break.

// example: on the input "afile.txt" the function should return 28 - print this result
// example: on the input "not-a-file" the function should return 0 - print this result


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountAs {
  public static void main(String[] args) {
    Path filePath = Paths.get("src/afile.txt");
    try {
      List<String> line = Files.readAllLines(filePath);
      System.out.println(countLetterAs(line.get(0), 'a'));
    } catch (IOException e) {
      System.out.println(0);
    }
  }

  public static int countLetterAs(String input, char x) {
    input = input.toLowerCase();
    int count = 0;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == x) {
        count++;
      }
    }
    return count;
  }
}