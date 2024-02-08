package multithreaded.thread_safe;



public class DemoThreadSafe {

  public static void main(String[] args) {
    System.out.println("If you see the same value, then Singleton was reused (yay!)\n"+
        "If you see different values, then 2 Singleton instances were created (booo!!)\n"
        + "\n\n" +
        "RESULT:"+"\n");

    Thread thread1 = new Thread(new Task1());
    Thread thread2 = new Thread(new Task2());

    thread1.start();
    thread2.start();
  }
}
