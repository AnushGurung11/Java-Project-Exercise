package Class3;
/*
a. id, name, grade(number)
	b. Constructor (don't initialize value for grade)
	c. Using the reference of Student object, only allow name to be directly changed (id, and grade should not be allowed to change directly)
	d. Provide
a method to change grade, and
get grade (while getting grade don't return number, use condition to return A+, A, B+, B..... ) (encapsulation example)

 */

public class Students {
    //instance variables
    private final int id ;
    public String name;
    private int grade;

    public int getId() {
        return id;
    }

    public String getGrade() {

        if(this.grade<0){
            return "Invalid";
        }else{
            if(this.grade>70 && this.grade <= 100){
                return "A";
            } else if(this.grade<70 && this.grade > 50){
                return "B";
            } else if(this.grade<50 && this.grade >40) {
                return "C";
            }else{
                return "F";
            }
        }




     }
        public String getName() {
        return name;
    }

    //method to change the grades of the student
    public void changeGrade(int grade){
        this.grade = grade;
    }

    public Students(int id , String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getMarks(){
        return this.grade;
    }


}
