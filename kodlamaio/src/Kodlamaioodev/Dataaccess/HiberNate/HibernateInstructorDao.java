package Kodlamaioodev.Dataaccess.HiberNate;
import Kodlamaioodev.Dataaccess.InstructorDao;
import Kodlamaioodev.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

    @Override
    public void add(Instructor instructor) {
        System.out.println("E�itmen bilgileri Hibernate ile veritaban�na eklendi");
    }

}
