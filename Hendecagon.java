
/**
 * Implement a circle
 * 
 * @author Mr. Jaffe 
 * @version 2017-07-14
 */
public class Hendecagon implements Shape
{
    private int sidelength;
    private String color;
    private int perimiter=0;
    private int sides=11;
    /**
     * Constructor for objects of class square
     */
    public Hendecagon(int length, String color)
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
        return 9.36564*Math.pow(this.sidelength,2);
    }

    /**
     * Get the perimeter
     * 
     * @return     returns the perimeter of the circle
     */
    public double getPerimeter()
    {
        while(this.sides >=1){
            perimiter=perimiter+this.sidelength;
            this.sides=this.sides-1;
        }
        
        return perimiter;
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
