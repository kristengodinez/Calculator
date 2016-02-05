
/**
 * Kristen Godinez
 * COMP 350
 * 01/27/16
 */

public class RoomCarpet {

    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension dim, double cost)
    {
        this.size = dim;
        this.carpetCost = cost;
    }

    public double getTotalCost()
    {
        return size.getArea() * this.carpetCost;
    }

    public String toString()
    {
        return "The total cost of the carpet is $" + String.format("%.2f", getTotalCost());
    }

}
