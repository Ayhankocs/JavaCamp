public class CustomerManager {
    private Baselogger logger;
    public CustomerManager(Baselogger logger){
        this.logger=logger;
    }
    public void Add(){
        System.out.println("Müşteri eklendi");
        this.logger.log("log mesajı");
    }
}
