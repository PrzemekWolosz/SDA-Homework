package com.company.Zadanie7Robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Robot optimusPrime = new Robot(100, "Optimus Prime", true);
        Scanner scanner = new Scanner(System.in);
        String komenda;
        do {
            System.out.println("Podaj komendę: ruch, naładuj, włącz, wyłącz, koniec");
            komenda = scanner.nextLine();

            if (komenda.equals("ruch")) {
                System.out.println("Jaki ruch ma wykonać robot: KROK_LEWA, KROK_PRAWA, RUCH_REKA_LEWA, RUCH_REKA_PRAWA, SKOK ?");
                String rodzajRuchu = scanner.nextLine();

                switch (rodzajRuchu) {
                    case "KROK_LEWA":
                        optimusPrime.poruszRobotem(RuchRobota.KROK_LEWA);
                        break;
                    case "KROK_PRAWA":
                        optimusPrime.poruszRobotem(RuchRobota.KROK_PRAWA);
                        break;
                    case "RUCH_REKA_LEWA":
                        optimusPrime.poruszRobotem(RuchRobota.RUCH_REKA_LEWA);
                        break;
                    case "RUCH_REKA_PRAWA":
                        optimusPrime.poruszRobotem(RuchRobota.RUCH_REKA_PRAWA);
                        break;
                    case "SKOK":
                        optimusPrime.poruszRobotem(RuchRobota.SKOK);
                        break;
                    default:
                        System.out.println("Podałeś niewłaściwą komendę");
                }
            } else {
                switch (komenda) {
                    case "naładuj":
                        optimusPrime.naladujRobota();
                        break;
                    case "włącz":
                        optimusPrime.wlaczRobota();
                        break;
                    case "wyłącz":
                        optimusPrime.wylaczRobota();
                        break;
                }
            }
        } while (!komenda.equals("koniec"));
    }
}
