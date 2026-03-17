/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author steve
 */
// controls the booking system logic

public class BookingManager {

    private StudySpaceList studySpaces;
    private BookingStack bookingStack;
    private BookingQueue bookingQueue;

    // Constructor
    public BookingManager() {
        studySpaces = new StudySpaceList();
        bookingStack = new BookingStack();
        bookingQueue = new BookingQueue();
    }

    // Adds a study space
    public void addStudySpace(StudySpace space) {
        studySpaces.add(space);
    }

    public StudySpaceList getStudySpaces() {
        return studySpaces;
    }

    // Searches for a study space by name
    public StudySpace searchStudySpace(String name) {

        // Loop through every study space in the list
        for (int i = 1; i <= studySpaces.size(); i++) {

            StudySpace space = (StudySpace) studySpaces.get(i);

            // Check if the name matches the search name
            if (space.getSpaceName().equalsIgnoreCase(name)) {
                return space;
            }
        }

 
        return null;
    }

    // Creates booking
    public void createBooking(Booking booking) {

        StudySpace space = booking.getStudySpace();

        // If the space is available, book it and add to stack
        if (space.isAvailable()) {
            space.bookSpace();
            bookingStack.push(booking);
        }
        else {
            // If the space is not available add booking to queue
            bookingQueue.enqueue(booking);
        }
    }

    // Cancels the most recent booking
    public Booking cancelLastBooking() {

        Booking booking = (Booking) bookingStack.pop();

        // If a booking exists it make the space available again
        if (booking != null) {
            booking.getStudySpace().cancelBooking();
        }

        return booking;
    }

}
