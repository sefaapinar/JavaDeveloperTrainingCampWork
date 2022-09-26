public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.productName = "Iphone 14 PROMAX";
        product.productId = 1;
        product.productDescription = "IOS 16";
        product.productStockAmount = 3;
        product.productPrice = 45.000;

        System.out.println(product.productName);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}