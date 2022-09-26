package classesWithAttributes;
/*
Ürüne ait bilgiler Product classında yer alıyor.
SOLID dediğimiz yazılım geliştirme prensipleri vardır. S = Tek sorumluluk prensibi bir class sadece bir işi yapar,
bir metot sadece bir işi yapar, bir iş bloğu sadece bir işi yapar. Bu bağlamda Product class'ı hep özellik tutup
hem de operasyonları içermemeli. private, sadece tanımlandığı blokta geçerli demek. Örneğin biz ürüne ait bir kod
oluşturmak istiyoruz ürünün baş harfi "L" sonuna id koyinca onun kodu oluyor ve bunu kullanıcı girmemeli sistem onu
bulmalı o yüzden kodu read only yapıyoruz sadece okuyabilir yazamaz kullanıcı onu. Burada encapsulation 'un en
önemli konularından biri getter ve setter. Setter = değer vermek Getter = Okumak. this, bu class demek.
Constructor: Class'ı newlediğimizde çalışan bloğu devreye sokuyoruz. Yazmasakta aslında boş bir constructor oluyor.
 */
public class Product {

    //Attribute veya field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
        System.out.println("Yapıcı blok çalıştı.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Ürünün fiyatı 0'dan küçük olamaz.");
        } else {
            this.price = price;
        }

    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() { //Kodu kullanıcının yazmasını engelledik sadece getter var.
        //substring, sadece belirlediğimiz yereden itibaren alıyor.
        return this.name.substring(0, 1) + id;
    }


}