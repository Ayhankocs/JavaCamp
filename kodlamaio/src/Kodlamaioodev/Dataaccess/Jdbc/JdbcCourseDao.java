package Kodlamaioodev.Dataaccess.Jdbc;



import java.util.ArrayList;
import java.util.List;
import Kodlamaioodev.Dataaccess.CourseDao;
import Kodlamaioodev.entities.Course;

public class JdbcCourseDao implements CourseDao{

    List<Course> courses;

    public JdbcCourseDao() {
        courses = new ArrayList<Course>();
    }

    @Override
    public void add(Course course) {
        System.out.println("Kurs bilgileri jdbc ile veritaban�na eklendi.");
        courses.add(course);
    }

    @Override
    public List<Course> getAll() {
        return courses;
    }

}

