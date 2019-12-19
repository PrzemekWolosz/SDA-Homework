package com.company.ZadaniaInterfejsyOrazKolekcje.Kolekcje.Zadanie3;

import java.util.*;

public class LottoGame {

    public LottoGame() {
    }

    public void play() {
        Set<Integer> playerNumbers = new HashSet<>();
        int playerNumber = 1;
        for (int i = 1; i < 7; i++) {
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Type " + i + ". number [1-49]");
                playerNumber = scanner.nextInt();
            } while (playerNumber < 1 || playerNumber > 49);
            playerNumbers.add(playerNumber);
        }
        returnResult(playerNumbers, lottoDrawResults());
    }

    private Set<Integer> lottoDrawResults() {
        Set<Integer> drawResults = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            Random random = new Random();
            int drawnNumber = random.nextInt(49) + 1;
            drawResults.add(drawnNumber);
        }
        return drawResults;
    }

    public int returnResult(Set<Integer> playerNumbers, Set<Integer> drawResults) {
        int numberOfHits = 0;
        for (Integer number : playerNumbers) {
            if (drawResults.contains(number)) {
                numberOfHits++;
            }
        }
        System.out.println("Player numbers: " + playerNumbers.toString());
        System.out.println("Drawn numbers: " + drawResults.toString());
        System.out.println("Player hits: " + numberOfHits);
        return numberOfHits;
    }
}