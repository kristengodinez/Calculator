import java.util.Scanner;

/**
 * Kristen Godinez
 * COMP 350
 * 01/27/16
 */

public class RoomMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double length, width, cost;

        do {

            System.out.print("Enter length of room: ");
            length = sc.nextDouble();

            System.out.print("Enter width of room: ");
            width = sc.nextDouble();

            System.out.print("Enter cost of carpet: ");
            cost = sc.nextDouble();

        } while (length <= 0 || width <= 0 || cost <= 0 );

        RoomDimension rm = new RoomDimension(length, width);
        RoomCarpet rc = new RoomCarpet(rm, cost);

        System.out.println(rm.toString());
        System.out.println(rc.toString());
    }
}
