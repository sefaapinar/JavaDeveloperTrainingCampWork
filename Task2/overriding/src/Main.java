public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    /*    AskerKrediManager askerKrediManager = new AskerKrediManager();
        System.out.println(askerKrediManager.Hesapla(1000));
    }*/
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new AskerKrediManager(), new TarimKrediManager(),new OgrenciKrediManager()};


        for (BaseKrediManager krediManager : krediManagers){
            krediManager.Hesapla(1000);

        }


    }
}