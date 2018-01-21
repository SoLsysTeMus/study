package CalculatorOOP;


public class Controller {
   public static void main(String[] args) {

      Calculator calculator = new Calculator();
      calculator.start();
      calculator.selectOperation();
      calculator.getResult();
   }
}
