package Jobsheet12.Tugas;

public class Barrier implements Destroyeble {
    private int strength;

    public Barrier(int strength){
        this.strength = strength;
    }

    public void setStrength (int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= strength * 10 / 100;
    }

    public String getBarrierInfo() {
        return "\nBarrier Strength: " + strength;
    }
}
