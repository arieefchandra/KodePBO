package Jobsheet9.InterfaceClass;

public class PascaSarjana extends Mahasiswa implements Icomlaude {
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
}
