import java.util.Scanner;

/**
 * Created by Aplana
 * @author Dmitriy
 * @version 1
 */
public class Calculator {

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      float a, b, sum;

      System.out.println("Enter the first number");
      a = scanner.nextFloat();

      System.out.println("Enter the second number");
      b = scanner.nextFloat();

      scanner.close();

      sum = a + b;

      System.out.printf("Sum is: %.4f", sum);
   }
}
