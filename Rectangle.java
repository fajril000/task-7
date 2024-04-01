

public abstract class Rectangle implements Shape {

  // Abstract methods for subclasses to implement specific rectangle types
  public abstract double getBase();
  public abstract double getHeight();

  @Override
  public double getArea() {
    return 0.5 * getBase() * getHeight(); // General triangle area formula (inherited from Shape)
  }

  // Perimeter calculation can be implemented here for specific rectangle types if needed
  // Alternatively, subclasses can implement their own perimeter calculation logic.
}
