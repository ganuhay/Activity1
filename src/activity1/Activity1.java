
package activity1;

import java.util.Scanner;


public class Activity1 {

   
    public static void main(String[] args) {
        Scanner nvm = new Scanner (System.in);
        
        System.out.println("Enter Your Last Name");
        String lname = nvm.nextLine();
        
        System.out.println("Enter Your First Name");
        String fname = nvm.nextLine();
        
        System.out.println("Enter Your Middle Name");
        String mname = nvm.nextLine();
        
        System.out.println("Enter Your Age");
        String age = nvm.nextLine();
        
        System.out.println("Enter Your Gender");
        String gender = nvm.nextLine();
        
        System.out.println("Enter Your Birthdate");
        String birthdate = nvm.nextLine();
        
        System.out.println("YOUR DATA");
        System.out.println("Last Name:" + " " + lname);
        System.out.println("First Name:" + " " + fname);
        System.out.println("Middle Name:" + " " + mname);
        System.out.println("Age:" + " " + age);
        System.out.println("Gender:" + " " + gender);
        System.out.println("Birthdate:" + " " + birthdate);
        
        
    }
    
}
