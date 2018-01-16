import java.util.Scanner;

/**
 * Created by Aplana
 * @author Dmitriy
 * @version 2
 */
public class Calculator {

   public static void start() {

      int operation;
      boolean correctOperationNumber = true;
      double a, b, result = 0;
      Scanner scanner = new Scanner(System.in);

      System.out.println("This is calculator.");

      System.out.print("Enter the first number: ");
      a = scanner.nextDouble();

      System.out.print("Enter the second number: ");
      b = scanner.nextDouble();

      System.out.print("Select operation:\n" +
              "1 - Addition\n" +
              "2 - Subtraction\n" +
              "3 - Multiplication\n" +
              "4 - Division\n" +
              "Operation: ");
      operation = scanner.nextInt();

      scanner.close();

      switch (operation){
         case 1: result = addition(a, b);
         break;

         case 2: result = subtraction(a, b);
         break;

         case 3: result = multiplication(a, b);
         break;

         case 4: result = division(a, b);
         break;

         default:
            System.out.println("Invalid operation number!");
            correctOperationNumber = false;
      }

      if(correctOperationNumber) {
         System.out.println("==========================");
         System.out.printf("Result is: %.4f", result);
      }
   }

   private static double addition(double a, double b){
      return a + b;
   }

   private static double subtraction(double a, double b){
      return a - b;
   }

   private static double multiplication(double a, double b){
      return a * b;
   }

   private static double division(double a, double b){
      return a / b;
   }


}
