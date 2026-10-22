package Jobsheet9.InterfaceClass;

public class Rektor {
    public void beriSertifikatComlaude(Icomlaude mahasiswaComlaude){
        System.out.println("Saya REKROR, memberikan sertfikat cumlaude.");
        System.out.println("Selamat1 Silahkan perkenalkan diri Anda");

        mahasiswaComlaude.lulus();
        mahasiswaComlaude.meraihIPKTertinggi();

        System.out.println("-------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswaBerprestasi){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda Bisa berprestasi?");

        mahasiswaBerprestasi.menjuaraiKompetisi();
        mahasiswaBerprestasi.membuatPublikasiIlmiah();

        System.out.println("-------------------------------------------");
    }
}
