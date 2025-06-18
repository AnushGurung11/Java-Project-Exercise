package Class2;

public class Bike {

    //Creating attributes of a bike

    public String name;
    public int model;
    public double enginNumber;
    public String manufacturedDate;
    public String color;

    //Behaviours of Bike
    //break , accelerate, turn on side light

    public void pressBreak(){
        System.out.println("Stopped");
    }

    public void releaseBreak(){
        System.out.println("Moving");
    }

    public void pressAccelerate(){
        System.out.println("Speeding");
    }
    public void releaseAccelerate(){
        System.out.println("Not Speeding");
    }

    public void turnOnSidelight(){
        System.out.println("Side lights On");
    }
    public void turnOffSideLight(){
        System.out.println("Side lights Off");
    }


}
