package calculatorOOP.operations;

public class Division extends AbstractOperation {

   public Division(double a, double b) {
      super(a, b);
   }

   @Override
   public double result() {
      double result = 0;

      try {
         result = getA() / getB();
         if (result == Double.POSITIVE_INFINITY ||
                 result == Double.NEGATIVE_INFINITY) {
            throw new ArithmeticException();
         }
      } catch (ArithmeticException e) {
         System.out.println("Division by zero error");
      }

      return result;
   }
}


