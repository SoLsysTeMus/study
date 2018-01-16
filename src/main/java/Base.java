import java.util.Scanner;

public class Base {

   /**
    * This is our first Java class
    */
   public static void main(String[] args) {

      int task;
      Scanner scanner = new Scanner(System.in);

      System.out.print("Select number of task:\n" +
              "1 - Calculator\n" +
              "2 - String Array\n" +
              "Task: ");

      task = scanner.nextInt();

      switch (task){
         case 1 :
            System.out.println("==========================");
            Calculator.start();
         break;

         case 2 :
            System.out.println("==========================");
            ArraySearch.start();
         break;

         default:
            System.out.println("Invalid task");
      }

      scanner.close();
   }
}
