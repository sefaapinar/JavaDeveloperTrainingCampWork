public class Main {
    public static void main(String[] args) {

        int sayi1 = 220;
        int sayi2 = 284;

        int toplam1 = 0;
        int toplam2 = 0;

        for(int i = 1; i < sayi1; i++){
            if(sayi1 % 2 == 0){
                toplam1 = toplam1 + i;
            }
        }
        for(int i = 1; i<sayi2; i++){
            if(sayi2 % 2 == 0){
                toplam2 = toplam2 + i;
            }
        }

        if(sayi1 == sayi2 && sayi2 == sayi1){
            System.out.println("Bu iki sayı arkadaş sayılardır.");
        }
        else{
            System.out.println("Bu iki sayı arkadaş sayılar değildir.");
        }
    }
}