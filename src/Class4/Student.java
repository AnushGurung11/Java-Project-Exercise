package Class4;

public class Student {
//
//    Create a Student class with private fields: name and age.
//    Provide getter and setter methods to access or modify them.
//
//
//    Ensure age cannot be set below 1 using validation in the setter.
//    Demonstrate how to create and update a student’s information safely using encapsulation.

    private String name ;
    private int age ;

    public void setName(String name){
        this.name = name ;
    }

    public String getName (){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge (){
        return this.age;
    }

}
