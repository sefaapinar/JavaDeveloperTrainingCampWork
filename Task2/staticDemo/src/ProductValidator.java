public class ProductValidator {
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }


    public void bisey(){

    }

    public class outherclass{
        public static void  Delete(){
            //inner class uygulaması.
        }
    }
}

//Bir metodu static yaptığımız da class ismiyle direk çağırılır.


