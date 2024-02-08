package multithreaded.unsafe_multithreaded;

public class ThreadFOO implements Runnable {

  @Override
  public void run() {
    Singleton s = Singleton.getInstance("FOO");
    System.out.println(s.getValue());
  }
}
