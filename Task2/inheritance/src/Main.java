public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Customer customer = new Customer();
        Employee employee = new Employee();


        // customer ve employee içerisindeki ortak özellikler Kalıtım yoluyla "Person" class'ından geldi.
        customer.id = 1;
        customer.firstName = "Engin";

        employee.id = 2;
        employee.firstName = "Ahmet";

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        customerManager.Add();
        employeeManager.BestEmployee();

    }
}