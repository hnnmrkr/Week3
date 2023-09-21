import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    // Exercise 50 - get user input and give first, second and third letter
    /* System.out.println("Type your name: ");
    String name = reader.nextLine();

    System.out.println( "Character one: " + name.substring(0, 1));
    System.out.println( "Character two: " + name.substring(1, 2));
    System.out.println( "Character three: " + name.substring(2, 3)); */

    // Exercise 53 - Print out first part of a word
    /* System.out.println("Type a word: ");
    String word = reader.nextLine();

    System.out.println("Length of the word: " + word.length());
    System.out.println("Result: " + word.substring(0, 4)); */

    // Exercise 58 - Let user insert words into an array until they repeat a word
    /* ArrayList<String> words = new ArrayList<String>();

    while (true) {
      System.out.println("Type a word: ");
      String input = reader.nextLine();

      if (words.contains(input)) {
        System.out.println("You have already typed " + input);
        break;
      }
      words.add(input);
    } */

    // Exercise 60 - Words in alphabetical order
    /* ArrayList<String> words = new ArrayList<String>();

    while (true) {
      System.out.println("Type a word: ");
      String input = reader.nextLine();

      if (input.equals("End")) {
        break;
      }
      words.add(input);
    }

    Collections.sort(words);

    System.out.println("You typed the following words: ");
    for (String word : words) {
      System.out.println(word);
    } */

  }
}