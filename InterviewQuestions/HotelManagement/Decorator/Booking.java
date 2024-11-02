package InterviewQuestions.HotelManagement.Decorator;

import InterviewQuestions.HotelManagement.Customer;
import InterviewQuestions.HotelManagement.Room;
import InterviewQuestions.HotelManagement.RoomType;
import InterviewQuestions.HotelManagement.BookingStatus;

public class Booking implements BookingComponent {
    private Room room;
    private Customer customer;
    private String checkinDate;
    private String checkoutDate;
    private BookingStatus status;

    public Booking(Room room, Customer customer, String checkinDate, String checkoutDate){
        this.room = room;
        this.customer = customer;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        status = BookingStatus.CONFIRMED;
    }

    public void cancelBooking(){
        this.status = BookingStatus.CANCELLED;
    }

    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        if (room.getRoomType() == RoomType.STANDARD){
            return 10.0;
        }
        if (room.getRoomType() == RoomType.DELUXE){
            return 20.0;
        }
        return 30.0;
    }

    @Override
    public String getDetails() {
        // TODO Auto-generated method stub
        if (room.getRoomType() == RoomType.STANDARD){
            return "Standard";
        }
        if (room.getRoomType() == RoomType.DELUXE){
            return "Deluxe";
        }
        return "Family";
    }
}
