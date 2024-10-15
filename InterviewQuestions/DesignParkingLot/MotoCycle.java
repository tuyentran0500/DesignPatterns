package InterviewQuestions.DesignParkingLot;

public class MotoCycle extends Vehicle{
    public MotoCycle(String licenPlate){
        super(VehicleSize.MOTORCYCLE, licenPlate, 1);
    }
    @Override
    public
    boolean canFitInSpot(ParkingSpot spot) {
        // TODO Auto-generated method stub
        return true;
    }

}
