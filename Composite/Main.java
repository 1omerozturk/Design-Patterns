public class Main {
    public static void main(String[] args) {
        Bolum kitap = new Bolum("Programlamaya Giriş");
        Bolum b1 = new Bolum("Giriş");
        b1.Add(new Metin("Hello World"));
        b1.Add(new Metin("Programlama"));
        Bolum b12=new Bolum("Java Temelleri");
        b12.Add(new Metin("Değişkenler"));
        b12.Add(new Metin("Döngüler"));
        b12.Add(new Metin("Kontrol Düzenleyicileri"));
        b1.Add(b12);

        Bolum b2= new Bolum("Değişkenler");
        b2.Add(new Resim("degiskenler.jpg"));
        b2.Add(new Metin("int, double, float, boolean, String ve Char"));
        
        kitap.Add(b1);
        kitap.Add(b2);

        yazdir(kitap);
        System.out.println();
        yazdir(b12);

    }

    public static void yazdir(Icerik icerik){
        icerik.Operation();
    }
}
