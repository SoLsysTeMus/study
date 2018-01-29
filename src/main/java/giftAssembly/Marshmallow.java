package giftAssembly;

public class Marshmallow extends Gift {

   private String size;

   public Marshmallow(String name, double weight, double cost, String size) {
      super(name, weight, cost);
      this.size = size;
   }

   @Override
   public String toString() {
      return "Marshmallow [" + super.toString() +
              " size = '" + size + '\'' +
              ']';
   }
}
