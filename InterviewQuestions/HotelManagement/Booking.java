package InterviewQuestions.HotelManagement;

public class Booking {
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

}
