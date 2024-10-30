package InterviewQuestions.HotelManagement;

public class Customer {
    private String name;
    private int customerId;
    
    public Booking book(Room room, String checkinDate, String checkoutDate){
        return new Booking(room, this, checkinDate, checkoutDate);
    }

    public boolean cancelBooking(Booking booking){
        booking.cancelBooking();
        return true;
    }

}
