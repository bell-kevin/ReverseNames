package reversenames;

import java.util.Scanner;

public class ReverseNames {

    public static void main(String[] args) {
        System.out.print("Reverse Name by Kevin Bell \n");
        String firstName, lastName, reversedFirstname = "", reversedLastName = ""; //variables
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.print("What is your name? "); //prompt user input
        firstName = computerKeyboardInput.next().toLowerCase(); //user input lower-cased
        lastName = computerKeyboardInput.next().toLowerCase(); //user input lower-cased
        for (int i = firstName.length() - 1; i >= 0; i--) {
            reversedFirstname = reversedFirstname + firstName.charAt(i);
            if (reversedFirstname.length() == 1) {
                reversedFirstname = reversedFirstname.toUpperCase();
            }
        }
        reversedFirstname = reversedFirstname.substring(0, 1).toUpperCase() + reversedFirstname.substring(1);
        System.out.print(reversedFirstname + " ");
        for (int i = lastName.length() - 1; i >= 0; i--) {
            reversedLastName = reversedLastName + lastName.charAt(i);
        }
        reversedLastName = reversedLastName.substring(0, 1).toUpperCase() + reversedLastName.substring(1);
        System.out.println(reversedLastName); //output
    } //end main
} //end class
