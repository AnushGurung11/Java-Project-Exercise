package Class4;

public class Teachers extends  Person{
    private String subject;

    //setter and getter methods
    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getSubject(){
        return this.subject;
    }

    //Creating a constructor
    public Teachers(String name , String subject ){
        super(name);
        this.subject = subject;
    }



//    Creating an entry point for the program
    //Creating main method

    public static void main (String[] args){

        //Creating an object of Student and teacher

        //Student object
        Students st = new Students("Anush", "A");
        Teachers tch = new Teachers("Rythm", "A");

        st.introduction();
        tch.introduction();

    }
}
