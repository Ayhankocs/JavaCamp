public class Main {
    public static void main(String[] args) {
     /*  Baselogger[] loggers=new Baselogger[]{new Filelogger(),new Datebaselogger(),new Emaillogger(),new Consolllogger()};
       for (Baselogger logger:loggers){
           logger.log("log mesajı");
       }
*/     CustomerManager customerManager=new CustomerManager(new Datebaselogger());
       customerManager.Add();
    }
}