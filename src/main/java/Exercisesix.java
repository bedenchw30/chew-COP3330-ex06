import java.util.Date;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 beden chew
 */
public class Exercisesix {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your current age? ");
        String age = input.nextLine();

        System.out.print("At what age would you like to retire? ");
        String retire = input.nextLine();

        int convertedAge= Integer.parseInt(age); //converted the user's string input from age and retire age to an int.
        int convertedRetire= Integer.parseInt(retire);

        int yrsLeft = convertedRetire - convertedAge;
        Date d = new Date();
        int year =d.getYear();
        int currentYear= year + 1900;
        int retiredYear= currentYear + yrsLeft; //the current year + the years left until you retire to find the year you will retire.

        System.out.println("You have "+ yrsLeft + " years left until you can retire.");
        System.out.println("It's " +currentYear + ", so you can retire in " + retiredYear +".");



    }
}
