import java.util.Random;
import java.util.Scanner;

public class GuessingGameService {


    int generateRandomNumber(int minNumber, int maxNumber){
        //Generates the random number
        Random randomNumber = new Random();
        return randomNumber.nextInt(minNumber,maxNumber+1);
    }

    int giveMeYourNumber(){
        //Input the user number
        Scanner numberInput = new Scanner(System.in);
        String strNumber = numberInput.next();
        return Integer.parseInt(strNumber);
    }

    void startGuessingGame(int minNumber,int maxNumber,int guessingOpportunities, int numberToGuess) {

        while (true) {
            //Guessing the number
            System.out.println("Pick a number between " + minNumber + " and " + maxNumber);

            int userChoiceNumber = giveMeYourNumber();
            if (minNumber > userChoiceNumber || userChoiceNumber > maxNumber) {
                System.out.print("Your guess is not between " + minNumber + " and " + maxNumber + " .Please try again.");
            }

            else {
                if (userChoiceNumber == numberToGuess) {
                    System.out.print("You Win!!!");
                    break;
                }

                else if (guessingOpportunities == 0) {
                    System.out.println("You lose!, the number to guess was: " + numberToGuess);
                    break;
                }

                else if (userChoiceNumber < numberToGuess) {
                    System.out.print("Please pick a higher number");
                    guessingOpportunities--;
                }

                else if (userChoiceNumber > numberToGuess) {
                    System.out.print("Please pick a lower number.");
                    guessingOpportunities--;
                }
            }
        }
    }
}
