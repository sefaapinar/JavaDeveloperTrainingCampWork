public class Main {
    public static void main(String[] args) {

        //Çok biçimlilik demektir.

        EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log("Email Log Mesajı!!!");
/*
        BaseLogger [] loggers = new BaseLogger[]{new EmailLogger(),new ConsoleLogger(),new FileLogger(),new DatabaseLogger()};
        for (BaseLogger logger:loggers){
            logger.Log("Log Mesajı");
        }*/

        // toplu commit için ctrl + shift + /

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.Add();

    }
}