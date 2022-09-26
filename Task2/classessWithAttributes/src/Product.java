public class Product {

    //attribute / field
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productId;
    private int productStockAmount;

    public int getProductId(){
        return productId();
    }

    public void setProductId(int productId){
        this.productId = productId; //this.productId içerisinde bulunduğum classtır.
    }
}
