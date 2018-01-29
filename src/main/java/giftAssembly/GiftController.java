package giftAssembly;

public class GiftController {

   public static void start() {

      double totalCost = 0;
      double totalWeight = 0;

      Candy candy1 = new Candy("Candy1", 1.4, 1500.00, "Red");
      Candy candy2 = new Candy("Candy2", 1.7, 1700.00, "Red");

      Marshmallow marshmallow = new Marshmallow("Marshmallow", 2.4, 900.00, "Normal");

      Jellybean jellybean1 = new Jellybean("Jellybean1", 1.3, 1330.00, 15);
      Jellybean jellybean2 = new Jellybean("Jellybean2", 1.3, 1330.00, 15);

      Gift[] gifts = new Gift[]{candy1, candy2, jellybean1, jellybean2, marshmallow};

      for (Gift gift : gifts) {
         System.out.println(gift.toString());
         totalWeight += gift.getWeight();
         totalCost += gift.getCost();
      }
      System.out.println("---------------------------");
      System.out.printf("Total cost is: %.2f \n", totalCost);
      System.out.printf("Total weight is: %.1f \n", totalWeight);
   }
}
