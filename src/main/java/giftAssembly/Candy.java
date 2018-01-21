package giftAssembly;

public class Candy extends Gift{

   private String color;
   private String type;

   public Candy(String name, double weight, double cost, String color) {
      super(name, weight, cost);
      this.color = color;
   }

   @Override
   public String toString() {
      return "Candy [" + super.toString() +
              " color = '" + color + '\'' +
              ']';
   }
}
