import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course(1,"Flutter Advanced Programming",440.00);
        Course course2 = new Course(2,"JavaScript Advanced Programming",555.00);
        Course course3 = new Course(3,"C# Advanced Programming",775.00);

        Category category = new Category(1,"Back-End","C#");
        Category category1 = new Category(2,"Front-End","HTML&CSS");
        Category category2 = new Category(3,"MobileApp-Developer","Flutter");

        Instructor instructor = new Instructor(1,"Engin","Demiroğ",15);
        Instructor instructor1 = new Instructor(2,"Fatih","Çakıroğlu",16);
        Instructor instructor2 = new Instructor(3,"Murat","Yücedağ",10);





    }
}