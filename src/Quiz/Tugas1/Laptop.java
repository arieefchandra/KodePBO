
package Quiz.Tugas1;

public class Laptop {
    private String kodeAset;
    private String merk;
    private int ramGb;
    private boolean tersedia;

    public Laptop(String kodeAset, String merk, int ramGB) {
        if (kodeAset == null || !kodeAset.startsWith("LP-")) {
            throw new IllegalArgumentException("Kode aset harus diawali LP-");
        }

        if (merk == null || merk.isBlank()) {
            throw new IllegalArgumentException("Merk tidak boleh kosong");
        }

        if (!ramValid(ramGB)) {
            throw new IllegalArgumentException("RAM harus 4, 8, 16, atau 32 GB");
        }

        this.kodeAset = kodeAset;
        this.merk = merk;
        this.ramGb = ramGB;
        this.tersedia = true;
    }

    private static boolean ramValid(int ram) {
        return ram == 4 || ram == 8 || ram == 16 || ram == 32;
    }

    public String getKodeAset() {
        return kodeAset;
    }

    public String getMerk() {
        return merk;
    }

    public int getRamGB() {
        return ramGb;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void upgradeRam(int ramBaru) {
        if (!tersedia) {
            throw new IllegalStateException("RAM tidak dapat di-upgrade saat laptop dipinjam");
        }

        if (!ramValid(ramBaru) || ramBaru <= ramGb) {
            throw new IllegalArgumentException("RAM baru harus valid dan lebih besar dari RAM sekarang");
        }

        this.ramGb = ramBaru;
    }

    public boolean pinjam() {
        if (!tersedia) {
            return false;
        }

        tersedia = false;
        return true;
    }

    public void kembalikan() {
        if (tersedia) {
            throw new IllegalStateException("Laptop sedang tidak dipinjam" );
        }
        tersedia = true;
    }

    public String info() {
        String status = tersedia ? "tersedia" : "dipinjam";
        return kodeAset + " | " + merk + " | "
                + ramGb + " GB | " + status;
    }
}