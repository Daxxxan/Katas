package com.greed;

public class Greed {
    public static void main(String[] args) {
        int[] occurrences = new int[]{1, 6, 6, 2, 6, 2};
        System.out.println(score(occurrences));
    }

    public static int score(int[] dicesScores) {
        int[] occurrences = new int[]{0, 0, 0, 0, 0, 0};
        int dice = 1;
        int score = 0;

        getOccurrenceOfEachScore(dicesScores, occurrences);
        if(thereAreThreePairs(occurrences)) {
            return 800;
        } else if(thereIsAStraight(occurrences)) {
            return 1200;
        }

        for(int i = 0; i < occurrences.length; i++) {
            dice = i + 1;
            if (thereIsAlmostOneOccurrenceOf(occurrences[i])) {
                if(thereAreThreeOrMoreOccurrences(occurrences[i])) {
                    score += calculateHighOccurrenceScore(occurrences[i], dice);
                } else {
                    if (dice == 1) {
                        score += occurrences[i] * 100;
                    } else if(dice == 5) {
                        score += occurrences[i] * 50;
                    }
                }
            }
        }

        return score;
    }

    private static boolean thereIsAStraight(int[] occurrences) {
        if(occurrences.length == 6) {
            for(int i = 0; i < occurrences.length; i++) {
                if(occurrences[i] != 1) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean thereAreThreePairs(int[] occurrences) {
        int numberOfPairs = 0;

        for (int i = 0; i < occurrences.length; i++) {
            if(occurrences[i] == 2) {
                numberOfPairs += 1;
            }
        }

        return numberOfPairs == 3;
    }

    private static int calculateHighOccurrenceScore(int occurrence, int dice) {
        int throwScore = handleThreeOccurrences(dice);

        if(thereIsXOccurrencesOf(occurrence, 6)) {
            throwScore *= 8;
        } else if(thereIsXOccurrencesOf(occurrence, 5)) {
            throwScore *= 4;
        } else if(thereIsXOccurrencesOf(occurrence, 4)) {
            throwScore *= 2;
        }

        return throwScore;
    }

    private static int handleThreeOccurrences(int dice) {
        int throwScore = 0;
        if(dice == 1) {
            throwScore = dice * 1000;
        } else {
            throwScore = dice * 100;
        }
        return throwScore;
    }

    private static void getOccurrenceOfEachScore(int[] dicesScores, int[] occurrences) {
        for(int i = 0; i < dicesScores.length; i++) {
            occurrences[dicesScores[i] - 1]++;
        }
    }

    private static boolean thereIsXOccurrencesOf(int occurrence, int i) {
        return occurrence == i;
    }

    private static boolean thereIsAlmostOneOccurrenceOf(int occurrence) {
        return occurrence > 0;
    }

    private static boolean thereAreThreeOrMoreOccurrences(int occurrence) {
        return occurrence >= 3;
    }
}
