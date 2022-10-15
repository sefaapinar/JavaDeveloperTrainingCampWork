package dataAccess;

import entities.Instructor;

import java.util.List;

public interface InstructorDao {
    void Add(Instructor instructor);
    void Delete(Instructor instructor);
    void Update(Instructor instructor);
    List<Instructor> getAllInstructor(List<Instructor> instructors);
}
