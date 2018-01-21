package calculatorOOP.operations;

public class Division extends AbstractOperation{

   public Division(double a, double b) {
      super(a, b);
   }

   @Override
   public double result() {
      return getA() / getB();
   }
}
