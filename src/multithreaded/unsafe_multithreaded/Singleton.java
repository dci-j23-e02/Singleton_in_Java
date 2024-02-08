package multithreaded.unsafe_multithreaded;

public final class Singleton {
private  static Singleton instance;
private  String value;

  public String getValue() {
    return value;
  }

  // a private Contractor
  private Singleton(String v){
    try{
      Thread.sleep(1000); // 1 second
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    this.value = v;
  }

  // a public static method to return the  Singleton instance

  public static Singleton getInstance(String v){
    if(instance == null){
      instance = new Singleton(v);
    }

    return  instance;
  }

}
