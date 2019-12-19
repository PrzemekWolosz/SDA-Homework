package com.company.ZadaniaKlasyIMetody;

import java.util.Random;
import java.util.Scanner;

/*
Szyfrołamacz – użytkownik musi odgadnąć 4 cyfrowe hasło, ma 5 żyć, po podaniu hasła program informuje go czy
podany kod był większy lub mniejszy od hasła. Po utracie wszystkich żyć program kończy działanie
a. Po utracie wszystkich żyć program pyta użytkownika czy chce spróbować ponownie
b. Użytkownik może raz w ciągu gry poprosić o podpowiedź która odsłoni jedno z 4 cyfr tajnego hasła
 */
public class Zadanie6 {
    public static void main(String[] args) {
        welcome();
        playTheGame(getCode());
    }

    public static void welcome() {
        System.out.println("Welcome to the game \"CODE BREAKER\"! " +
                "\nGuess a four number code to win the game. \n" +
                "If You miss, You lose a life. You have got 5 lives. \n" +
                "Once a game You can ask for a hint and uncover one number \n" +
                "Good Luck! \n ### START ###");
    }

    public static int getCode() {
        int code = 5917;
        return code;
    }

    public static void playTheGame(int code) {
        int lives = 5;
        boolean win = false;
        boolean hint = false;

        Scanner scanner = new Scanner(System.in);

        do {
            if (hint) {
                System.out.println("Enter a code:");
            } else {
                System.out.println("Enter -1 to get a hint or enter a code: ");
            }
            int number = scanner.nextInt();

            if (!hint && number == -1) {
                hint = true;
                printHint();
            } else {
                if (isCorrect(number)) {
                    System.out.println("Correct code, You win!");
                    win = true;
                } else {
                    System.out.println("Incorrect code, try again");
                    printLowerHigher(number);
                    lives--;
                }
            }
        } while (!win && lives > 0);
        if (!win) {
            System.out.println("Lost all lives. You lose the game");
        }
        playAgain();
    }

    public static boolean isCorrect(int userNumber) {
        return userNumber == getCode();
    }

    public static void printLowerHigher(int userNumber) {
        if (userNumber > getCode()) {
            System.out.println("Your code is too high");
        } else {
            System.out.println("Your code is too low");
        }
    }

    public static void printHint() {
        String stringCode = Integer.toString(getCode());
        char[] table = new char[4];
        table[0] = stringCode.charAt(0);
        table[1] = stringCode.charAt(1);
        table[2] = stringCode.charAt(2);
        table[3] = stringCode.charAt(3);
        Random random = new Random();
        int index = random.nextInt(4);
        System.out.println("In code " + (index + 1) + ". number is " + table[index]);

    }

    public static void playAgain() {
        System.out.println("\nDo you want to play again? Type \"yes\" or \"no\".");
        Scanner scanner1 = new Scanner(System.in);
        String contiunueGame = scanner1.nextLine();
        if (contiunueGame.equals("yes")) {
            playTheGame(getCode());
        } else {
            System.out.println("End of a game.");
        }
    }
}