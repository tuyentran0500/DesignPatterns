package InterviewQuestions.DesignParkingLot;

public class ParkingSpot {
    private VehicleSize size;
    private Vehicle vehicle;
    private int row;
    private int spotNumber;

    public ParkingSpot(VehicleSize vehicleSize, int row, int spotNumber){
        this.size = size;
        this.row = row;
        this.spotNumber = spotNumber;
    }

    public VehicleSize getSize() {
        return size;
    }

    public boolean isAvailable(){
        return vehicle == null;
    }

    public boolean canFitInVehicle(Vehicle vehicle){
        if (!isAvailable()) {
            return false;
        }
        return vehicle.canFitInSpot(this);
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }



}
