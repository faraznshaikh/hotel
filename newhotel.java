import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Created by farazshaikh on 9/26/16.
 */
public class newhotel {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        double numberOfFloor;
        double roomsOnFloor;
        double roomsOccupied;
        double roomsEmpty = 0;
        double totalRoomsOccupied = 0;
        double totalRooms = 0;
        double occupancyRate = 0;
        double floornumber = 0;
        double totalrooms;

        System.out.println("How many floors are in this hotel?:");
        numberOfFloor = input.nextDouble();
        while (numberOfFloor <= 1) {
            System.out.println("Invalid input, please try again");
            numberOfFloor = input.nextDouble();
        }
        System.out.println("How many rooms are there on each floor");
        roomsOnFloor = input.nextDouble();
        while (numberOfFloor <= 10) {
            System.out.println("Invalid input, please try again");
            roomsOnFloor = input.nextDouble();
        }
        for (int x = 1; x <= numberOfFloor; x++) {

            floornumber++;

            System.out.println("Floor:" + floornumber);
            System.out.println("How many rooms on this floor");
            roomsOnFloor = input.nextInt();

            //Make sure number of room is not less than 10

            while (roomsOnFloor < 10) {
                System.out.println("Liar Liar pants on fire there must be atleast 10 rooms on each floor");
                System.out.println("How many rooms on this floor");
                roomsOnFloor = input.nextInt();
            }
            System.out.println("How many rooms are occupied on this floor?");
            roomsOccupied = input.nextInt();
            totalRooms += roomsOnFloor;
            totalRoomsOccupied += roomsOccupied;
            roomsEmpty = totalRooms - totalRoomsOccupied;
            occupancyRate = totalRoomsOccupied/(double)(totalRooms);

            System.out.println("Total Hotel Rooms: " + totalRooms);

            System.out.println("Rooms Occupied: " + totalRoomsOccupied);

            System.out.println("Rooms Available: " + roomsEmpty);





        }
    }
}
