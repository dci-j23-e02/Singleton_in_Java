package multithreaded.thread_safe;

public class Task1 implements Runnable {

  @Override
  public void run() {
    Singleton singleton = Singleton.getInstance("First Task");
    System.out.println(singleton.getValue());
  }
}
