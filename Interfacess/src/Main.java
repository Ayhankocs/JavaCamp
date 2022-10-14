public class Main {
    public static void main(String[] args) {
     CustomerManager customerManager=new CustomerManager();
     CustomerManager.customerDals=new OracleCustomerDal();
     CustomerManager.add();
    }
}