package com.company;
import java.math.*;    import java.util.*;    import java.lang.*;

public class CreatePassword {
    public static void main(String[] args) {

        //userInput                                                            //responseStorage
        Scanner sc = new Scanner(System.in);                                     int yes = 1;
        int pass;
        System.out.println("Do you want to generate a password? (1 = yes/2 = no)");     int no = 0;    int both = 5;
        int response = sc.nextInt();                                            int num = 3;    int word = 4;
        StringBuilder sb;                                                     String alpha = "abcdefghijklmnopqrstuvwxyz";
        String alphaUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";                     String symbols = "!@#$%^&*()-_=+[]{}|;:',.<>?/~";
        String all = alphaUpper + alpha + symbols;                            String numberm = "0123456789";
        String all2 = alphaUpper + alpha + symbols + numberm;                 Random rd = new Random();
        char[] re = all2.toCharArray();

        if (response == yes) {
            System.out.println("All Done but,Do you want a num pass or word pass or both?");
            System.out.println("(3) for num , (4) for word , (5) for both");

            pass = sc.nextInt();
            if (pass == num) {
                System.out.print("Okay! Please enter Max length of pass you want: ");
                int Max = sc.nextInt();

                System.out.print("Please enter Min length of pass you want: ");
                int Min = sc.nextInt();

                if (Min > Max || Min <= 0) {
                    System.out.println("Invalid input.Too tired,to explain more");
                } else {
                    BigInteger ToStore = BigInteger.ONE;
                    boolean IsValid = false;

                    for (int i = 1; ; i++) {
                        ToStore = ToStore.multiply(BigInteger.valueOf(i));
                        long size = ToStore.toString().length();

                        try {
                            if (!IsValid && size >= Min) {
                                System.out.println("\nThe Generated Password of " + Min + " digit is :");
                                System.out.println(ToStore);
                                IsValid = true;
                            } else if (size >= Max) {
                                System.out.println("\nThe Generated Password of " + Max + " digit is :");
                                System.out.println(ToStore);
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println("Error Occurred" + e.getMessage());
                        }
                    }
                }

            } else if (pass == word) {
                sb = new StringBuilder();

                System.out.print("Okay! Please enter Max length of pass you want: ");
                int Max = sc.nextInt();

                System.out.print("Please enter Min length of pass you want: ");
                int Min = sc.nextInt();

                if (Min > Max || Min <= 0) {
                    System.out.println("Invalid input.Too tired,to explain more");
                } else {
                    int air = Min + rd.nextInt(Max - Min + 1);
                    for (int p = 0; p < air; p++) {
                        char ch1 = all.charAt(rd.nextInt(all.length()));
                        sb.append(ch1);
                    }

                    System.out.println(" ");
                    String rest = sb.toString();

                    if (rest.length() <= Min) {
                        System.out.println("\nThe Generated Password of " + Min + " digit is :");
                        System.out.println(rest);

                    }
                    if (rest.length() <= Max) {
                        System.out.println("\nThe Generated Password of " + Max + " digit is :");
                        System.out.println(rest);
                    }
                }
            } else if (pass == both) {
                sb = new StringBuilder();

                System.out.print("Okay! Please enter Max length of pass you want: ");
                int Max = sc.nextInt();

                System.out.print("Please enter Min length of pass you want: ");
                int Min = sc.nextInt();

                if (Min > Max || Min <= 0) {
                    System.out.println("Invalid input.Too tired,to explain more");
                } else {
                   
                    for (int p = 0; p < Min; p++) {
                        char ch1 = re[rd.nextInt(re.length)];
                        sb.append(ch1);
                    }String stored1 = sb.toString();
                        System.out.println("\nThe Generated Password of " + Min + " digit is :");
                        System.out.println(stored1);

                    for (int p = 0; p < Max; p++) {
                        char ch1 = re[rd.nextInt(re.length)];
                        sb.append(ch1);
                    }
                    String rest = sb.toString();
                        System.out.println("\nThe Generated Password of " + Max + " digit is :");
                        System.out.println(rest);

                }
            } else if (response == no) {
                System.out.println("\nThank you! Please,Never Visit Again.");
            } else {
                System.out.println("\nInvalid Input. Please Enter yes or no.(Case Sensitive)");
            }
        }
    }
}
