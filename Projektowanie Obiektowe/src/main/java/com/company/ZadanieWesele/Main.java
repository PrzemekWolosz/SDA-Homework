package com.company.ZadanieWesele;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int guests = numberOfGuests(invitationCreator(numberOfInvitations()));
        System.out.println("In total " + guests + " guests were invited");
    }

    private static int numberOfInvitations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many invitation You would like to create?");
        return scanner.nextInt();
    }

    private static Invitation[] invitationCreator(int numberOfInvitations) {
        Invitation[] listOfGuests = new Invitation[numberOfInvitations];
        Scanner scanner = new Scanner(System.in);
        String name;
        String surname;
        String invitation;
        InvitationType invitationType = null;

        for (int i = 0; i < numberOfInvitations; i++) {

            System.out.println("Type name of guest");
            name = scanner.nextLine();
            System.out.println("Type surname of guest");
            surname = scanner.nextLine();
            System.out.println("Is this single invitation?");
            invitation = scanner.nextLine();

            while (!invitation.equalsIgnoreCase("yes") && !invitation.equalsIgnoreCase("no")) {
                System.out.println("Wrong answer, please type: 'yes' or 'no'");
                invitation = scanner.nextLine();
            }

            if (invitation.equalsIgnoreCase("yes")) {
                invitationType = InvitationType.SINGLE;
            } else if (invitation.equalsIgnoreCase("no")) {
                invitationType = InvitationType.WITH_A_COMPANION;
            }

            listOfGuests[i] = new Invitation(name, surname, invitationType);
        }
        System.out.println(Arrays.toString(listOfGuests));
        return listOfGuests;
    }

    private static int numberOfGuests(Invitation[] listOfGuest) {
        int numberOfGuests = 0;
        for (Invitation inv : listOfGuest) {
            numberOfGuests += inv.invitationType.getNumberOfPeople();
        }
        return numberOfGuests;
    }
}