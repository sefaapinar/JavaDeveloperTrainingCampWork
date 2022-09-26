package classessWithAttributes;
/*
Encapsulation, kaps�lleme dedi?imiz bir y�ntemdir kullan?c?y? herhangi bir alan? kullanmak i�in k?s?tlamay? �ng�r�r.
Classlar?n bir di?er �zelli?i de �zellik tutmak. Classlar ilgili operasyonlar? ilgili �zellikleri tutarlar.
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