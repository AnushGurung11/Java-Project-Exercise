package Class4;

public class Person {
    private String name ;

    //getter and setter methods

    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return this.name;
    }

    //Creating The methods called introduction
    public void introduction(){
        System.out.println("My name is "+getName());
    }

    //Creating an constructor
    public Person (String name){
        this.name = name ;
    }
}
