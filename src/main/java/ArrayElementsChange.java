import java.util.Random;

public class ArrayElementsChange {


   public static void start() {

      int[] array = new int[20];

      initArray(array);

      int indexOfMinPositive = searchMinPositiveIndex(array);
      int indexOfMaxNegative = searchMaxNegativeNumIndex(array);

      System.out.print("Before change elements position ");
      printArray(array);

      changeElementsPosition(array, indexOfMinPositive, indexOfMaxNegative);

      System.out.print("After change elements position  ");
      printArray(array);

   }

   private static void printArray(int[] array) {
      System.out.print("[");
      for (int num : array) {
         System.out.printf("%4d", num);
      }
      System.out.println("]");
   }

   private static void changeElementsPosition(int[] array, int maxIndex, int minIndex) {

      int temp = array[maxIndex];
      array[maxIndex] = array[minIndex];
      array[minIndex] = temp;

   }

   private static int searchMinPositiveIndex(int[] array) {

      int minPositiveNumber = Integer.MAX_VALUE;
      int indexOfMinPositive = 0;

      for (int i = 0; i < array.length; i++) {
         if (array[i] < minPositiveNumber & array[i] > 0) {
            minPositiveNumber = array[i];
            indexOfMinPositive = i;
         }
      }

      System.out.println(String.format("Minimal positive number is %d, position %d",
              minPositiveNumber, indexOfMinPositive));

      return indexOfMinPositive;
   }

   private static int searchMaxNegativeNumIndex(int[] array) {

      int indexOfMaxNegative = 0;

      for (int i = 1; i < array.length; i++) {
         if (array[i] < array[indexOfMaxNegative] & array[i] < 0) {
            indexOfMaxNegative = i;
         }
      }

      System.out.println(String.format("Maximum negative number is %d, position %d",
              array[indexOfMaxNegative], indexOfMaxNegative));

      return indexOfMaxNegative;
   }

   private static void initArray(int[] array) {
      Random random = new Random();

      for (int i = 0; i < array.length; i++) {
         array[i] = random.nextInt(21) - 10;
      }
   }


}
