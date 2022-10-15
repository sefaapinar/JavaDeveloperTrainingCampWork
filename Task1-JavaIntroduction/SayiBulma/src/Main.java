public class Main {
    public static void main(String[] args) {

        int [] sayilar = new int[]{1,2,3,4,5};
        int arancak = 5;
        boolean varMi = false;

        for(int sayi: sayilar){
            if(sayi == arancak){
                System.out.println("Sayi Mevcuttur.");
            }
            else{
                System.out.println("Sayi Mevcut Değildir.");
            }
        }
    }
}