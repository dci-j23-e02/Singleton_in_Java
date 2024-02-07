package coffee_machine;

public class Main {

  public static void main(String[] args) {
    System.out.println("If you see the same coffee type, then coffee machine was reused (yay!)\n"+
        "If you see different coffee type, then 2 coffee machines were created (booo!!)\n"
    + "\n\n" +
        "RESULT:"+"\n");

    CoffeeMachine m1 = CoffeeMachine.getInstance("Espresso");
    CoffeeMachine m2 = CoffeeMachine.getInstance("Coffee Cream");

    System.out.println(m1);
    System.out.println(m2);


  }
}
