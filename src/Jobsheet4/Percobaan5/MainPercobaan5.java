package Jobsheet4.Percobaan5;

public class MainPercobaan5 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Avanza");
        Mesin mesin1 = new Mesin();
        mobil.setMesin(mesin1);
        mobil.tampilInfo();
    }
}
