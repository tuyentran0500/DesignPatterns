package InterviewQuestions.HotelManagement.Decorator;

public class LaundryServiceDecorator extends RoomServiceDecorator {
    public LaundryServiceDecorator(BookingComponent booking) {
        super(booking);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return super.getCost() + 30;
    }

    @Override
    public String getDetails() {
        // TODO Auto-generated method stub
        return super.getDetails() + ", Laundry";
    }
}
