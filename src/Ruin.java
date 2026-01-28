import java.util.Scanner;

public class Ruin {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        System.out.println("Enter the start amount.");
        int startAmount = in.nextInt();
        System.out.println("Enter your win chance.");
        double winChance = in.nextDouble();
        System.out.println("Enter your win limit.");
        int winLimit = in.nextInt();
        System.out.println("Enter how many days you want to play.");
        double totalSimulations = in.nextDouble();
        int ruinTime = 0;

    for (int i=1; i<=totalSimulations; i++) {
        int totalRounds = 0; 
        int amount = startAmount;
        while (amount < winLimit && amount > 0) {
            totalRounds ++; 
            double random_probability = (Math.random()); 
            if (random_probability <= winChance) {
                amount++; 
                if (amount == winLimit) {
                    System.out.println("Simulation " + i + ": " + totalRounds +  " WIN"); 
                }
            }
            else {
                amount--; 
                if (amount == 0) {
                    ruinTime++;
                    System.out.println("Simulation " + i + ": " + totalRounds +  " LOSE");
                }
            }
        }

    }
    System.out.println (ruinTime/totalSimulations);
    }



}
