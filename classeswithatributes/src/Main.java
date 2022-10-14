public class Main {
    public static void main(String[] args) {
        product product=new  product();
        product.set_name("laptop");
        product._id=1;
        product.set_description("asus laptop");
        product.set_stockAmount(3000);
        product.set_color("BLACK");
        product.set_cod("LB4");




        productManager productManager=new productManager();
        productManager.add(product);
        System.out.println(product.get_cod());
    }
}