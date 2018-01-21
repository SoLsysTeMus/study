package CalculatorOOP.Operations;

public class Multiplication extends AbstractOperation {

   public Multiplication(double a, double b) {
      super(a, b);
   }

   @Override
   public double result() {
      return getA() * getB();
   }
}
