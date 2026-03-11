/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author steve
 */
// StudySpace.java
public class StudySpace implements Bookable {
    private int spaceId;
    private String spaceName;
    private String location;
    private boolean available;

    public StudySpace() {
    }

    public StudySpace(int spaceId, String spaceName, String location, boolean available) {
        this.spaceId = spaceId;
        this.spaceName = spaceName;
        this.location = location;
        this.available = available;
    }

    public int getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(int spaceId) {
        this.spaceId = spaceId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void bookSpace() {
        if (available) {
            available = false;
        }
    }

    public void cancelBooking() {
        available = true;
    }

    @Override //coverts object details to string 
    public String toString() {
        return "StudySpace{" +
                "spaceId=" + spaceId +
                ", spaceName='" + spaceName + '\'' +
                ", location='" + location + '\'' +
                ", available=" + available +
                '}';
    }
}
