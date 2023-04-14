
public class GuessingGame {
    public static void main(String[] args) {
        //the range of my guessing
        int minNumber =1;int maxNumber = 100;
        //guessing opportunities
        int guessingOpportunities = 4;
        //creating my object
        GuessingGameService numberGameService = new GuessingGameService();
        //creating my number to guess
        int numberToGuess = numberGameService.generateRandomNumber(minNumber,maxNumber+1);
        //guessing the number
        numberGameService.startGuessingGame(minNumber,maxNumber,guessingOpportunities,numberToGuess);
    }
}
