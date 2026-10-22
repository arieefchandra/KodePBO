package Jobsheet9.InterfaceClass;

public class Rektor {
    public void beriSertifikatComlaude(Icomlaude mahasiswaComlaude){
        System.out.println("Saya REKROR, memberikan sertfikat cumlaude.");
        System.out.println("Selamat1 Silahkan perkenalkan diri Anda");

        mahasiswaComlaude.lulus();
        mahasiswaComlaude.meraihIPKTertinggi();

        System.out.println("-------------------------------------------");
    }
}
