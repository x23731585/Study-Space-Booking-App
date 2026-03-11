/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author steve
 */
// Booking.java
public class Booking {
    private int bookingId;
    private Student student;
    private StudySpace studySpace;
    private String bookingDate;


    //Constructor
    public Booking(int bookingId, Student student, StudySpace studySpace, String bookingDate) {
        this.bookingId = bookingId;
        this.student = student;
        this.studySpace = studySpace;
        this.bookingDate = bookingDate;
    }

    //getters
    public int getBookingId() {
        return bookingId;
    }
    
    //setters
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudySpace getStudySpace() {
        return studySpace;
    }

    public void setStudySpace(StudySpace studySpace) {
        this.studySpace = studySpace;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", student=" + student +
                ", studySpace=" + studySpace +
                ", bookingDate='" + bookingDate + '\'' +
                '}';
    }
}
