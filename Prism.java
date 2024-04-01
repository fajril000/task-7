

public class Prism extends BaseAreaShape implements Geometry {

  private double height;

  public Prism(Shape baseShape, double height) {
    super(baseShape);
    this.height = height;
  }

  @Override
  public double getVolume() {
    return getBaseArea() * height;
  }
}
