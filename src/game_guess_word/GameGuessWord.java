package game_guess_word;

import java.util.Arrays;
import java.util.Scanner;

// Task read the code
// Make improvements
// Re-write code according to your taste
// Add feature to check whether the letter has already been entered
// To avoid double-checking
// Add check whether you have entered one hidden word or a few words
// if one word OK if not mistake re-enter

public class GameGuessWord {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame()
    {
        while(true){
            showMessages();

            String hiddenWord;

            while (true){
                System.out.print("\u001B[35m" + "Please enter valid hidden word to guess: ");
                hiddenWord = getInput().nextLine();
                if (isEmpty(hiddenWord)){
                    System.out.println("\u001B[31m"+ "You have entered nothing.");
                } else break;
            }

            char[] hiddenWordArrayOriginal = hiddenWord.toCharArray();
            char[] hiddenWordArrayWorking = new char[hiddenWordArrayOriginal.length];
            hiddenWordArrayWorking = setHiddenArrayValue(hiddenWordArrayWorking, '*');

            char letter;
            String word;
            String temp;
            int lettersCounter = 0;

            while (true) {
                System.out.print("\u001B[35m" + "Please enter a letter or a whole word to finalize: ");
                temp = getInput().nextLine();

                if (temp.isEmpty()) {
                    System.out.println("\u001B[31m" + "You have entered nothing. Wrong value. Re-enter.");
                    continue;
                } else if (temp.length() == 1) {
                    letter = temp.charAt(0);

                    if ((checkLetter(hiddenWordArrayOriginal, letter))) {
                        lettersCounter += reflectElements(hiddenWordArrayOriginal, hiddenWordArrayWorking, letter);
                        System.out.println("\u001B[33m" + "There is such letter: " + letter);
                        drawArray(hiddenWordArrayWorking);

                        if (lettersCounter == hiddenWordArrayOriginal.length) {
                            getVictoriousMessage(hiddenWord);
                            break;
                        }
                    } else {
                        System.out.println("\u001B[33m" + "There is not such letter: " + letter + " in the word.");
                    }
                    continue;
                } else {
                    word = temp;
                    if (checkWord(hiddenWordArrayOriginal, word)) {
                        getVictoriousMessage(hiddenWord);
                    }
                }
                break;
            }
            System.out.print("\u001B[36m" + "\nWould you like to repeat?! y/n: ");

            if (!getInput().nextLine().equals("y")) {
                System.out.println("\nYou opted to leave! GOODBYE!");
                return;
            } else {
                System.out.println("\n\n*********************NEW GAME*****************************");
            }
        }
    }

    public static void getVictoriousMessage(String hiddenWord){
        System.out.println("\n\u001B[37m" + "\u001B[21m" +
                            "You have guessed the word: " + hiddenWord + ". CONGRATULATIONS!" + "\u001B[24m");
    }

    public static void showMessages() {
        // Initial message
        System.out.println("\u001B[34m" + "Welcome to Guess Word Game by TeachMeSkills.");
        System.out.println("Here are instructions: ");
        System.out.println("You must set the word and ask the user to guess it.");
        System.out.println("The word must be without spaces, like \"apple\", \"car\".");
        System.out.println("The user must try to guess the letter or the whole word.");
        System.out.println("Let's go...");
        System.out.println("-----------------------------------------------------------------");
    }

    public static int reflectElements(char[] hiddenWordArrayOriginal, char[] hiddenWordArrayWorking, char letter){
        int counter = 0;

        for (int index = 0; index < hiddenWordArrayOriginal.length; index++){
            if (hiddenWordArrayOriginal[index] == letter) {
                if (hiddenWordArrayWorking[index] == '*') {
                    hiddenWordArrayWorking[index] = hiddenWordArrayOriginal[index];
                    counter++;
                }
            }
        }
        return counter;
    }

    public static boolean checkLetter(char[] hiddenWordArrayOriginal, char letter){
        for (char el : hiddenWordArrayOriginal) {
            if (el == letter) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkWord(char[] hiddenWordArrayOriginal, String word){
        if (hiddenWordArrayOriginal.length == word.length()){
            return new String(hiddenWordArrayOriginal).equals(word);
        }
        return false;
    }

    public static char[] setHiddenArrayValue(char[] hiddenWordArrayWorking, char symbol){
        Arrays.fill(hiddenWordArrayWorking, symbol);
        return hiddenWordArrayWorking;
    }

    public static Scanner getInput(){
        return new Scanner(System.in);
    }

    public static void drawArray(char[] hiddenWordArray){
        System.out.print("Hidden word: ");
        for (char letter : hiddenWordArray){
            System.out.print("[" + letter + "]");
        }
        System.out.println();
    }

    public static boolean isEmpty(String word){
        return word.isEmpty();
    }
}