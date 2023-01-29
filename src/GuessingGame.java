
public class GuessingGame {
    public static void main(String[] args) {
        //the range of my guessing
        int minNumber =1;int maxNumber = 100;
        //guessing opportunities
        int guessingOpportunities = 4;
        //creating my object
        GuessingGameData number = new GuessingGameData();
        //creating my number to guess
        int numberToGuess = number.generateRandomNumber(minNumber,maxNumber);
        //guessing the number
        number.guessingNumber(minNumber,maxNumber,number,guessingOpportunities,numberToGuess);
    }
}
