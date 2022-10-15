package dataAccess;

import entities.Category;
import entities.Course;

import java.util.List;

public interface CourseDao {
    void Add(Course course);
    void Delete(Course course);
    void Update(Course course);
    List<Course> getAllCourses(List<Course> courses);

}
