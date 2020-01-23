package edu.epam.stringLikeStringBuilder.task6;

//      Из заданной строки получить новую, повторив каждый символ дважды

import java.util.*;

public class DoubleChar {

    public static void main(String[] args) {

//        Create class example:

        DoubleChar doubleChar = new DoubleChar();
        doubleChar.insertSentence();
    }

    private void insertSentence() {

//        Declare local variables:

        String sentence = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your sentence: ");

//        Try to catch exceptions:

        try {

            sentence = scan.nextLine();
            scan.close();

        } catch (InputMismatchException ex1) {

            System.out.println("Something going wrong!...");
        }

        sentenceSplitter(sentence);
    }

    private void sentenceSplitter(String expression) {

//        Split user's expression:

        String[] arrayExpression = expression.split("");

    sentenceDoubler(arrayExpression);
    }

    private void sentenceDoubler(String[] usersArray) {

//        Declare local variable:

        String resultSentense = "";

        for (int counter = 0; counter < usersArray.length; counter++) {

            resultSentense += usersArray[counter] + usersArray[counter];
        }

        resultOutput(resultSentense);
    }

    public void resultOutput(String resultSentenceIs) {

//        Output result:

        System.out.println("Result sentence is: " + resultSentenceIs);
    }
}
