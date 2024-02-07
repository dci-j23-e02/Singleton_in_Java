package first_example;

public class Main {

  public static void main(String[] args) {
    // Get the only instance ( object ) that is available:
    NaiveSingleton singleton1 = NaiveSingleton.getInstance();

    // SHow the message
 //   singleton1.showMessage();

    // give it a name:
    singleton1.setName("Harry");

    // Get the only instance ( object ) that is available:
    NaiveSingleton singleton2 = NaiveSingleton.getInstance();

    System.out.println(singleton2.getName());
  }
}
