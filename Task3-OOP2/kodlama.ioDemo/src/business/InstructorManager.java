package business;

import core.logging.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger logger;

    public InstructorManager(InstructorDao instructorDao, Logger logger) {
        this.instructorDao = instructorDao;
        this.logger = logger;
    }

    public void Add(Instructor instructor){
        instructorDao.Add(instructor);

    }
}
