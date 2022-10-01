public class Main {
    public static void main(String[] args) {

        /*ICustomerDal customerDal = new ICustomerDal() */

        //interfacelerde, abstract classlar gibi uygun değildir.

        ICustomerDal customerDal = new OracleCustomerDal();

        //implementasyon = bir class birden fazla interfaceyi implemente edebilir.


    }
}