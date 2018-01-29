package calculatorOOP.operations;

public class Subtraction extends AbstractOperation {

   public Subtraction(double a, double b) {
      super(a, b);
   }

   @Override
   public double result() {
      return getA() - getB();
   }
}
