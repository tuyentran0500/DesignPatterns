package InterviewQuestions.ParkingLotLC;

public class Vehicle {
    private VehicleType vehicleType;
    private String licencePlate;
    
    public Vehicle(String licencePlate, VehicleType vehicleType){
        this.licencePlate = licencePlate;
        this.vehicleType = vehicleType;
    }
    public String getLicencePlate() {
        return licencePlate;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
