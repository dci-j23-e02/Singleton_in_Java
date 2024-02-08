package multithreaded.thread_safe;

public class Task2 implements Runnable {

  @Override
  public void run() {
    Singleton singleton = Singleton.getInstance("Second Task");
    System.out.println(singleton.getValue());
  }
}
