package dataAccess;

import entities.Course;

import java.util.List;

public class JDBCCourseDao implements CourseDao{
    @Override
    public void Add(Course course) {
        System.out.println("Kurs: " + course.getCourseName() + "JDBC teknolojisi ile eklendi!");
    }

    @Override
    public void Delete(Course course) {
        System.out.println("Kurs: " + course.getCourseID() + "JDBC teknoloisi ile silindi!");
    }

    @Override
    public void Update(Course course) {
        System.out.println("Kurs: " + course.getCourseName() + "JDBC teknolojisi ile güncellendi!");
    }

    @Override
    public List<Course> getAllCourses(List<Course> courses) {
        return courses;
    }
}
