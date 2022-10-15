public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(){
        this.customerDal = iCustomerDal;
    }
    public void Add(){
        //business iş kodları yazılır.
        customerDal.Add();
    }
}
