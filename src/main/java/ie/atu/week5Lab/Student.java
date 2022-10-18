package ie.atu.week5Lab;
import  java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        //Created first instance of student name
        System.out.println("Please enter Student Name: ");
        Scanner input = new Scanner(System.in);         //create scanner
        String name = input.nextLine();                 //read user input
        StudentClass studentDetails = new StudentClass();
        studentDetails.setName(name);
        System.out.println("Name entered : " + studentDetails.getName());

        //Created first instance of student email
        System.out.println("Please enter Student Email: ");
        String email = input.nextLine();
        studentDetails.setEmail(email);
        System.out.println("Email entered : " + studentDetails.getEmail());

        //Created first instance of student course
        System.out.println("Please enter Student Course: ");
        String course = input.nextLine();
        studentDetails.setCourse(course);
        System.out.println("Course entered : " + studentDetails.getCourse());

            //Created second instance of student name
            StudentClass studentDetails2 = new StudentClass();
            System.out.println("Please enter 2nd Student Name: ");
            String name2 = input.nextLine();
            studentDetails2.setName(name2);
            System.out.println("Name Entered :" + studentDetails2.getName());

            //Created second instance of student email
            System.out.println("Please enter 2nd Student Email: ");
            String email2 = input.nextLine();
            studentDetails2.setEmail(email2);
            System.out.println("Email entered :" + studentDetails2.getEmail());

            //Created second instance of student course
            System.out.println("Please enter 2nd Student Course: ");
            String course2 = input.nextLine();
            studentDetails2.setCourse(course2);
            System.out.println("Course entered :" + studentDetails2.getCourse());

                //Created third instance of student name
                StudentClass studentDetails3 = new StudentClass();
                System.out.println("Please enter 3rd Student Name: ");
                String name3 = input.nextLine();
                studentDetails3.setName(name3);
                System.out.println("Name Entered :" + studentDetails3.getName());

                //Created third instance of student email
                System.out.println("Please enter 3rd Student Email: ");
                String email3 = input.nextLine();
                studentDetails3.setEmail(email3);
                System.out.println("Email entered :" + studentDetails3.getEmail());

                //Created third instance of student course
                System.out.println("Please enter 3rd Student Course: ");
                String course3 = input.nextLine();
                studentDetails3.setCourse(course3);
                System.out.println("Course entered :" + studentDetails3.getCourse());
    }

}
