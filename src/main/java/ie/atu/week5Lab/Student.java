package ie.atu.week5Lab;
import  java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        //Create first instance of student email

        //Create first instance of student name
        System.out.println("Please enter Student Name: ");
        Scanner input = new Scanner(System.in);         //create scanner
        String name = input.nextLine();                 //read user input
        StudentClass studentDetails = new StudentClass();
        studentDetails.setName(name);
        System.out.println("Name entered : " + studentDetails.getName());

        //Create first instance of student email
        System.out.println("Please enter Student Email: ");
        String email = input.nextLine();
        studentDetails.setEmail(email);
        System.out.println("Email entered : " + studentDetails.getEmail());

        //Create first instance of student course
        System.out.println("Please enter Student Course: ");
        String course = input.nextLine();
        studentDetails.setCourse(course);
        System.out.println("Course entered : " + studentDetails.getCourse());
    }

}
