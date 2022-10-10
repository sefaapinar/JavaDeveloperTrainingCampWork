package dataAccess;

import entities.Instructor;

import java.util.List;

public class HibernateInstuctorDao implements InstructorDao{
    @Override
    public void Add(Instructor instructor) {
        System.out.println("Eğitmen : " + instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName() + "Hibernate teknolojisi ile eklendi!");
    }

    @Override
    public void Delete(Instructor instructor) {
        System.out.println("Eğitmen: " + instructor.getInstructorID() + "Hibernate teknolojisi ile silindi!");
    }

    @Override
    public void Update(Instructor instructor) {
        System.out.println("Eğitmen: " + instructor.getInstructorFirstName() + "Hibernate teknolojisi ile güncellendi!");
    }

    @Override
    public List<Instructor> getAllInstructor(List<Instructor> instructors) {
        return instructors;
    }
}
