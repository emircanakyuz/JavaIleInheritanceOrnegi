public class Ogrenci {
    private int ogrenciNo;
    private String isim;
    private int burs;
    private String ders;

    public Ogrenci(int ogrenciNo,String isim, int burs, String ders){
        this.burs=burs;
        this.ders=ders;
        this.ogrenciNo=ogrenciNo;
        this.isim=isim;
    }

    public Ogrenci(int ogrenciNo, String isim, int burs){
        this.isim=isim;
        this.ogrenciNo=ogrenciNo;
        this.burs=ogrenciNo;
    }

    public void bilgileriGoster(){
        System.out.println("Öğrenci ismi: " + ogrenciNo + " Aldığı ders sayısı " + ders + " Aldığı Burs Miktarı: " + burs + " ismi: " + isim);
    }

    public int getOgrenciNo(){
        return ogrenciNo;
    }
    public String getIsim(){
        return isim;
    }
    public String getDers(){
        return ders;
    }
    public int getBurs(){
        return burs;
    }
}
