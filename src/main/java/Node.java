/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyspacebookingapp.DATASTRUCTURE;

/**
 *
 * @author steve
 */
// Node class used for the linked list
// Each node stores an element and references to the next and previous nodes

public class Node {

    // The object stored in the node
    private Object element;
    private Node next;
    private Node prev;
    // Empty constructor
    public Node() {
    }

    // Constructor
    public Node(Object element, Node next, Node prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    // Returns the element stored in the node
    public Object getElement() {
        return element;
    }

   
    public Node getNext() {
        return next;
    }

    // Returns the previous node in the list
    public Node getPrev() {
        return prev;
    }

    // Sets the next node reference
    public void setNext(Node next) {
        this.next = next;
    }

    // Sets the previous node reference
    public void setPrev(Node prev) {
        this.prev = prev;
    }
}