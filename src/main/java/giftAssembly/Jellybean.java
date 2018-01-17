package giftAssembly;

public class Jellybean extends Gift {

   private int count;

   public Jellybean(String name, double weight, double cost, int count) {
      super(name, weight, cost);
      this.count = count;
   }

   @Override
   public String toString() {
      return "Jellybean [ " + super.toString() +
              " count = " + count +
              ']';
   }
}
