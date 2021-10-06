package se.oskar;

import java.util.Scanner;

public class Lab4 {
    public void Run(){
        Scanner lab4 = new Scanner(System.in);
        
        System.out.println("Hur varmt är det?");
        double fahrenheit = lab4.nextDouble();
        lab4.close();

        double celsius = ((fahrenheit -32)*5)/9;

        System.out.println("I celsius är det: " + celsius);



        
    }
    
}
