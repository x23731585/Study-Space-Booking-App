/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyspacebookingapp.DATASTRUCTURE;

/**
 *
 * @author steve
 */

// stores StudySpace objects using Node objects

public class StudySpaceList {

 
    private Node head;
    private Node last;
    private Node curr;
    // Number of elements in the list
    private int size;

    // Constructor 
    public StudySpaceList() {
        head = null;
        last = null;
        curr = null;
        size = 0;
    }

    // Checks if the list is empty
    public boolean isEmpty() {
        return (size == 0);
    }

    
    public int size() {
        return size;
    }

    // Moves the current node to the specified index
    private void setCurrent(int index) {
        curr = head;

        for (int i = 1; i < index; i++) {
            curr = curr.getNext();
        }
    }

    // Adds an element to the end of the list
    public void add(Object element) {

        // Creates new node
        Node newNode = new Node(element, null, null);

        // If list is empty, head and last point to the new node
        if (size == 0) {
            head = newNode;
            last = newNode;
        }
        else {
            // Attach new node to end of list
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
        }

        size++;
    }

    // Returns the element at a specific position
    public Object get(int index) {
        setCurrent(index);
        return curr.getElement();
    }

    // Removes an element 
    public void remove(int index) {

        if (size > 0) {

            // Removing the first node
            if (index == 1) {
                head = head.getNext();

                if (head != null) {
                    head.setPrev(null);
                }
            }

            // Removing the last node
            else if (index == size) {
                last = last.getPrev();

                if (last != null) {
                    last.setNext(null);
                }
            }

            // Removing a middle node
            else {
                setCurrent(index);

                Node prev = curr.getPrev();
                Node next = curr.getNext();

                prev.setNext(next);
                next.setPrev(prev);
            }

            size--;
        }
    }

    // Traverses the list and returns all elements as a string
    public String printList() {

        String list = "";

       //loop through each node from head
        for (Node node = head; node != null; node = node.getNext()) {

           
            list = list + node.getElement() + "\n";
        }

        return list;
    }
}
