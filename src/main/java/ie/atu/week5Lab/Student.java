package ie.atu.week5Lab;
import  java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        //Create first instance of student name
        System.out.println("Please enter Student Name");
        Scanner input = new Scanner(System.in);         //create scanner
        String name = input.nextLine();                 //read user input

        System.out.println("You entered : " + name);
    }

}
