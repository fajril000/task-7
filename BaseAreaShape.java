

public abstract class BaseAreaShape implements Geometry {

  protected Shape baseShape; // Can hold any Shape object

  public BaseAreaShape(Shape baseShape) {
    this.baseShape = baseShape;
  }

  @Override
  public double getBaseArea() {
    return baseShape.getArea(); // Reuse area calculation from the Shape interface
  }
}
