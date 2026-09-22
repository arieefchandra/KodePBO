package Jobsheet4.Tugas;

public class Alamat {
    private String jalan;
    private String kota;

    public Alamat(String jalan, String kota) {
        this.jalan = jalan;
        this.kota = kota;
    }

    public void tampilAlamat() {
        System.out.println("Alamat: " + jalan + ", " + kota);
    }
}

