public class RobotSimulator {
  public static void main(String[] args) {
    Robot robot1 = new Robot(1, "Ann", 0, 100);
    Robot robot2 = new Robot(2, "Bats", 0, 100);
    Robot robot3 = new Robot(3, "Carl", 0, 100);
    Robot robot4 = new Robot(4, "Deen", 0, 100);
    Robot robot5 = new Robot(5, "Elic", 0, 100);
    Robot robot6 = new Robot(6, "Feel", 0, 100);

    System.out.println(robot1.getInfo());
    System.out.println(robot2.getInfo());
    System.out.println(robot3.getInfo());
    System.out.println(robot4.getInfo());
    System.out.println(robot5.getInfo());
    System.out.println(robot6.getInfo());
  }
}