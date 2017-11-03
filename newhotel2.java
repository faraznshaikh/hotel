import java.util.Scanner;
import java.text.DecimalFormat;

public class newhotel2
{
    public static void main(String[] args)
    {
        DecimalFormat formatter = new DecimalFormat("#.000");
        Scanner input = new Scanner(System.in);
        int numberOfFloors;
        int roomsPerFloor;
        int roomsOccupied;
        int vacancies = 0, totalRoomsOccupied = 0, totalRooms = 0;
        double occupancyRate = 0;


        //Ask for the number of floors in the hotel: numberOfFloors
        //Number of floor mustn't be less than one.

        System.out.println("How many floors in this hotel?");
        numberOfFloors = input.nextInt();

        while(numberOfFloors < 1)
        {
            System.out.println("Invalid floor number, try again");
            numberOfFloors = input.nextInt();
        }

        int floorCount = 0;

        for(int x = 1; x <= numberOfFloors; x++ )
        {
            //Iterate per floor
            //Ask for the number of rooms on the floor: roomsPerFloor

            floorCount++;

            System.out.println("Floor:" + floorCount);
            System.out.println("How many rooms on this floor");
            roomsPerFloor = input.nextInt();

            //Make sure number of room is not less than 10

            while(roomsPerFloor < 10)
            {
                System.out.println("Invalid Input, 10 or greater rooms per floor");
                System.out.println("How many rooms on this floor");
                roomsPerFloor = input.nextInt();
            }
            //Ask for the number of rooms occupied: roomsOccupied

            System.out.println("How many rooms are occupied on this floor?");
            roomsOccupied = input.nextInt();
            totalRooms += roomsPerFloor;
            totalRoomsOccupied += roomsOccupied;
            vacancies = totalRooms - totalRoomsOccupied;
            occupancyRate = totalRoomsOccupied/(double)(totalRooms);

        }

        //Display the following
        //The total number of rooms the hotal has
        System.out.println("Total Hotel Rooms: " + totalRooms);
        //The total number of room occupied
        System.out.println("Rooms Occupied: " + totalRoomsOccupied);
        //The total number that are vacant
        System.out.println("Rooms Available: " + vacancies);
        //The occupancy rate for the entire hotel
        System.out.println("Occupancy Rate: " + formatter.format(occupancyRate));

    }

}


