public class Pirate {
  String name;
  boolean hasWoodenLeg;
  int gold;

  public Pirate(String name, boolean hasWoodenLeg, int gold) {
    this.name = name;
    this.hasWoodenLeg = hasWoodenLeg;
    this.gold = gold;

  }
  @Override
  public String toString() {
    return "name: " + this.name + "; wooden leg?: " + this.hasWoodenLeg + "gold: " + this.gold;
  }
}