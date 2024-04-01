public class Square extends Rectangle {

  public Square(double side) {
    super(side, side); // Reuse Rectangle constructor with equal sides
  }

  @Override
  public double getHeight() {
    return getWidth(); // In a square, height and width are equal
  }

  @Override
  public double getPerimeter() {
    return 4 * getWidth(); // Perimeter of a square: 4 * side
  }

  @Override
  public double getBase() {
    return getWidth(); // Base of a square can be any side
  }
}
