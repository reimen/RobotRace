public class Robot {
  protected int id;
  protected static int maxId = 0;
  protected String name;
  protected int distance;
  protected int energy;

  public Robot(int id, String name, int distance, int energy) {
    this.id = id;
    maxId = id;
    this.name = name;
    this.distance = distance;
    this.energy = energy;
  }

  public Robot(String name) {
    this(++maxId, name, 0, 100);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDistance() {
    return distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  public int getEnergy() {
    return energy;
  }

  public void setEnergy(int energy) {
    this.energy = energy;
  }

  public String getInfo() {
    return String.format("Robot(id=%d, name=%s, energy=%d, distance=%d)", id, name, energy, distance);
  }
}
