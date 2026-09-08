package Jobsheet1.Percobaan1;

public class RoadBike extends Bike{
    private int tireWidth;

    public void serTireWidth(int width){
        tireWidth = width;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Tire Width : " + tireWidth + " mm");
        System.out.println("Bike Type : Road Bike");
    }
}
