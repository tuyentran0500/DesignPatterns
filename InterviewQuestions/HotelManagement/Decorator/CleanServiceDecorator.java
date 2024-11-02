package InterviewQuestions.HotelManagement.Decorator;

public class CleanServiceDecorator extends RoomServiceDecorator {
    public CleanServiceDecorator(BookingComponent booking) {
        super(booking);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return super.getCost() + 2.0;
    }

    @Override
    public String getDetails() {
        // TODO Auto-generated method stub
        return super.getDetails() + ", Clean service";
    }
}
