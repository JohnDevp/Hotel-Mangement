public class Hotel {
    private String name;
    private String location;
//    private String bedType;
    private Room[] theRooms;
    private int numOfRooms;
    private int occupiedCnt;
//    private char s;
//    private int roomNumber; // id of the room: 100, 101, 102, 103
//    private double roomRate;

    // default constructor
    public Hotel (String n, String l) {
        this.name = n;
        this.location = l;
        this.theRooms = new Room[10];
        this.numOfRooms = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Room[] getRoom() {
        return theRooms;
    }

    public void setRoom(Room[] room) {
        this.theRooms = room;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public int getOccupiedCnt() {
        return occupiedCnt;
    }

    public void setOccupiedCnt(int occupiedCnt) {
        this.occupiedCnt = occupiedCnt;
    }


    // returns true if all the rooms are occupied
    public boolean isFull() {
        occupiedCnt = 0;
        for (int i = 0; i < getNumOfRooms(); i++) {
            if (theRooms[i].getOccupied()) occupiedCnt++;
        }
        if (occupiedCnt == numOfRooms) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        occupiedCnt = 0;
        for (int i = 0; i < getNumOfRooms(); i++) {
            if (theRooms[i].getOccupied()){
                return false;
            }
        }
        return true;
    }

    public void addRoom(int roomNumber, String occupantName, char s, String bedType, double roomRate) {
        Room room = new Room(roomNumber, occupantName, s, bedType, roomRate);
        room.setOccupied(false);
        numOfRooms++;
        theRooms[occupiedCnt] = room;
        occupiedCnt++;
    }

    public void getReservation(String occupantName, char s, String bedType) {
        for (int i = 0; i < getNumOfRooms(); i++) {
            if (theRooms[i].getS() == s && theRooms[i].getBedType() == bedType) {
                theRooms[i].setOccupied(true);
                theRooms[i].setOccupantName(occupantName);
                occupiedCnt++;
                System.out.println("Reservation has been made. Thank You!");
            } else {
                System.out.println("No matching room found.");
            }
        }
    }

    public void cancelReservation(String occupantName) {
        if (findReservation(occupantName) == -1) {
            System.out.println("No reservation is found.");
        } else {
            theRooms[findReservation(occupantName)].setOccupied(false);
            occupiedCnt--;
            System.out.println("Reservation has been cancelled.");
        }
    }

    public int findReservation(String occupantName) {
        int i = 0;
        for (i = 0; i < numOfRooms; i++) {
            if (theRooms[i].getOccupantName() == occupantName) {
                break;
            } else if (i == numOfRooms - 1) {
                System.out.println("Reservation not found.");
                return -1;
            }
        }
        return i;
    }

    @Override
    public String toString() {
        String s = " ";
        for (int i = 0; i < numOfRooms; i++) {
            Room room = theRooms[i];
            if (room != null) {
                s += room.toString() + "\n";
            }
        }
        return "Hotel Name: " + getName() + "\n"
                + "Number of Rooms: " + getNumOfRooms() + "\n"
                + "Number of Occupied Rooms: " + getOccupiedCnt() + "\n"
                + "Room Details are: " + "\n" + s;
    }
}
