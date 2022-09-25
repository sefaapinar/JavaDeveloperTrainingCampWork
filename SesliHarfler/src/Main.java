public class Main {
    public static void main(String[] args) {

        char harf = 'i';

        switch (harf){
            case 'A','I','O','U':
                System.out.println("Kalın - Büyük Sesli Harfler.");
                break;
            case 'a','ı','o','u':
                System.out.println("Kalın - küçük Sesli Harfler");
                break;
            case 'E','İ','Ü','Ö':
                System.out.println("İnce - Büyük sesli Harfler.");
                break;
            case 'e','i','ü','ö':
                System.out.println("İnce - Küçük sesli harfler");
                break;

        }
    }
}