package multithreaded.thread_safe;

public final class Singleton {
  private static volatile Singleton instance;

  private String value;

  public String getValue() {
    return value;
  }


  private Singleton(String value) {
    this.value = value;
  }


  // Method declaration
  public static Singleton getInstance(String value){
    /*
     Double-Checked Locking(DCL): is a mechanism to prevent multiple threads from creating
     multiple instances of the Singleton class simultaneously, which would violate the Singleton
     pattern's principle (Only single instance should be created).
    */

    // Local variable ´result´:
    Singleton result = instance;

    // First Check :
    if(result != null){
      return  result;
    }

    // Synchronization Block
    synchronized(Singleton.class){
      // Second Check
      if(instance == null){
        instance = new Singleton(value);
      }

      return instance;
    }

  }

}
