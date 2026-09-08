package Jobsheet1.Percobaan2;

public class BukuKomik extends Buku {
   private String ilustrator;
   private int series;

   public BukuKomik() {
   }

   public void setIlustrator(String var1) {
      this.ilustrator = var1;
   }

   public void setSeries(int var1) {
      this.series = var1;
   }

   public void bacaKomik() {
      System.out.println("Komik sedang dibaca.");
   }

   public void cetakInfo() {
      super.cetakInfo();
      System.out.println("Ilustrator     : " + this.ilustrator);
      System.out.println("Jumlah series  : " + this.series);
      System.out.println("Jenis          : Buku Komik");
   }
}
