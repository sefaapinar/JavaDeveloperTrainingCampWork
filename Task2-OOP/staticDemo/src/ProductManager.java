public class ProductManager {
    public void Add(Product product){
        ProductValidator productValidator = new ProductValidator();
        if(productValidator.isValid(product)){
            System.out.println("Eklendi");
        }else{
            System.out.println("Eklenemedi");
        }

        ProductValidator productValidator1 = new ProductValidator();
        productValidator1.bisey();

        //statikler direk class ismiyle çağırılır.



    }
}
