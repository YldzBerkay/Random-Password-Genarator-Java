/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randompasswordgenarator;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenarator {

    public static String upGenarator(boolean up) {
        String capitalCaseLetters;
        if (up == true) {
            return capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        } else {
            return capitalCaseLetters = "";
        }
    }

    public static String lowGenarator(boolean low) {
        String lowerCaseLetters;
        if (low == true) {
            return lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        } else {
            return lowerCaseLetters = "";
        }
    }

    public static String syGenarator(boolean sy) {
        String specialCharacters;
        if (sy == true) {
            return specialCharacters = "!@#$/*#^<>+-&=?:.,;`'£[]{}()";
        } else {
            return specialCharacters = "";
        }
    }

    public static String numGenarator(boolean num) {
        String numbers;
        if (num == true) {
            return numbers = "0123456789";
        } else {
            return numbers = "";
        }
    }

    public static void genarator(int length, boolean sy, boolean num, boolean low, boolean up) {

        if (sy == false && num == false && low == false && up == false) {
            System.out.println("You must answer at least 1 of them true.");
        } else {
            Random random = new Random();
            String combinedChars = upGenarator(up) + lowGenarator(low) + syGenarator(sy) + numGenarator(num);
            char[] password = new char[length];

            for (int i = 0; i < length; i++) {
                password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
            }
            System.out.print("Your Password:");
            System.out.println(password);
        }

    }

    public static void main(String[] args) {
        System.out.println("Password Length: ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        System.out.println("Answer as 'True' and 'False'");
        System.out.println("Include Symbols: ");
        boolean sy = scan.nextBoolean();
        System.out.println("Include Numbers: ");
        boolean num = scan.nextBoolean();
        System.out.println("Include Lowercase Characters: ");
        boolean low = scan.nextBoolean();
        System.out.println("Include Uppercase Characters: ");
        boolean up = scan.nextBoolean();
        genarator(length, sy, num, low, up);

    }

}
