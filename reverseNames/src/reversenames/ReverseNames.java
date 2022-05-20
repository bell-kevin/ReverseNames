package reversenames;

import java.util.Scanner;

public class ReverseNames {

    public static void main(String[] args) {
        String firstName, lastName, reversedFirstname = "", reversedLastName="";
        System.out.print("Reverse Name by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.print("What is your name? ");
        firstName = computerKeyboardInput.next();
        lastName = computerKeyboardInput.next();
        for (int i = firstName.length() - 1; i >= 0; i--) {
            reversedFirstname = reversedFirstname + firstName.charAt(i);
        }
        System.out.print(reversedFirstname + " ");
        for (int i = lastName.length() - 1; i >= 0; i--) {
            reversedLastName = reversedLastName + lastName.charAt(i);
        }
        System.out.println(reversedLastName);
    }
}
