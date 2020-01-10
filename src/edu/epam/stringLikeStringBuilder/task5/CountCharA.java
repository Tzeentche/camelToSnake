package edu.epam.stringLikeStringBuilder.task5;

//      Посчитать, сколько раз среди символов заданной строки встречается буква "а"

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountCharA {

    public static void main(String[] args) {

//        Create class instance:

        CountCharA countCharA = new CountCharA();
        countCharA.usersSentence();
    }

    private void usersSentence() {

//        Create scan instance and declare local variable:

        Scanner scan = new Scanner(System.in);
        String expression = "";

        System.out.println("Please, enter your sentence: ");

//        Catch exceptions:

        try {

            expression = scan.nextLine();
            scan.close();

        } catch (InputMismatchException ex1) {

            System.out.println("Amazing things: you was broken unbrokable!...");
        }

        expressionSplitter(expression);
    }

    private void expressionSplitter(String usersExpression) {

//        Split users sentence:

        String[] charsArray = usersExpression.split("[^a]+");

        charsCounter(charsArray);
    }

    private void charsCounter(String[] splittedSentence) {

//        Declare local variable:

        int charsCounter = 0;

        for(int counter = 0; counter < splittedSentence.length; counter++) {

            Pattern pattern = Pattern.compile("[a]+");
            Matcher match = pattern.matcher(splittedSentence[counter]);

//            Count chars "a":

            if(match.find()) {

                charsCounter += 1;
            }
        }

        resultOutput(charsCounter);
    }

    private void resultOutput(int result) {

//        Output result:

        System.out.println("Number of chars \"a\" is: " + result);
    }
}
