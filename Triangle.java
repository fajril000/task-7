

public abstract class Triangle implements Shape {

  // Abstract methods for subclasses to implement specific triangle types
  public abstract double getBase();
  public abstract double getHeight();
  

  @Override
  public double getArea() {
    return 0.5 * getBase() * getHeight(); // General triangle area formula
  }

  // Perimeter calculation can be implemented here for specific triangle types if needed
  // Alternatively, subclasses can implement their own perimeter calculation logic.
}
