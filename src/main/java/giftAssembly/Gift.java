package giftAssembly;

public abstract class Gift {

   private String name;
   private double weight;
   private double cost;

   public Gift(String name, double weight, double cost) {
      this.name = name;
      this.weight = weight;
      this.cost = cost;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }

   public double getCost() {
      return cost;
   }

   public void setCost(double cost) {
      this.cost = cost;
   }

   @Override
   public String toString() {
      return "name = " + name +
             ", weight = " + weight +
             ", cost = " + cost;
   }
}
