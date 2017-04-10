/*
public class Cuboid {
  // Create a class that represents a cuboid:
  // It should take its three dimensions as constructor parameters (numbers)
  // It should have a method called `getSurface` that returns the cuboid's surface
  // It should have a method called `getVolume` that returns the cuboid's volume
}
*/
public class Cuboid {

  double length;
  double width;
  double height;


  public Cuboid(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public double getSurface() {
    return 2 * (this.length * this.width + this.length * this.height + this.height * this.width);
  }

  public double getVolume() {
    return length * width * height;

  }
}
