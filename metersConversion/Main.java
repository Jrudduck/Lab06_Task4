import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        double meters = 0;
        double miles;
        double feet;
        double inches;
        double metersToMiles = 0.00062137;
        double metersToFeet = 3.28084;
        double metersToInches = 39.37008;
        boolean metersValid = false;


        //input
        System.out.println("Enter the length in meters.");
        do {
            if (scan.hasNextDouble()) {
                meters = scan.nextDouble();
                if (meters > 0) {
                    metersValid = true;
                    scan.nextLine();
                } else {
                    System.out.println("You have inputted an invalid value. Please try again.");
                    scan.nextLine();
                }
            } else {
                System.out.println("Please enter a valid length in meters.");
                scan.nextLine();
            }
        } while (!metersValid);


        //process
        miles = metersToMiles * meters;
        feet = metersToFeet * meters;
        inches = metersToInches * meters;

        System.out.printf("%5s %10.2f %5s %10.2f %5s %10.2f %5s %10.2f", "Meters:", meters, "\nMiles:", miles, "\nFeet:", feet, "\nInches:", inches);
    }
}