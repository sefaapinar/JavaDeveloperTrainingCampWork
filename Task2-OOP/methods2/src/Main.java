public class Main {
    public static void main(String[] args) {
        String mesaj = "Come to Galatasaray!";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(7,2);
        System.out.println(sayi);
        int toplam = topla2(2,3,4,5,6);
        System.out.println(toplam);
    }

    public static void ekle(){
        System.out.println("Eklendi!");
    }
    public static void  sil(){
        System.out.println("Silindi!");
    }
    public static void guncelle(){
        System.out.println("Güncellendi!");
    }

    //void operasyon bir şey yapmasını istediğimiz operasyonlardır.

    public static int topla(int say1,int say2){
        return say1+say2;
    }
    public static String sehirVer(){
        return "Kocaeli";
    }

    public static int topla2(int... sayilar){ //birden fazla integer göndermek istersek int ... bu üç nokta variableArguments olarak adlandırılır.
        int toplam = 0;
        for(int sayi:sayilar){
            toplam +=sayi;
        }
        return toplam;
    }


}