Requirements for the Parking Lot System:
Types of Vehicles Supported:

Motorcycle
Car
Bus
Parking Spot Assignment Rules:

Motorcycle can park in:
Motorcycle spots
Compact spots
Large spots
Car can park in:
Compact spots
Large spots
Bus can park only if there are 5 consecutive Large spots available.
Spot Size Constraints:

Each vehicle type occupies a different number of spots:
Motorcycle: 1 spot (can fit in any spot).
Car: 1 spot (compact or large).
Bus: Requires 5 consecutive large spots.
Levels in the Parking Lot:

The parking lot will consist of multiple levels, with each level having several rows of parking spots.
Each level can have a combination of different spot sizes (Motorcycle, Compact, Large).

1. Class Design and Inheritance
Question: Explain the inheritance hierarchy in this code. How is polymorphism achieved through abstract methods?
Requirement: The base class Vehicle uses the ABCMeta metaclass, making it an abstract class. It contains an abstract method can_fit_in_spot that is implemented by subclasses like Motorcycle, Car, and Bus. This showcases how polymorphism is achieved, as each subclass implements can_fit_in_spot differently based on its specific behavior.
2. Encapsulation and Constructor Parameters
Question: What are the properties encapsulated within the Vehicle class, and how are they initialized?
Requirement: The Vehicle class encapsulates properties like vehicle_size, license_plate, spot_size, and spots_taken. These are initialized in the constructor of the Vehicle class, and the subclasses call this constructor using super().
3. Enum Usage
Question: How is the Enum class used to represent vehicle sizes, and why would you use an Enum here instead of simple constants?
Requirement: The VehicleSize enum is used to define different types of vehicle sizes (MOTORCYCLE, COMPACT, LARGE). Enums ensure type safety and make the code more readable, avoiding the need for hardcoded values.
4. Aggregation and Composition
Question: Describe the relationship between ParkingLot, Level, and ParkingSpot. How does composition play a role here?
Requirement: The ParkingLot class contains a list of Level objects, and each Level object contains a list of ParkingSpot objects. This is an example of composition, where ParkingLot is composed of multiple Level objects, and each Level is composed of multiple ParkingSpot objects.
5. Dynamic Method Dispatch
Question: How does the method park_vehicle demonstrate dynamic method dispatch?
Requirement: In the ParkingLot class, the park_vehicle method calls park_vehicle on each Level. Similarly, in Level, the park_vehicle method calls can_fit_in_spot on the Vehicle object. This demonstrates dynamic dispatch, where the actual method invoked depends on the runtime type of the object (i.e., whether the vehicle is a Motorcycle, Car, or Bus).
6. Error Handling and Missing Logic
Question: Identify any missing functionality or error handling in the code that should be addressed in a complete design.
Requirement: Methods like _find_available_spot, _park_starting_at_spot, park_vehicle in ParkingSpot, and remove_vehicle in ParkingSpot are currently not implemented. These need to be defined to handle the parking logic and vehicle removal from spots.
7. Abstract Classes and Interfaces
Question: Why is the Vehicle class abstract, and what is the purpose of the can_fit_in_spot abstract method?
Requirement: The Vehicle class is abstract because it represents a general concept of a vehicle, but each specific vehicle (like Motorcycle, Car, and Bus) may have different implementations of the can_fit_in_spot method, depending on the size and type of vehicle.
8. Spot Allocation Strategy
Question: How would you implement a strategy to find the best spot for parking a vehicle based on the current design?
Requirement: The method _find_available_spot in the Level class should contain the logic to search for an available parking spot that fits the vehicle. This might include checking each spot for availability and whether the vehicle can fit in it.





