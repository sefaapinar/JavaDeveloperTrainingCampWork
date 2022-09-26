package classessWithAttributes;
/*
Encapsulation, kapsülleme dedi?imiz bir yöntemdir kullan?c?y? herhangi bir alan? kullanmak için k?s?tlamay? öngörür.
Classlar?n bir di?er özelli?i de özellik tutmak. Classlar ilgili operasyonlar? ilgili özellikleri tutarlar.
 */
public class Main {

    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3, "Siyah");
//       product.setName("Laptop");
//       product.setId(1);
//       product.setDescription("Asus Laptop");
//       product.setPrice(5000);
//       product.setStockAmount(3);
        System.out.println(product.getKod());

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        // productManager.add2(1,"","",2,200);

    }

}