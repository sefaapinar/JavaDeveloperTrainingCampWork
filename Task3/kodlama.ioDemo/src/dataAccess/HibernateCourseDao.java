package dataAccess;

import entities.Course;

import java.util.List;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void Add(Course course) {
        System.out.println("Course: " + course.getCourseName() + "Hibernate Teknolojisi ile Eklendi!");
    }

    @Override
    public void Delete(Course course) {
        System.out.println("Course: " + course.getCourseID() + "Hibernate Teknolojisi ile Silindi!");
    }

    @Override
    public void Update(Course course) {
        System.out.println("Course: " + course.getCourseID() + "Hibernate Teknolojisi ile Güncellendi!");
    }

    @Override
    public List<Course> getAllCourses(List<Course> courses) {
        return courses;
    }
}
