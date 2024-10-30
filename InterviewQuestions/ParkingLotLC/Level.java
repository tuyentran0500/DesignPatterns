package InterviewQuestions.ParkingLotLC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Level {
    private Map<VehicleType, List<ParkingSpot>> spots;
    private int levelNumber;
    public Level(int levelNumber){
        this.levelNumber = levelNumber;
        this.spots = new HashMap<>();   
    }

    public void addSpot(ParkingSpot spot){
        spots.computeIfAbsent(spot.getVehicleType(), k -> new ArrayList<>()).add(spot);
    }

    public ParkingSpot findSpot(Vehicle vehicle){
        List<ParkingSpot> vehicleSpots = spots.get(vehicle.getVehicleType());
        for(ParkingSpot spot : vehicleSpots){
            if (!spot.isOccupied()){
                return spot;
            }
        }
        return null;
    }
}
