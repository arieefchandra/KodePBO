package Jobsheet3.Tugas;

public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private int kapasitasMuatan;
    private int beratMuatan;

    public Kontainer(String nomorResi, String namaPemilik, int kapasitasMuatan) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMuatan = kapasitasMuatan;
        this.beratMuatan = 0;
    }

    public String getNomorResi() {
        return nomorResi;
    }

    public void setNomorResi(String nomorResi) {
        this.nomorResi = nomorResi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public int getKapasitasMaksimal() {
        return kapasitasMuatan;
    }

    public void setKapasitasMuatan(int kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public int getBeratMuatanSaatIni() {
        return beratMuatan;
    }

    public void tambahMuatan(int berat) {
        if (beratMuatan + berat <= kapasitasMuatan) {
            beratMuatan += berat;
        }
    }

    public void turunkanMuatan(int berat) {
        if (berat <= beratMuatan * 0.5) {
            beratMuatan -= berat;
        } else {
            System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
        }
    }
}
