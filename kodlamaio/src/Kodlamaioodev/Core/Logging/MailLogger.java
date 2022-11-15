package Kodlamaioodev.Core.Logging;




public class MailLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Maile Logland� : " + message);
    }
}