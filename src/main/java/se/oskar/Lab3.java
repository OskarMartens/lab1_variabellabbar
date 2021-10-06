package se.oskar;

import java.util.Scanner;

public class Lab3 {
    public void Execute(){

        Scanner input = new Scanner(System.in);

        System.out.println("Skriv in ditt förnamn:");
        String firstName = input.nextLine();
        System.out.println("Skriv in ditt efternamn:");
        String lastName = input.nextLine();
        input.close();

        System.out.println(lastName + " " + firstName);
    }
    
}
