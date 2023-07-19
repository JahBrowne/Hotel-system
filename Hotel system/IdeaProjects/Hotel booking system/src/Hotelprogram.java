import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Hotelprogram {

    private static boolean MainMenu = true;
    private static boolean SubMenu = true;


    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Room[] myHotel = new Room[10];
        myHotel[0] = new Room();
        myHotel[1] = new Room();
        myHotel[2] = new Room();
        myHotel[3] = new Room();
        myHotel[4] = new Room();
        myHotel[5] = new Room();
        myHotel[6] = new Room();
        myHotel[7] = new Room();
        myHotel[8] = new Room();
        myHotel[9] = new Room();
        int roomNum = 0;
        initialise(myHotel);
        while (MainMenu) {
            while (SubMenu) {
                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                System.out.println("Hello and Welcome to our Hotel Program.");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Please select one of the options.");
                System.out.println("1: Book A Room.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("2: View all Bookings.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("3: Delete Booking.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("4: View Rooms.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                String Selection = input.next();
                Selection = Selection.toUpperCase();
                switch (Selection) {
                    case "1":
                        BookARoom(myHotel, roomNum);
                        break;
                    case "2":
                        ViewAllBookings(myHotel);
                        break;
                    case "3":
                        Delete(myHotel, roomNum);
                        break;
                    case "4":
                        ViewRooms(myHotel);
                        break;
                    default:
                        System.out.println("Invalid Selection");
                        break;
                }
                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Would you like to Select another Option\n1 = Yes\n2 = No");
                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                if (input.nextInt() == 1) {
                    SubMenu = true;
                } else {
                    SubMenu = false;
                }
            }
            SubMenu = true;
            System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("Are There Any More Uses For You?\n1 = Yes\n2 = No");
            System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            if (input.nextInt() == 1) {
                MainMenu = true;
            } else {
                System.out.println("");
                System.exit(0);

            }
        }

    }

    private static void initialise(Room[] myHotel) {
        for (int x = 0; x < myHotel.length; x++) {
            myHotel[x].setName("nobody");
        }
    }


    private static void BookARoom(Room[] myHotel, int roomNum) {
        String roomName;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter room number (1-10):");
        roomNum = input.nextInt() - 1;
        System.out.println("Enter name for room " + (roomNum + 1) + " :");
        roomName = input.next();
        myHotel[roomNum].setName(roomName);
    }

    private static void ViewAllBookings(Room[] myHotel) {
        for (int x = 0; x < myHotel.length; x++) {
            System.out.println("room " + (x + 1) + " occupied by " + myHotel[x].getName());
        }
    }

    private static void Delete(Room[] myHotel, int roomNum) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter room number to delete(1-10):");
        roomNum = input.nextInt() - 1;
        myHotel[roomNum].setName("nobody");
        System.out.println("Entery Deleted :)");
    }


    private static void ViewRooms(Room[] myHotel) {
        String[] myStrArray = new String[myHotel.length];
        for (int i = 0; i < myHotel.length; i++) {
            myStrArray[i] = myHotel[1].getName();
        }

        Arrays.sort(myStrArray);
        for (int a = 0; a < myStrArray.length; a++) {
            System.out.println(myStrArray[a]);
        }

    }

    public static class Room {

        //protected String mainName;
        private String mainName;
        int guestsInRoom;

        public Room() {
            mainName = "k";

        }

        public void setName(String aName) {
            //  System.out.println("add name class method ");
            mainName = aName;
        }


        public String getName() {
            return mainName;
        }
    }

}