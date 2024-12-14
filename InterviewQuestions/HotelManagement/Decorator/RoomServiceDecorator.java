package InterviewQuestions.HotelManagement.Decorator;

public abstract class RoomServiceDecorator implements BookingComponent {
    private BookingComponent booking;

    public RoomServiceDecorator(BookingComponent booking){
        this.booking = booking;
    }
    @Override
    public double getCost() {
        return booking.getCost();
    }
    @Override
    public String getDetails() {
        return booking.getDetails();
    }
}
