package Kodlamaioodev;
import Kodlamaioodev.Business.CategoryManager;
import Kodlamaioodev.Business.CourseManager;
import Kodlamaioodev.Business.InstructorManager;
import Kodlamaioodev.Core.Logging.FileLogger;
import Kodlamaioodev.Core.Logging.Logger;
import Kodlamaioodev.Core.Logging.MailLogger;
import Kodlamaioodev.Dataaccess.HiberNate.HibernateCategoryDao;
import Kodlamaioodev.Dataaccess.Jdbc.JdbcCourseDao;
import Kodlamaioodev.Dataaccess.Jdbc.JdbcInstructorDao;
import Kodlamaioodev.entities.Category;
import Kodlamaioodev.entities.Course;
import Kodlamaioodev.entities.Instructor;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------KURSLAR B�L�M�------------------------");
        Course course1 = new Course(1, "(2022) Yaz�l�m Geli�tirici Yeti�tirme Kamp� - JAVA", "java.png", 100);
        Course course2 = new Course(2, "Senior Yaz�l�m Geli�tirici Yeti�tirme Kamp� (.NET)", "net.png", 100);
        Course course3 = new Course(3, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JavaScript)", "javaScript.png", 100);
        Course course4 = new Course(4, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + REACT)", "react.png", 100);
        Course course5 = new Course(5, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "angular.png", 100);
        Course course6 = new Course(6, "Programlamaya Giri� i�in Temel Kurs", "programlama.png", 100);
        Course course7 = new Course(7, "Programlamaya Giri� i�in Temel Kurs", "programlama.png", 100);
        Course course8 = new Course(7, "Programlamaya Giri� i�in Temel Kurs-2", "programlama.png", -100);

        CourseManager courseManager = new CourseManager(new JdbcCourseDao());

        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);
        courseManager.add(course4);
        courseManager.add(course5);
        courseManager.add(course6);
        courseManager.add(course7);
        courseManager.add(course8);
        System.out.println("------------------------------------------------------");
        courseManager.getAll();
        System.out.println("--------------------KATEGOR�LER B�L�M�------------------------");
        Category category = new Category(1, "Programlama");
        Category category2 = new Category(2, "yaz�l�m");
        Category category3 = new Category(3, "yaz�l�m");

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());

        categoryManager.add(category);
        categoryManager.add(category2);
        categoryManager.add(category3);
        System.out.println("------------------------------------------------------");
        categoryManager.getAll();
        System.out.println("--------------------E��TMENLER B�L�M�------------------------");

        Instructor instructor = new Instructor(1, "Engin", "Demiro�");

        Logger[] loggers = { new FileLogger(), new MailLogger() };

        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);

        instructorManager.add(instructor);
    }
}
