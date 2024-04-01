

public class Block implements Geometry {

  private double length;
  private double width;
  private double height;

  public Block(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  @Override
  public double getVolume() {
    return length * width * height; // Volume formula for rectangular block
  }

  @Override
  public double getBaseArea() {
    // Implement logic to calculate base area based on length and width
    // This could be the area of a side face, top face, etc.
    return length * width;
  }
}
