package com.company.ZadaniaKlasyIMetody;

import java.util.Scanner;

/* Napisz program ‘wisielec’ – użytkownik ma 5 żyć, użytkownik może podać jedynie 1 literę –
gdy poda więcej przegrywa grę. Jeśli poda literę spoza hasła, traci jedno życie, gdy zostanie
bez żyć <0 przegrywa grę.
a. Użytkownik sam wpisuje hasło dla przeciwnika
b. * Hasło jest losowane z słownika czyli tablicy haseł
c. ** Po zakończeniu gry – zapytanie do użytkownika czy chce kontynuować dalej grę
(t/n)  */
public class Zadanie5 {
    public static void main(String[] args) {
        welcome();
        playTheGameHangman(enterPassword());
    }

    public static void welcome() {
        System.out.println("Welcome to the game \"HANGMAN\"! " +
                "\nType a character to guess the password. If You guess, You win the game. \n" +
                "If You miss, You lose a life. You have got 5 lives. \n" +
                "If You type more than one character, You lose the game. \n" +
                "Good Luck! \n ### START ###");
    }

    public static String enterPassword() {

        String[] tableOfPasswords = new String[5];
        tableOfPasswords[0] = "computer";
        tableOfPasswords[1] = "animal";
        tableOfPasswords[2] = "weather";
        tableOfPasswords[3] = "basketball";
        tableOfPasswords[4] = "galaxy";

        int index = (int) Math.round(Math.random() * (tableOfPasswords.length - 1));
        String password = tableOfPasswords[index];
//        System.out.println(password);
        return password;
    }

    public static void playTheGameHangman(String password) {

        int lives = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a character: ");
        String userChar = scanner.nextLine();

        do {
            if (userChar.length() != 1) {
                System.out.println("You have typed more or less than one character - You lose the game!");
            } else if (password.contains(userChar)) {
                System.out.println("You win! The password is \"" + password + "\"\n");
                System.out.println("Would You like to continue game? Type \"yes\" or \"no\"");
                String anotherGame = scanner.nextLine();
                if (anotherGame.equals("yes")) {
                    playTheGameHangman(enterPassword());
                } else {
                    break;
                }
            } else {
                System.out.println("You miss. Lost one life. Try again...");
                lives--;
                if (lives == 0) {
                    System.out.println("You lost all lives. You lose the game.");
                }
            }
            userChar = scanner.nextLine();
        } while (lives > 0);
    }
}
