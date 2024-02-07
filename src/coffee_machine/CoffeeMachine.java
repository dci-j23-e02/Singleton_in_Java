package coffee_machine;

import first_example.NaiveSingleton;

public final class CoffeeMachine {

  // The sole instance
    private static CoffeeMachine instance;


    // Other Attributes
  private String coffeeType;

  // Private constructor to prevent instantiation from outside the class
  private CoffeeMachine(String cType) {
    // The following code emulates slow initialization.
    try{
      Thread.sleep(1500); // sleep for 1.5 seconds
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    this.coffeeType = cType;


  }

  public static CoffeeMachine getInstance(String cType){
    // if then instance doesn't exist, create it
    if(instance == null){
      instance = new CoffeeMachine(cType);
    }

    // Set the coffee type (optional)
    // instance.setCoffeeType(cType);

    // Return the instance
    return instance;
  }

  // Getters and Setters


  public String getCoffeeType() {
    return coffeeType;
  }

  public void setCoffeeType(String coffeeType) {
    this.coffeeType = coffeeType;
  }
}
