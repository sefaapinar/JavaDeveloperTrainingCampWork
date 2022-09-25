public class Main {
    public static void main(String[] args) {

        String mesaj = "Hello my friends!";
        System.out.println(mesaj);

        System.out.println("Yukarıda verilen string ifadenin uzunluğunu verir." + mesaj.length());
        System.out.println("Mesaj değerinin 5. elemanını verir." + mesaj.charAt(4));
        System.out.println("Mesaj değeri b ile başlıyorsa true döndürür." + mesaj.startsWith("B"));
        System.out.println("Mesaj değeri b ile bitiyorsa true döndürür." + mesaj.endsWith("B"));

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);

        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('e')); //belirtilen karakterin mesajın içerisinde kaçıncı eleman olduğunu bulmaya yarar.
        System.out.println(mesaj.lastIndexOf('e')); //string içerisinde aramaya sondan yani sağdan başlar.

        System.out.println(mesaj.replace( ' ','-')); //boşluk olan yerlere - yazmasını istedik.

        System.out.println(mesaj.substring(2)); //string parçalama uygular.
        System.out.println(mesaj.substring(2,5)); //string parçalama uygular.

        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.toLowerCase());


    }
}