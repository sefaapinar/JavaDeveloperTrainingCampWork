public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    public void Add(){
        System.out.println("Müşteri Eklendi!");
        DatabaseLogger logger = new DatabaseLogger();
        logger.Log("Log mesajı");

        this.logger.Log("Log Mesajı");
        //bir classı başka bir classın içerisinde log yapmak database'e bağlı kalmak tehlikesinde olabiliriz.

    }
}
