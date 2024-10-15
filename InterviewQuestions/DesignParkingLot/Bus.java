package InterviewQuestions.DesignParkingLot;

public class Bus extends Vehicle {

    public Bus(String licensePlate) {
        super(VehicleSize.LARGE, licensePlate, 5);
    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSize() == VehicleSize.LARGE;
    }
}
