public class RacingRobot extends Robot {
  private FootParts footParts;
  private int speed;

	public RacingRobot(int id, String name, int distance, int energy, int speed, FootParts footParts) {
    super(id, name, distance, energy);
    this.footParts = footParts;
    this.speed = speed;
  }

  public RacingRobot(String name, int speed) {
		super(name);
    this.footParts = new FootParts(15);
    this.speed = speed;
	}

  public RacingRobot(String name) {
    super(name);
    this.footParts = new FootParts(15);
    this.speed = 10;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void run() {
    if(energy > 0) {
      distance += speed;
      energy -= 20;
    }
  }

  // overload
  public String getInfo() {
    return String.format("Robot(id=%d, name=%s, energy=%d, distance=%d, %s)", id, name, energy, distance, footParts.getInfo());
  }
}
