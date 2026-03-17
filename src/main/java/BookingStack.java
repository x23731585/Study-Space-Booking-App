/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

// The top of the stack is stored at index 0

public class BookingStack {

    private ArrayList<Booking> theStack;

    // Constructor
    public BookingStack() {
        theStack = new ArrayList<>();
    }

    // check if the stack empty 
    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    // Adds a booking to the top of the stack
    public void push(Object newItem) {
        theStack.add(0, (Booking) newItem);
    }

    // Removes and returns the booking from the stack
    public Object pop() {

        //remove if the stack has elements
        if (!theStack.isEmpty()) {
            return theStack.remove(0);
        }
        else {
            return null;
        }
    }

    // Returns number of bookings in the stack
    public int size() {
        return theStack.size();
    }
    

}