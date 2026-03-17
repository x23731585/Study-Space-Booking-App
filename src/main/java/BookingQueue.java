/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

//queue using ArrayList

public class BookingQueue {

//List of bookings 
    private ArrayList<Booking> theQueue;

    // Constructor creates empty queue
    public BookingQueue() {
        theQueue = new ArrayList<>();
    }

   
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    // Adds booking to end of queue
    public void enqueue(Object newItem) {
        theQueue.add((Booking) newItem);
    }

    // Removes and returns the front booking from the queue
    public Object dequeue() {

        // Only remove if queue has elements
        if (!theQueue.isEmpty()) {
            return theQueue.remove(0);
        }
        else {
            return null;
        }
    }

    // Returns the number of bookings in the queue
    public int size() {
        return theQueue.size();
    }
}
