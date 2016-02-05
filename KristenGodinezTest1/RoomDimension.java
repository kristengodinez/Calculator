
/**
 * Kristen Godinez
 * COMP 350
 * 01/27/16
 */

public class RoomDimension {

    private double length;
    private double width;

    public RoomDimension(double len, double w)
    {
        this.length = len;
        this.width = w;
    }

    public double getArea()
    {
        return this.length * this.width;
    }

    public String toString()
    {
        return "The length is " + this.length + " ft and the width is " + this.width +
                " ft so the room dimension is " + getArea() + " sqft.";
    }
}
