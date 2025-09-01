package com.company;
import java.math.*;    
import java.util.*;    
import java.lang.*;

public class CreatePassword {
    public static void main(String[] args) {

        // User input + basic flags
        Scanner sc = new Scanner(System.in); 
        int yes = 1;                   // option for yes
        int no = 0;                    // option for no
        int both = 5;                  // option for both num+word password
        int num = 3;                   // option for numeric password
        int word = 4;                  // option for word/symbol password

        int pass;                      // store user choice for password type
        System.out.println("Do you want to generate a password? (1 = yes/2 = no)"); 
        int response = sc.nextInt();   // store yes/no response

        // StringBuilder for password creation
        StringBuilder sb;   
        
        // Character sets
        String alpha = "abcdefghijklmnopqrstuvwxyz";            // lowercase letters
        String alphaUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";        // uppercase letters
        String symbols = "!@#$%^&*()-_=+[]{}|;:',.<>?/`~";       // special characters
        String numberm = "0123456789";                           // digits
        String all = alphaUpper + alpha + symbols;               // letters + symbols
        String all2 = alphaUpper + alpha + symbols + numberm;    // letters + symbols + digits
        Random rd = new Random();                                // random generator
        char[] re = all2.toCharArray();                          // full charset as array

        // If user chose "yes".
        if (response == yes) {
            System.out.println("All Done but,Do you want a num pass or word pass or both?");
            System.out.println("(3) for num , (4) for word , (5) for both");

            pass = sc.nextInt();

            // NUMERIC password generation using factorial size.
            if (pass == num) {
                System.out.print("Okay! Please enter Max length of pass you want: ");
                int Max = sc.nextInt();

                if (Max <= 0) {
                    System.out.println("Invalid input.Too tired,to explain more");
                } else {
                    BigInteger ToStore = BigInteger.ONE;  // store factorial values
                    boolean IsValid = false;

                    for (int i = 1; ; i++) {
                        ToStore = ToStore.multiply(BigInteger.valueOf(i)); // calculate factorial
                        int size = ToStore.toString().length();            // length of number

                        // Once we hit/exceed Max, print password and stop
                        if (!IsValid && size >= Max) {
                            System.out.println("\nThe Generated Password of " + Max + " digit is :");
                            System.out.println(ToStore);
                            break;
                        }
                    }
                }

            // WORD/SYMBOL password generation
            } else if (pass == word) {
                sb = new StringBuilder();

                System.out.print("Okay! Please enter Max length of pass you want: ");
                int Max = sc.nextInt();

                if (Max <= 0) {
                    System.out.println("Invalid input.Too tired,to explain more");
                } else {
                    // Append random chars from all (letters+symbols)
                    for (int p = 0; p < Max; p++) {
                        char ch1 = all.charAt(rd.nextInt(all.length()));
                        sb.append(ch1);
                    }

                    System.out.println(" ");
                    String rest = sb.toString();

                    if (rest.length() <= Max) {
                        System.out.println("\nThe Generated Password of " + Max + " digit is :");
                        System.out.println(rest);
                    }
                }

            // BOTH (letters + symbols + numbers)
            } else if (pass == both) {
                sb = new StringBuilder();

                System.out.print("Okay! Please enter Max length of pass you want: ");
                int Max = sc.nextInt();

                if (Max <= 0) {
                    System.out.println("Invalid input.Too tired,to explain more");
                } else {
                    // Append random chars from full charset
                    for (int p = 0; p < Max; p++) {
                        char ch1 = re[rd.nextInt(re.length)];
                        sb.append(ch1);
                    }
                    String rest = sb.toString();
                    System.out.println("\nThe Generated Password of " + Max + " digit is :");
                    System.out.println(rest);
                }

            // If user chose "no"
            } else if (response == no) {
                System.out.println("\nThank you! Please,Never Visit Again.");

            // Invalid input
            } else {
                System.out.println("\nInvalid Input. Please Enter yes or no.(Case Sensitive)");
            }
        }
    }
}
