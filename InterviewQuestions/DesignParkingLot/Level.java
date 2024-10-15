package InterviewQuestions.DesignParkingLot;
import java.util.ArrayList;
import java.util.List;

public class Level {
    private int floor;
    private List<ParkingSpot> spots;
    private int availableSpots;

    public Level(int floor, int totalSpots) {
        this.floor = floor;
        spots = new ArrayList<>(totalSpots);
        availableSpots = totalSpots;

        // Example initialization of spots
        for (int i = 0; i < totalSpots; i++) {
            VehicleSize size = (i < totalSpots / 3) ? VehicleSize.MOTORCYCLE : 
                              (i < 2 * totalSpots / 3) ? VehicleSize.COMPACT : 
                              VehicleSize.LARGE;
            spots.add(new ParkingSpot(size, floor, i));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        int spotIndex = findAvailableSpot(vehicle);
        if (spotIndex < 0) {
            return false;
        }

        parkStartingAtSpot(spotIndex, vehicle);
        return true;
    }

    private int findAvailableSpot(Vehicle vehicle) {
        // Finds a spot where the vehicle can park
        for (int i = 0; i < spots.size(); i++) {
            if (spots.get(i).canFitInVehicle(vehicle)) {
                return i;
            }
        }
        return -1;
    }

    private void parkStartingAtSpot(int spotIndex, Vehicle vehicle) {
        // Park the vehicle starting at the given spot index
        for (int i = 0; i < vehicle.spotSize; i++) {
            ParkingSpot spot = spots.get(spotIndex + i);
            spot.parkVehicle(vehicle);
            vehicle.takeSpot(spot);
        }
        availableSpots -= vehicle.spotSize;
    }

    public void spotFreed() {
        availableSpots++;
    }
}

