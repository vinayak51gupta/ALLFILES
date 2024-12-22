import java.util.Scanner;

public class HangmanGame {
    private static final String[] WORDS = {"JAVA", "PYTHON", "COMPUTER", "PROGRAMMING", "DEVELOPMENT"};
    private static final int MAX_TRIES = 6;

    private String wordToGuess;
    private StringBuilder currentGuess;
    private int attemptsLeft;

    public HangmanGame() {
        wordToGuess = WORDS[(int) (Math.random() * WORDS.length)];
        currentGuess = new StringBuilder("_".repeat(wordToGuess.length()));
        attemptsLeft = MAX_TRIES;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hangman!");
        while (attemptsLeft > 0 && currentGuess.indexOf("_") != -1) {
            System.out.println("\nCurrent Guess: " + currentGuess);
            System.out.println("Attempts Left: " + attemptsLeft);
            System.out.print("Enter a letter: ");
            char guess = scanner.next().toUpperCase().charAt(0);
            if (!updateGuess(guess)) {
                attemptsLeft--;
            }
        }
        scanner.close();
        if (attemptsLeft == 0) {
            System.out.println("\nYou lose! The word was: " + wordToGuess);
        } else {
            System.out.println("\nCongratulations! You guessed the word: " + wordToGuess);
        }
    }

    private boolean updateGuess(char guess) {
        boolean found = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                currentGuess.setCharAt(i, guess);
                found = true;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        game.play();
    }
}