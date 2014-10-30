public class RobotSimulator {
  public static void main(String[] args) {
    Robot[] robots = new Robot[6];
    String[] robotNames = {"Ann", "Bat", "Carl", "Deen", "Eric", "Flora"};

    for(int i = 0; i < 3; i++) {
      robots[i] = new Robot(i, robotNames[i], 0, 100);
    }

    for(int i = 0; i < 3; i++) {
      robots[i+3] = new Robot(robotNames[i+3]);
    }

    for(int i = 0; i < 6; i++) {
      System.out.println(robots[i].getInfo());
    }
  }
}