package Kodlamaioodev.Dataaccess.HiberNate;




import java.util.ArrayList;
import java.util.List;

import Kodlamaioodev.Dataaccess.CourseDao;
import Kodlamaioodev.entities.Course;

public class HibernateCourseDao implements CourseDao{

    List<Course> courses;

    public HibernateCourseDao() {
        courses = new ArrayList<Course>();
    }

    @Override
    public void add(Course course) {
        System.out.println("Kurs bilgileri Hibernate ile veritaban�na eklendi");
        courses.add(course);
    }

    @Override
    public List<Course> getAll() {
        return courses;
    }

}
