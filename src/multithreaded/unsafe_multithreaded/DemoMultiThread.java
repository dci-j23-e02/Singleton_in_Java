package multithreaded.unsafe_multithreaded;

public class DemoMultiThread {

  public static void main(String[] args) {
    System.out.println("If you see the same value, then Singleton was reused (yay!)\n"+
        "If you see different values, then 2 Singleton instances were created (booo!!)\n"
        + "\n\n" +
        "RESULT:"+"\n");

    Thread threadFOO = new Thread(new ThreadFOO());
    Thread threadBOO = new Thread(new ThreadBOO());

    threadFOO.start();
    threadBOO.start();

  }
}
