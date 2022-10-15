package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    public void Add(Course course,Course [] courses) throws Exception{
        for(Course course1 :courses){
            if(course1.getCourseName() == course.getCourseName()){
                throw new Exception("Bu kurs zaten var!");
            }
        }
        if(course.getCourseUnitPrice()<=0){
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz!");
        }
        courseDao.Add(course);
        for(Logger logger:loggers){
            logger.log(course.getCourseName());
        }
    }
}
