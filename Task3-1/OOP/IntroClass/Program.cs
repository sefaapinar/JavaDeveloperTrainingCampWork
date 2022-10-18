using System;

namespace IntroClass
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //CreditManager creditManager = new CreditManager();
            // creditManager.Calculate();
            // creditManager.Confirm();
            // Customer customer = new Customer();
            // customer.Id = 1;
            // customer.FirstName = "Sefa";
            // customer.LastName = "Pınar";
            // customer.NationalIdentity = "12345643210";



            // CustomerManager customerManager  = new CustomerManager( customer);
            // customerManager.Save(customer);
            // customerManager.Save(customer);
            // customerManager.Save(customer);
            // Company company = new Company();
            // company.FirstName = "Ece";
            // company.TaxNumber = "1111";

            // Person person
            //  = new Person();
            // person.RegistrationNumber = "2222";

            // company.TaxNumber = "222223";
            // company.FirstName = "Arçelik";
            // company.Id = 2;




            //IoC Container
            CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
            customerManager.GiveCredit();





            Console.ReadLine();

           
        }
        //DRY Do not Repeat your self
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
            ICreditManager _creditManager;
            public CustomerManager(Customer customer, ICreditManager creditManager)
            {
                _customer = customer;
                _creditManager = creditManager;
            }
            public void Save(Customer customer)
            {
                Console.WriteLine("Kaydedildi!");
            }
            public void Delete()
            {
                Console.WriteLine("Müşteri Silindi!");
            }
            
            public void GiveCredit()
            {
                _creditManager.Calculate();
                Console.WriteLine("Kredi Verildi!");

            }
        }
        //Interface'ler referans tiplerdir.
        class Person : Customer
        {
            public String RegistrationNumber { get; set; }
        }
        //sonar qube - projemijle ilgili zafiyetleri söyleyen yardımcı programdır.
        class Company:Customer
        {
            public String CustomerName { get; set; }
            public String TaxNumber { get; set; }
        }
        
        interface ICreditManager
        {
            void Calculate();
            void Save();
        }

        abstract class BaseCreditManager : ICreditManager
        {
            public abstract void Calculate();
            


            public virtual void Save()
            {
                Console.WriteLine("Kaydedildi!");
            }
        }
        //Abstract classlar ve Interfaceler asla newlenemez.

        class TeacherCreditManager : BaseCreditManager,ICreditManager
        {
            public override void Calculate()
            {
                Console.WriteLine("Öğretmen Kredisi Hesaplandı!");
            }

           

            public void Save()
            {
                Console.WriteLine("Öğretmen Kredisi Onaylandı!");
            }
        }
        class MilitaryCreditManager : BaseCreditManager, ICreditManager
        {
            public override void Calculate()
            {
                throw new NotImplementedException();
            }

           
        }
    }
}
