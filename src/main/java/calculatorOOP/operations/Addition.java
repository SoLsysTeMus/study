package calculatorOOP.operations;

public class Addition extends AbstractOperation {

   public Addition(double a, double b) {
      super(a, b);
   }

   @Override
   public double result() {
      return getA() + getB();
   }
}
