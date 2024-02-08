package multithreaded.unsafe_multithreaded;

public class ThreadBOO implements Runnable {

  @Override
  public void run() {
    Singleton s = Singleton.getInstance("BOO");
    System.out.println(s.getValue());
  }
}
