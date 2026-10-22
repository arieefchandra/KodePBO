package Jobsheet9.InterfaceClass;

public class Main {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

       // Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaComloude = new Sarjana("Dini");
        PascaSarjana masterComlaude = new PascaSarjana("Elok");

        //sarjanaComloude.kuliahDiKampus();

        //pakRektor.beriSertifikatComlaude(mhsBiasa);
        //pakRektor.beriSertifikatComlaude(sarjanaComloude);
       // pakRektor.beriSertifikatComlaude(masterComlaude);
        pakRektor.beriSertifikatMawapres(masterComlaude);
        pakRektor.beriSertifikatMawapres(sarjanaComloude);
        
    }
}
