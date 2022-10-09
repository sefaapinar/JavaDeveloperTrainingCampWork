package entities;

public class Instructor {
    private int instructorID;
    private String instructorFirstName;
    private String instructorLastName;
    private int instructorExperience;

    public Instructor(int instructorID, String instructorFirstName, String instructorLastName, int instructorExperience) {
        this.instructorID = instructorID;
        this.instructorFirstName = instructorFirstName;
        this.instructorLastName = instructorLastName;
        this.instructorExperience = instructorExperience;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    }

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }

    public int getInstructorExperience() {
        return instructorExperience;
    }

    public void setInstructorExperience(int instructorExperience) {
        this.instructorExperience = instructorExperience;
    }
}
