package InterviewQuestions.HotelManagement;

public class Room {
    private RoomType roomType;
    private boolean isAvaiable;
    private int roomNumber;
    public Room(RoomType roomType, int roomNumber){
        this.roomNumber = roomNumber;
        this.isAvaiable = true;
        this.roomNumber = roomNumber;
    }
    public boolean isAvaiable() {
        return isAvaiable;
    }
    public boolean markAsBooked(){
        if (isAvaiable){
            isAvaiable = false;
            return true;
        }
        return false;
    }

    public void markAsAvailable(){
        isAvaiable = true;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
