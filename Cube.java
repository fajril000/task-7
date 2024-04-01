

public class Cube extends BaseAreaShape implements Geometry {

  private double side;

  public Cube(double side) {
    super(new Square(side)); // Square as base for cube
    this.side = side;
  }

  @Override
  public double getVolume() {
    return Math.pow(side, 3);
  }
}
