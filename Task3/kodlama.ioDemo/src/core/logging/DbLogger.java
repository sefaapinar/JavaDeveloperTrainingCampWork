package core.logging;

public class DbLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Veri tabanına Loglandı!" + message);
    }
}
