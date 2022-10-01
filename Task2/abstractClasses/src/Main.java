public class Main {
    public static void main(String[] args) {

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.GameOver();


        //Abstraction hesaplayı kullanabilir ama hesaplanın üzerine yazması zorunda.


       /* GameCalculator gameCalculator = new GameCalculator();
        */
        //ABSTRACT SINIFLAR ASLA NEWLENEMEZ!!!!!

        GameCalculator gameCalculator = new WomanGameCalculator();

    }
}