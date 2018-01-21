package CalculatorOOP.Operations;

public class Addition extends AbstractOperation {

   public Addition(double a, double b) {
      super(a, b);
   }

   @Override
   public double result() {
      return getA() + getB();
   }
}
