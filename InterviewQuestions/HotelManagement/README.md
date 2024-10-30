Room
- roomType
- roomNumber
- isAvailable

roomType: STANDARD, DELUXE, FAMILY SUITE

RoomService


Booking 
- bookingId
- customer
- room
- checkin date
- CheckoutDate


Notification:
- sendNotifcation

User ()
- name
- customerId
- searchInventory()
- bookRoom()


Implementation Notes:
- Use Map -> for efficient lookup
- 