package Jobsheet9.InterfaceClass;

public class PascaSarjana extends Mahasiswa implements Icomlaude,IBerprestasi {
    public PascaSarjana(String nama){
        super(nama);
    }

    @Override 
    public void lulus(){
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override 
    public void meraihIPKTertinggi(){
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override 
    public void menjuaraiKompetisi(){
        System.out.println("Saya telah menjuarai kompetisi NATIONAL");
    }

    @Override 
    public void membuatPublikasiIlmiah(){
        System.out.println("Saya menerbitkan artikel di jurnal NATIONAL");
    }
}
