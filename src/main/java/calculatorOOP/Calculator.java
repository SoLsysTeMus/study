package calculatorOOP;


import calculatorOOP.operations.Addition;
import calculatorOOP.operations.Division;
import calculatorOOP.operations.Multiplication;
import calculatorOOP.operations.Subtraction;

import java.util.Scanner;

public class Calculator {

   private double a, b, result;
   private int operationNumber;
   private boolean correctOperationNumber =true;

   private Scanner scanner = new Scanner(System.in);

   public void start(){
      System.out.println("This is calculator.");

      System.out.print("Enter the first number: ");
      setA(scanner.nextDouble());

      System.out.print("Enter the second number: ");
      setB(scanner.nextDouble());
   }

   public void selectOperation(){

      System.out.print("Select operationNumber:\n" +
              "1 - Addition\n" +
              "2 - Subtraction\n" +
              "3 - Multiplication\n" +
              "4 - Division\n" +
              "Operation: ");

      setOperationNumber(scanner.nextInt());

      switch (getOperationNumber()) {
         case 1:
            setResult(new Addition(getA(),getB()).result());
            break;

         case 2:
            setResult(new Subtraction(getA(),getB()).result());
            break;

         case 3:
            setResult(new Multiplication(getA(),getB()).result());
            break;

         case 4:
            setResult(new Division(getA(), getB()).result());
            break;

         default:
            System.out.println("Invalid operationNumber number!");
            setCorrectOperationNumber(false);
      }
      scanner.close();
   }

   private double getA() {
      return a;
   }

   private void setA(double a) {
      this.a = a;
   }

   private double getB() {
      return b;
   }

   private void setB(double b) {
      this.b = b;
   }

   private int getOperationNumber() {
      return operationNumber;
   }

   private void setOperationNumber(int operationNumber) {
      this.operationNumber = operationNumber;
   }

   public void getResult() {
      if (isCorrectOperationNumber()) {
         System.out.println("==========================");
         System.out.printf("Result is: %.4f", result);
      }
   }

   private void setResult(double result) {
      this.result = result;
   }

   private boolean isCorrectOperationNumber() {
      return correctOperationNumber;
   }

   private void setCorrectOperationNumber(boolean correctOperationNumber) {
      this.correctOperationNumber = correctOperationNumber;
   }
}
