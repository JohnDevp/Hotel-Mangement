public class HotelTest {
    // SQL DataBase was connected through DB Navigator plugin.
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Beach Marriott", "California");
        hotel.addRoom(100, "Mike", 'n', "King", 5.0);
        hotel.addRoom(101, "Jennifer", 's', "King", 5.0);
        hotel.addRoom(102, "Paul", 's', "Queen", 4.8);
        hotel.addRoom(103, "Blake", 'n', "King", 4.8);
        hotel.addRoom(104, "Tris", 'n', "Twins", 5.0);

        System.out.println(hotel.toString());
    }
}
