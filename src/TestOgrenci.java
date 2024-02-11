public class TestOgrenci extends Ogrenci {
    public TestOgrenci(int ogrenciNo, String isim, int burs) {
        super(ogrenciNo, isim, burs);
    }

    public static void main(String[] args){
        Ogrenci ogrenci=new Ogrenci(200541030, "Emir", 850, "7");
        Ogrenci ogrenci1=new Ogrenci(200457895, "Osman", 850, "8");

    }
}
