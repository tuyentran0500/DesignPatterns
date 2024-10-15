package InterviewQuestions.DesignParkingLot;

public class Car extends Vehicle{
    public Car(String licenPlate){
        super(VehicleSize.MOTORCYCLE, licenPlate, 1);
    }
    @Override
    public
    boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSize() == VehicleSize.COMPACT || spot.getSize() == VehicleSize.LARGE;
    }
}
