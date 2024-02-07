package first_example;

public class NaiveSingleton {
// The sole instance
  private  static NaiveSingleton instance;
  private  String name;
// Private constructor to prevent instantiation from outside the class
private NaiveSingleton(){}

 // Method to return the instance of the class

 public static  NaiveSingleton getInstance(){
  // if then instance doesn't exist, create it
   if(instance == null){
     instance = new NaiveSingleton();
   }

   // Return the instance
   return instance;
 }

 // Example method
  public void showMessage(){
    System.out.println("Hello I am the lonely instance ;) ");
  }


  // Getters and Setters

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
