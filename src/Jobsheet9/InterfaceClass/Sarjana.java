package Jobsheet9.InterfaceClass;

public class Sarjana extends Mahasiswa implements Icomlaude,IBerprestasi {
    public Sarjana(String nama){
        super(nama);
    }

    @Override 
    public void lulus(){
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override 
    public void meraihIPKTertinggi(){
        System.err.println("IPK-ku lebih dari 3,51");
    }

     @Override 
    public void menjuaraiKompetisi(){
        System.out.println("Saya telah menjuarai kompetisi INTERNATIONAL");
    }

    @Override 
    public void membuatPublikasiIlmiah(){
        System.out.println("Saya menerbitkan artikel di jurnal INTERNATIONAL");
    }
}
