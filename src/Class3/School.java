package Class3;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
. Create a School class with main method only to make objects and operations for Student only.
	a. Create 5 objects of Student and put them in the arraylist.
	b. Find the class topper. (Based on returned grade from 4. d ) (Based on A+, A, B+, B,.... and if more than one have the same highest grade they will be the topper)
	c. Find the average grade of the students altogether(stored in the arraylist from a.). (Average the A+, A, B+, B,...)

 */
public class School {
    public static void main(String[] args){

        //Creating an array list for Storing the students Objets
        ArrayList <Students> students = new ArrayList<>();

        //TODO creating 5 Students objects
        //TODO Storing the students objects in the array list
        Students student1 = new Students(1,"Anush",80);
        Students student2 = new Students(2,"Rythm",90);
        Students student3 = new Students(3,"abab",30);
        Students student4 = new Students(4,"cdcd",10);
        Students student5 = new Students(5,"efefe",50);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        //Storing the objets of students
        ArrayList<Students> topper =new ArrayList<>();

        //Looping through the array list
        for(Students each : students){
            String grade = each.getGrade();

            if(grade ==  "A"){
                topper.add(each);
            }else if (grade == "B"){
                topper.add(each);
            }else if (grade == "C"){
                topper.add(each);
            }

        }

        System.out.println("The toppers of the class are: ");
        for (Students each : topper){
            System.out.println(each.getName());
        }

        //TODO Getting the avg marks of the class

        int counter = 0;
        double marks =0;

        for(Students each : students){
            marks+= each.getMarks();
            counter++;
        }

        int avg = (int)(marks /counter);

            if(avg>70 && avg <= 100){
                System.out.println("The average grade of the class is A");
            } else if(avg<70 && avg> 50){
                System.out.println("The average grade of the class is B");
            } else if(avg<50 && avg>40) {
                System.out.println("The average grade of the class is C");
            }else{
                System.out.println("The average grade of the class is D");

            }

    }
}
