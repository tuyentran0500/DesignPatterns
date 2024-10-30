package InterviewQuestions.ParkingLotLC;

public class ParkingSpot {
    private String spotId;
    private VehicleType vehicleType;
    private boolean isOccupied;
    private Vehicle currentVehicle;

    public ParkingSpot(String spotId, VehicleType vehicleType){
        this.spotId = spotId;
        this.vehicleType = vehicleType;
        this.isOccupied = false;
        this.currentVehicle = null;
    }

    public boolean canFitVehicle(Vehicle vehicle){
        return (vehicle.getVehicleType() == this.vehicleType);
    }

    public boolean assignVehicle(Vehicle vehicle){
        if (!isOccupied && canFitVehicle(vehicle)){
            this.isOccupied = true;
            this.currentVehicle = vehicle;
            return true;
        }
        return false;
    }

    public void removeVehicle(){
        this.currentVehicle = null;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }


}
