public class RacingRobotSimulator {
  public static void main(String[] args) {
    RacingRobot[] racingRobots = new RacingRobot[6];
    String[] racingRobotNames = {"Ann", "Bat", "Carl", "Deen", "Eric", "Flora"};

    for(int i = 0; i < 3; i++) {
      racingRobots[i] = new RacingRobot(i+1, racingRobotNames[i], 0, 100, 50);
    }

    for(int i = 0; i < 3; i++) {
      racingRobots[i+3] = new RacingRobot(racingRobotNames[i+3]);
    }

    for(int i = 0; i < 6; i++) {
      System.out.println(racingRobots[i].getInfo());
    }
  }
}