import giftAssembly.GiftController;

import java.util.Scanner;

public class Base {

   /**
    * This is our first Java class
    */


   public static void runHomeWork4(String[] args) {

      int task;
      Scanner scanner = new Scanner(System.in);

      System.out.print("Select number of task:\n" +
              "1 - Change elements positions in Array \n" +
              "2 - Gift assembly\n" +
              "Task: ");

      task = scanner.nextInt();

      switch (task) {
         case 1:
            System.out.println("==========================");
            ArrayElementsChange.start();
            break;

         case 2:
            System.out.println("==========================");
            GiftController.start();
            break;

         default:
            System.out.println("Invalid task");
      }

      scanner.close();


   }


   public static void runHomeWork2(String[] args) {

      int task;
      Scanner scanner = new Scanner(System.in);

      System.out.print("Select number of task:\n" +
              "1 - Calculator\n" +
              "2 - String Array\n" +
              "Task: ");

      task = scanner.nextInt();

      switch (task) {
         case 1:
            System.out.println("==========================");
            Calculator.start();
            break;

         case 2:
            System.out.println("==========================");
            ArraySearch.start();
            break;

         default:
            System.out.println("Invalid task");
      }

      scanner.close();
   }
}
