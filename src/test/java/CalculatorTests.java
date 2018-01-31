import calculatorOOP.operations.Addition;
import calculatorOOP.operations.Division;
import calculatorOOP.operations.Multiplication;
import calculatorOOP.operations.Subtraction;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

   @Test
   public void testValidResultForAddition(){
      Addition addition = new Addition(3,5);

      Assert.assertEquals("Wrong result: ",8, addition.result(), 0);
   }

   @Test
   public void testValidResultForDivision(){
      Division division = new Division(6,3);

      Assert.assertEquals("Wrong result: ",2, division.result(), 0);
   }

   @Test
   public void testValidResultForMultiplication(){
      Multiplication multiplication = new Multiplication(1, 5);

      Assert.assertEquals("Wrong result: ",5, multiplication.result(), 0);
   }

   @Test
   public void testValidResultForSubtraction(){
      Subtraction subtraction = new Subtraction(7, 3);

      Assert.assertEquals("Wrong sum: ",4, subtraction.result(), 0);
   }
}
