package Jobsheet1.Percobaan2;

public class BukuDemo {
   public BukuDemo() {
   }

   public static void main(String[] var0) {
      Buku var1 = new Buku();
      var1.setJudul(" Pemograman Java");
      var1.setJumHalaman(150);
      System.out.println("DATA BUKU");
      var1.cetakInfo();
      BukuPelajaran var2 = new BukuPelajaran();
      var2.setJudul("Transport Processes and Separation Process Principles");
      var2.setJumHalaman(500);
      var2.setMatkul("Kimia");
      var2.setTingkat(2);
      System.out.println("\n DATA BUKU PELAJARAN");
      var2.cetakInfo();
      BukuNovel var3 = new BukuNovel();
      var3.setJudul("Bandung After Rain");
      var3.setJumHalaman(282);
      var3.setPenulis("Wulan Nur Amalia");
      var3.setGenre("Romance");
      System.out.println("\n DATA BUKU NOVEL");
      var3.bacaNovel();
      var3.cetakInfo();
      BukuKomik var4 = new BukuKomik();
      var4.setJudul("Conan");
      var4.setJumHalaman(140);
      var4.setIlustrator("Gosho Aoyoma");
      var4.setSeries(6);
      System.out.println("\n DATA BUKU KOMIK");
      var4.bacaKomik();
      var4.cetakInfo();
   }
}

