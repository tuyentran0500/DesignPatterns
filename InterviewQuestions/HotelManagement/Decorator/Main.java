package InterviewQuestions.HotelManagement.Decorator;

import InterviewQuestions.HotelManagement.Customer;
import InterviewQuestions.HotelManagement.Room;
import InterviewQuestions.HotelManagement.RoomType;

public class Main {
    public static void main(String[] args) {
        // Basic room booking
        Room room = new Room(RoomType.DELUXE, 0);
        Customer customer = new Customer();
        BookingComponent booking = new Booking(room, customer, "Today", "Tommorrow");

        // Add breakfast service
        booking = new CleanServiceDecorator(booking);

        // Add laundry service
        booking = new LaundryServiceDecorator(booking);

        System.out.println("Total Booking Cost: " + booking.getCost());
        System.out.println("Booking Details: " + booking.getDetails());
    }
}
