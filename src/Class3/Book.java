package Class3;
/*
1. Create a Book class with attributes title, author, price
    Don't allow changing an objects attribute directly like bookObject.title = "Change”, instead create a method to change price only
    Constructor to initially pass data for object
2. Create a static methods on Day2 class for all the following solutions
    a. FindGrade(int number) -> For a given number between 0-100 print grade for the provided number

 */

public class Book {

    // Class Attributes
    private  String title;
    private  String author;
    private double price;

    //Creating getter and setter methods
    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public double getPrice(){
        return this.price;
    }


    //Creating a methods for changing the price
    public void changePrice(double price){
        this.price = price;
    }

    //Creating a constructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }

    public Book(String author){
        this.author = author;
    }


}
