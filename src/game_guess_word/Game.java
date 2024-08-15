package game_guess_word;

// Поле Чудес
// У меня должно быть скрытое слово
// У меня должен быть пользователь, который будет отгадывать это слово
// Пользователь не может проиграть, он должен отгадать
// Отгадывание слова может быть двух типов:
// 1. по буквам
// 2. полностью слово

// если по буквам
// то, я должен получать сообщение о том, что буква есть или ее нет
// если буква есть, выводится сообщение и отражается открытая буква, дальше отгадываем слово
// если буква неверна, выводится сообщение, что такой буквы нет и продолжаем отгадывать

// если пользователь пытается отгадать слово
// то проверяется слово верное или нет
// если верное, то выводит сообщение, что мы отгадали слово и хотите ли вы играть заново или уйти
// если слово неверное, выводится сообщение и продолжаем игру

// если мы по буквам отгадали слово - то также выводится сообщение о победе и запрос, продолжить или выйти

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Guess the Word
        startGame();
    }

    public static void startGame(){
        getInitialMessage();

        String hiddenWord;

        while(true){
            System.out.print("\u001B[36m" + "Please enter a hidden word: ");

            // String array of chars, array has length
            if ((hiddenWord = getInput().nextLine()).isEmpty()){ // 0 -> empty
                System.out.println("\u001B[31m" + "Your string is EMPTY. You need to enter valid value.");
                continue;
            }
            break;
        }

        char[] hiddenWordOriginal = hiddenWord.toCharArray();
        char[] hiddenWordWorking = new char[hiddenWordOriginal.length];
        hiddenWordWorking = setArray(hiddenWordWorking, '*');

        drawArray(hiddenWordOriginal);
        drawArray(hiddenWordWorking);

        String temp;
        String word;
        char letter;

        while(true){
            System.out.print("Please enter a letter to guess the word or enter a whole word: ");
            temp = getInput().nextLine();

            if (temp.isEmpty()){
                System.out.println("\u001B[31m" + "You have entered nothing. It is EMPTY.");
                continue;
            } else if (temp.length() == 1){
                letter = temp.charAt(0); // String 'apple' char[] [a][p][p][l][e], temp.charAt(0)
                checkLetter(hiddenWordOriginal, hiddenWordWorking, letter);
                drawArray(hiddenWordWorking);
            } else {
                word = temp;
                // check
            }
            break;
        }
        System.out.println("Next");
    }

    public static void checkLetter(char[] hiddenWordOriginal, char[] hiddenWordWorking, char letter){
        for (int index = 0; index < hiddenWordOriginal.length; index++){
            if (hiddenWordOriginal[index] == letter){
                hiddenWordWorking[index] = letter;
            }
        }
    }

    public static void getInitialMessage(){
        System.out.println("\u001B[93m" + "Welcome to game Guess the Word by TeachMeSkills...");
        System.out.println("I will give you an instruction:");
        System.out.println("You must enter a hidden word and the user must guess it.");
        System.out.println("This can be done either by guessing letters or the whole word.");
        System.out.println("Let's go....");
        System.out.println("-------------------------------------------------------------------");
    }

    public static char[] setArray(char[] hiddenWordWorking, char symbol){
        char[] temp = new char[hiddenWordWorking.length];
        Arrays.fill(temp, symbol);
        return temp;
    }

    public static void drawArray(char[] hiddenWordOriginal){
        for (char letter : hiddenWordOriginal){
            System.out.print("[" + letter + "]");
        }
        System.out.println();
    }

    public static Scanner getInput(){
        return new Scanner(System.in);
    }
}
