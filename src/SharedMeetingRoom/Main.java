package SharedMeetingRoom;

import java.util.Scanner;
/**
 *  Step 2: Create the Main Class to Demonstrate the Singleton
 * */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MeetingRoomManager manager = MeetingRoomManager.getInstance();

    while(true){
      System.out.println("Enter the number of chairs needed (or -1 to exit): ");
      int chairs = scanner.nextInt();
      if (chairs == -1) break; // Exit condition

      System.out.println("Do you need a projector? (true/false): ");
      boolean projector = scanner.nextBoolean();

      // Setup the meeting room with the given configuration
      manager.setupMeetingRoom(chairs, projector);

      // Display the current setup
      System.out.println("Current Meeting Room Setup:");
      System.out.println("Chairs: " + manager.getChairs());
      System.out.println("Projector needed: " + manager.isProjectorAvailable());
      System.out.println("-----------------------------------");
    }

    scanner.close();
  }
}
