public class Main {
    public static void main(String[] args) {

        int number = 27;

        int reminder = number % 2; // mod 2%'ye bölümünden kalanı hesaplatırız.

        //reminder = hatırlatma
        //asal sayı = Sadece kendisine ve 1 sayısına kalansız bölünebilen 1'den büyük sayı
        boolean isPrime = true;

        if(number == 1){
            System.out.println("Sayi Asal Sayi Değildir.");
            return;
        }
        else if (number < 1) {
            System.out.println("Geçersiz sayi girdiniz. ");
        }

        for(int i = 2; i < number; i++){
            if(number % i == 0) {
                isPrime = false;
            }
        }

        if(isPrime == true){
            System.out.println("Sayı Asaldır.");
        }
        else {
            System.out.println("Sayı Asal Değildir.");
        }



    }
}