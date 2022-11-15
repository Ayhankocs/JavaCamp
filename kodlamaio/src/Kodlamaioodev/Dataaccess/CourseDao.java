package Kodlamaioodev.Dataaccess;


import java.util.List;
import Kodlamaioodev.entities.Course;


public interface CourseDao {
    void add(Course course);
    List<Course> getAll();
}
