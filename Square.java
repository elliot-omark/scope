
/**
 * Implement a circle
 * 
 * @author Mr. Jaffe 
 * @version 2017-07-14
 */
public class Square implements Shape
{
  private int sidelength;
  private String color;

  /**
   * Constructor for objects of class square
   */
  public Square(int length, String color)
  {
    this.sidelength = length;
    this.color = color;
  }

  /**
   * Get the area
   * 
   * @return     returns the area of the circle
   */
  public double getArea()
  {
    return this.sidelength * this.sidelength;
  }

  /**
   * Get the perimeter
   * 
   * @return     returns the perimeter of the circle
   */
  public double getPerimeter()
  {
    return this.sidelength+this.sidelength+this.sidelength+this.sidelength;
  }

  /**
   * Get the color
   * 
   * @return     returns the color of the circle
   */
  public String getColor()
  {
    return this.color;
  }
}
