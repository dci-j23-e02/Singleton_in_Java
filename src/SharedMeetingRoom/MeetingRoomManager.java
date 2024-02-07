package SharedMeetingRoom;


/**
 * Step 1: Define the MeetingRoomManager Singleton Class
 * */
public final class MeetingRoomManager {
  // Step 1.1: Declare a private static instance of the same class
     private static MeetingRoomManager instance;
  // Step 1.2: Declare properties for meeting room setup
     private int chairs;
     private boolean projector;

  // Step 1.3: Private constructor to prevent instantiation from outside
  private MeetingRoomManager() {
    // Initialize with default setup
    this.chairs = 0;
    this.projector = false;
  }


  // Step 1.4: Public static method to return the singleton instance
  public static MeetingRoomManager getInstance() {
    if (instance == null) {
      instance = new MeetingRoomManager();
    }
    return instance;
  }

  // Step 1.5: Method to setup the meeting room
  public void setupMeetingRoom(int chairs, boolean projector) {
    this.chairs = chairs;
    this.projector = projector;
    System.out.println("Meeting room setup updated.");
  }

  // Step 1.6: Getter methods for the properties
  public int getChairs() {
    return chairs;
  }

  public boolean isProjectorAvailable() {
    return projector;
  }


}
