package wordsCounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WordsCounter {

   private static String fileName;
   private static TreeMap<String, Integer> words = new TreeMap<>();
   private static int maxCount;

   public static void main(String[] args) throws IOException {

      fileName = "src/main/resources/textData";

      readWordsFromFile();
      printAllWordAndCount();
      searchMaxCount();
      printSearchWord();
   }

   private static void readWordsFromFile() throws IOException {

      BufferedReader reader = new BufferedReader(new FileReader(fileName));

      while (reader.ready()){
         String [] temp = reader.readLine().split("\\s");

         for (String s : temp) {
            String word = s.toLowerCase().trim().replaceAll("\\p{Punct}","");
            if (words.containsKey(word)){
               words.put(word.toLowerCase(), words.get(word) + 1);
            } else {
               words.put(word.toLowerCase(), 1);
            }
         }
      }

      reader.close();
   }

   private static void printAllWordAndCount() {
      for (Map.Entry <String, Integer> pairs: words.entrySet()) {
         System.out.println(pairs.getKey() + " - " + pairs.getValue());
      }
   }

   private static void searchMaxCount() {
      for (Map.Entry <String, Integer> pairs: words.entrySet()) {
         if(pairs.getValue() > maxCount){
            maxCount = pairs.getValue();
         }
      }
   }

   private static void printSearchWord() {
      for (Map.Entry <String, Integer> pairs: words.entrySet()) {
         if(pairs.getValue() == maxCount){
            System.out.println("Слово с максимальным количеством повторений - \"" + pairs.getKey()
                                          + "\". Встречается в тексте - " + pairs.getValue() + " раз.");
         }
      }
   }

}
