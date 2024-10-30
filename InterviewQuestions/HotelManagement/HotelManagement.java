package InterviewQuestions.HotelManagement;
import java.util.*;
public class HotelManagement {
    private List<Booking> bookings;
    private Map<Integer, Room> rooms;
    private Map<Integer, Customer> customers;

    public List<Room> searchAvailableRooms(){
        List<Room> availableRooms = new ArrayList<Room>();
        for(Room room : rooms.values()){
            if (room.isAvaiable()){
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }
    
    public Booking makeBooking(int customerId, int roomNumber, String checkinDate, String checkoutDate){
        Customer customer = customers.get(customerId);
        Room room = rooms.get(roomNumber);
        Booking booking = customer.book(room, checkinDate, checkoutDate);
        bookings.add(booking);
        return booking;
    }
}
