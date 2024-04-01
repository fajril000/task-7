

public class Cylinder extends BaseAreaShape implements Geometry {

  private double height;

  public Cylinder(Circle base, double height) {
    super(base);
    this.height = height;
  }

  @Override
  public double getVolume() {
    return getBaseArea() * height;
  }
}
