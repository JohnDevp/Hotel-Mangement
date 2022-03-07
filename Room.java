public class Room {
    private int roomNumber;
    private String bedType;
    private double roomRate;
    private String occupantName;
    private char s;         // smoking
    private boolean occupied;

    // default constructor
    public Room(int roomNumber, String occupantName, char s, String bedType, double roomRate) {
        this.roomNumber = roomNumber;
        this.occupantName = occupantName;
        this.bedType = bedType;
        this.s = s;
        this.roomRate = roomRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public char getS() {
        return s;
    }

    public void setS(char s) {
        this.s = s;
    }

    public double getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(double roomRate) {
        this.roomRate = roomRate;
    }

    public boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public String getOccupantName() {
        return occupantName;
    }

    public void setOccupantName(String occupantName) {
        this.occupantName = occupantName;
    }

    // toString() override
    @Override
    public String toString() {
        return "Room Number: " + getRoomNumber() + "\n"
                + "Occupant Name: " + getOccupantName() + "\n"
                + "Smoking room: " + getS() + "\n"
                + "Bed Type: " + getBedType() + "\n"
                + "Rate: " + getRoomRate() + "\n";
    }
}
