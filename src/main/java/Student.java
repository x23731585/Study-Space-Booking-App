/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author steve
 */
// Student.java extends user
public class Student extends User {
    private String course;

    //constructors
    public Student(int userId, String name, String course) {
        super(userId, name);
        this.course = course;
    }
    
    //getters
    public String getCourse() {
        return course;
    }
    
    //setters
    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userId=" + getUserId() +
                ", name='" + getName() + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}