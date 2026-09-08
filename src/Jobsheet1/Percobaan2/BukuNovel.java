package Jobsheet1.Percobaan2;

public class BukuNovel extends Buku {
   private String penulis;
   private String genre;

   public BukuNovel() {
   }

   public void setPenulis(String var1) {
      this.penulis = var1;
   }

   public void setGenre(String var1) {
      this.genre = var1;
   }

   public void bacaNovel() {
      System.out.println("Novel sedang dibaca.");
   }

   public void cetakInfo() {
      super.cetakInfo();
      System.out.println("Penulis        : " + this.penulis);
      System.out.println("genre          : " + this.genre);
      System.out.println("Jenis          : Buku Novel");
   }
}
