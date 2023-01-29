import java.util.Random;
import java.util.Scanner;

public class GuessingGameData {

    int generateRandomNumber(int minNumber, int maxNumber){
        //Generates the random number
        Random randomNumber = new Random();
        return randomNumber.nextInt(minNumber,maxNumber);
    }
    int giveMeYourNumber(){
        //Input the user number
        Scanner numberInput = new Scanner(System.in);
        String strNumber = numberInput.next();
        return Integer.parseInt(strNumber);
    }
    void guessingNumber(int minNumber,int maxNumber, GuessingGameData number,
                        int guessingOpportunities, int numberToGuess) {
        //Guessing the number
        System.out.println("Pick a number between " + minNumber + " and " + maxNumber);

        while (true) {
            //user number
            int userChoiceNumber = number.giveMeYourNumber();
            if (minNumber > userChoiceNumber || userChoiceNumber > maxNumber) {
                System.out.print("Your guess is not between " + minNumber + " and " + maxNumber + " .Please try again.");
            }
            else {
                if (guessingOpportunities == 0) {
                    System.out.println("You lose!, the number to guess was: " + numberToGuess);
                    break;
                } else if (userChoiceNumber == numberToGuess) {
                    System.out.print("You Win!!!");
                    break;
                } else if (userChoiceNumber < numberToGuess) {
                    System.out.print("Please pick a higher number");
                    guessingOpportunities--;
                } else if (userChoiceNumber > numberToGuess) {
                    System.out.print("Please pick a lower number.");
                    guessingOpportunities--;
                }
            }
        }
    }
}
