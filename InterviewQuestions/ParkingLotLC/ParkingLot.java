package InterviewQuestions.ParkingLotLC;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Level> levels;
    public ParkingLot(){
        this.levels = new ArrayList<>();
    }

    public void addLevels(Level level){
        this.levels.add(level);
    }

    public boolean isFull(VehicleType vehicleType){
        for (Level level : levels){
            if (level.findSpot(new Vehicle("", vehicleType)) != null){
                return true;
            }
        }
        return false;
    }

    public boolean parkVehicle(Vehicle vehicle){
        for (Level level : levels){
            ParkingSpot spot = level.findSpot(vehicle);
            if (spot != null){
                spot.assignVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean removeVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            for (ParkingSpot spot : level.spots.get(vehicle.getVehicleType())) {
                if (spot.isOccupied() && spot.currentVehicle.getLicensePlate().equals(vehicle.getLicensePlate())) {
                    spot.removeVehicle();
                    return true;
                }
            }
        }
        return false;
    }
}
