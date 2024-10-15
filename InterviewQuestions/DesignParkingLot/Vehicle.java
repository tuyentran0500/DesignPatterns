package InterviewQuestions.DesignParkingLot;
import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    protected VehicleSize size;
    protected String licensePlate;
    protected int spotSize;
    protected List<ParkingSpot> spotsTaken = new ArrayList<>();

    public Vehicle(VehicleSize size, String licensePlate, int spotSize) {
        this.size = size;
        this.licensePlate = licensePlate;
        this.spotSize = spotSize;
    }

    public void clearSpots() {
        for (ParkingSpot spot : spotsTaken) {
            spot.removeVehicle();
        }
        spotsTaken.clear();
    }

    public void takeSpot(ParkingSpot spot) {
        spotsTaken.add(spot);
    }

    public abstract boolean canFitInSpot(ParkingSpot spot);
}
