package reversenames;

import java.util.Scanner;
import java.util.*;

public class ReverseNames {

    public static void main(String[] args) {
        System.out.print("Reverse Name by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = computerKeyboardInput.next();
        String name = firstName;
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println("");
        String str = name;
        //Split sentence into words
        String words[] = str.split("\\s");
        String newString = "";
        for (String w : words) {
            String first = w.substring(0, 1);      //First Letter
            String rest = w.substring(1);         //Rest of the letters
            //Concatenete and reassign after
            //converting the first letter to uppercase
            newString += first.toUpperCase() + rest + " ";
        }
        //trim to remove the last redundant blank space
        System.out.println(newString.trim());
        System.out.println("");
        //System.out.println(firstName + " "+ last);
        //System.out.println("");
    }
}
