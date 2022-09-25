public class Main {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 30;
        int sayi3 = 40;

        int enBuyuk = sayi3;

        if(enBuyuk<sayi2){
            enBuyuk = sayi2;
        }
        else if (enBuyuk<sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En Büyük Sayı: " + enBuyuk);



    }
}