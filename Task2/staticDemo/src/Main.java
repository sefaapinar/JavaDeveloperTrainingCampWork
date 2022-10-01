public class Main {
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        Product product = new Product();



        product.price = 999.000;
        product.name = "Mouse";


        productManager.Add(product);




    }
}