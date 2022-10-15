public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new MySQLDatabaseManager();
        customerManager.getCustomers();

        //Şuan Oracle database geçti sistemimiz.


    }
}