public class Main {
    public static void main(String[] args) {

        int number = 5;
        int total = 0;

        for(int i =1; i< number; i++){
            if(number % 2 == 0){
                total = total + i;
            }
        }
        if(total == number){
            System.out.println("Sayi Mükemmel Bir Sayidir.");
        }else {
            System.out.println("Sayi Mükemmel Bir sayi değildir.");
        }
    }
}