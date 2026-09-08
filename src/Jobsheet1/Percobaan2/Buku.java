package Jobsheet1.Percobaan2;

public class Buku {
   private String judul;
   private int jumHalaman;

   public Buku() {
   }

   public void setJudul(String var1) {
      this.judul = var1;
   }

   public void setJumHalaman(int var1) {
      this.jumHalaman = var1;
   }

   public void cetakInfo() {
      System.out.println("Judul          : " + this.judul);
      System.out.println("Jumlah Halaman : " + this.jumHalaman);
   }
}
