package Kodlamaioodev.Core.Logging;



public class DatabaseLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Database Logland� : " + message);
    }

}
