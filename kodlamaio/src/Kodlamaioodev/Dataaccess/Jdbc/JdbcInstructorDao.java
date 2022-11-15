package Kodlamaioodev.Dataaccess.Jdbc;

import Kodlamaioodev.Dataaccess.InstructorDao;
import Kodlamaioodev.entities.Instructor;


public class JdbcInstructorDao implements InstructorDao {

    @Override
    public void add(Instructor instructor) {
        System.out.println("E�itmen bilgileri jdbc ile veritaban�na eklendi.");
    }

}

