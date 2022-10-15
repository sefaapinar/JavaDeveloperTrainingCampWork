using System;

namespace IntroClass
{
    internal class Program
    {
        static void Main(string[] args)
        {
           CreditManager creditManager = new CreditManager();
            creditManager.Calculate();
            creditManager.Confirm();
            Customer customer = new Customer();
            customer.Id = 1;
            customer.FirstName = "Sefa";
            customer.LastName = "Pınar";
            customer.NationalIdentity = "12345643210";



            CustomerManager customerManager  = new CustomerManager( customer);
            customerManager.Save(customer);
            customerManager.Save(customer);
            customerManager.Save(customer);
            Company company = new Company();
            company.FirstName = "Ece";
            company.TaxNumber = "1111";
            
            Person person
             = new Person();
            person.RegistrationNumber = "2222";

            company.TaxNumber = "222223";
            company.FirstName = "Arçelik";
            company.Id = 2;










            Console.ReadLine();

           
        }

        class CreditManager
        {
            public void Calculate()
            {
                //Bir sürü kod olabilir.

                Console.WriteLine("Hesaplandı!");
            }
            public void Confirm()
            {
                //Bir sürü kod olabilir.

                Console.WriteLine("Kredi Onaylandı!");
            }
        }
        class Customer
        {
            public Customer()
            {
                Console.WriteLine("Müşteri Nesnesi Başlatıldı!");
            }

            public int Id { get; set; }
            public string FirstName { get; set; }
            public string LastName { get; set; }
            public string NationalIdentity { get; set; }
        }

        //Katmanlı mimariler için temeldir.
        class CustomerManager
        {
            private Customer _customer;
            public CustomerManager(Customer customer)
            {
                _customer = customer;
            }
            public void Save(Customer customer)
            {
                Console.WriteLine("Kaydedildi!" + _customer.FirstName);
            }
            public void Delete()
            {
                Console.WriteLine("Müşteri Silindi!" + _customer.FirstName);
            }
        }
        class Person : Customer
        {
            public String RegistrationNumber { get; set; }
        }

        class Company:Customer
        {
            public String CustomerName { get; set; }
            public String TaxNumber { get; set; }
        }
        
    }
}
