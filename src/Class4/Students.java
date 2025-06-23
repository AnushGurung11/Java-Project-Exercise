package Class4;


public class Students extends Person{
    private String grade ;

    //Setter and getter methods
    public void setGrade(String grade){
        this.grade = grade;
    }

    public String getGrade(){
        return this.grade;
    }

    //Creating a constructor
    public Students(String name , String grade){
        super(name);
        this.grade = grade;
    }

}
