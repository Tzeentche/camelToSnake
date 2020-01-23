package edu.epam.stringLikeStringBuilder.task9;

//      Посчитать количество строчных (маленьких) и прописных (больших) букв в введеннйо строке. Учитывать только английские буквы.

import java.util.*;
import java.util.regex.*;

public class CharsCounter {

    public static void main(String[] args) {

        CharsCounter charsCounter = new CharsCounter();
        charsCounter.charsInsert();
    }

    private void charsInsert() {

        String usersSentence = "";
        Scanner scn = new Scanner(System.in);

        System.out.println("Let's enter sentence:");

        try {

            usersSentence = scn.nextLine();
            scn.close();

        } catch (InputMismatchException ex1) {

            System.out.println("Something going wrong!");
        }

        textSplitter(usersSentence);
    }

    private void textSplitter(String usersText) {

        String[] textArray = usersText.split("[.]");

        charsCounter(textArray);
    }

    private void charsCounter(String[] innerExpression) {

        int lowChars = 0, highChars = 0;

        for(int counter = 0; counter < innerExpression.length; counter++) {

            Pattern lowPattern = Pattern.compile("[a-z]");
            Matcher firstMatch = lowPattern.matcher(innerExpression[counter]);

            while (firstMatch.find()) {

                lowChars += 1;
            }

            Pattern highPattern = Pattern.compile("[A-Z]");
            Matcher secondMatch = highPattern.matcher(innerExpression[counter]);

            while (secondMatch.find()) {

                highChars += 1;
            }
        }

        resultOutput(lowChars, highChars);
    }

    private void resultOutput(int lowChars, int highChars) {

        System.out.println("Count of low case chars is " + lowChars + ", and count of high case is " + highChars);
    }
}
