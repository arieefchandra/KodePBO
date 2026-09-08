package Jobsheet1.Percobaan2;

public class BukuPelajaran extends Buku {
   private String matkul;
   private int tingkat;

   public BukuPelajaran() {
   }

   public void setMatkul(String var1) {
      this.matkul = var1;
   }

   public void setTingkat(int var1) {
      this.tingkat = var1;
   }

   public void cetakInfo() {
      super.cetakInfo();
      System.out.println("Mata Kuliah    : " + this.matkul);
      System.out.println("Tingkat        : " + this.tingkat);
      System.out.println("Jenis          : Buku Pelajaran \n ");
   }
}
