package calculatorOOP.operations;

public abstract class AbstractOperation {

   private double a, b;

   AbstractOperation(double a, double b) {
      this.a = a;
      this.b = b;
   }

   public abstract double result();

   double getA() {
      return a;
   }

   double getB() {
      return b;
   }

}
