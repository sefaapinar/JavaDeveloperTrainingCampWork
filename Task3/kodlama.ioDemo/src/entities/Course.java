package entities;

public class Course {
    private int courseID;
    private String courseName;
    private Double courseUnitPrice;

   public Course(int courseID,String courseName,Double courseUnitPrice){
       this.courseID = courseID;
       this.courseUnitPrice = courseUnitPrice;
       this.courseName = courseName;
   }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getCourseUnitPrice() {
        return courseUnitPrice;
    }

    public void setCourseUnitPrice(Double courseUnitPrice) {
        this.courseUnitPrice = courseUnitPrice;
    }
}
