import java.util.Scanner;

/**
 * Created by Aplana
 *
 * @author Dmitriy
 * @version 1
 */
public class ArraySearch {

   public static void start() {

      String[] words;
      int arrayLength;
      int maxLengthForWords;
      Scanner scanner = new Scanner(System.in);

      System.out.println("This is String Array");

      System.out.print("Enter array length: ");
      arrayLength = scanner.nextInt();

      words = new String[arrayLength];

      addWordsToArray(words, scanner);
      scanner.close();

      maxLengthForWords = getMaxLength(words);

      printWords(words, maxLengthForWords);
   }

   private static void printWords(String[] words, int maxLengthForWords) {
      for (String word : words) {
         if (word.length() == maxLengthForWords) {
            System.out.println(word);
         }
      }
   }

   private static void addWordsToArray(String[] words, Scanner scanner) {
      for (int i = 0; i < words.length; i++) {
         System.out.print("Enter the word: ");
         words[i] = scanner.next();
      }
   }

   private static int getMaxLength(String[] words) {
      int max = 0;

      for (String word : words) {
         if (word.length() > max) {
            max = word.length();
         }
      }

      return max;
   }
}
