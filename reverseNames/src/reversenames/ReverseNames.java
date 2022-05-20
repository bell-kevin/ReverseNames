package reversenames;

import java.util.Scanner;
import java.util.*;

public class ReverseNames {

    public static void main(String[] args) {
        System.out.print("Reverse Name by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = computerKeyboardInput.next();
        String firstName, lastName, reverseName;
        StringBuffer rev = new StringBuffer(name);
        rev.reverse();
        System.out.print("Your name in reverse is: " + rev + "\n");
    }
}
