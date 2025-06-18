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

    //Creating a constructor for the Bike class

    public Bike(String name, int model , double enginNumber, String manufacturedDate, String color){
        this.name = name;
        this.model = model;
        this.enginNumber = enginNumber;
        this.manufacturedDate = manufacturedDate;
        this.color = color;

        System.out.println("An Object created");
    }

    //Creating a main method for running the program
    public static void main(String[] args){
        Bike bike1 = new Bike("NS 200",1211,121122,"2025","White");
        System.out.println(bike1.name);

    }


}
