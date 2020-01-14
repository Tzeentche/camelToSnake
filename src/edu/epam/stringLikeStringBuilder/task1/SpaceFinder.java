package edu.epam.stringLikeStringBuilder.task1;

//      Дана текст (строка). Найдите наибольшее количество подряд идущих пробелов в нём.

import java.util.*;
import java.util.regex.*;

public class SpaceFinder {

    public static void main(String[] args) {

        SpaceFinder spaceFinder = new SpaceFinder();
        spaceFinder.inputExpression();
    }

    private void inputExpression() {

        Scanner expression = new Scanner(System.in);
        String userString = "";

        System.out.println("Please, enter your expression: ");

        try {

            userString = expression.nextLine();
            expression.close();

        } catch (InputMismatchException ex1) {

            System.out.println("Your expression is bad-bad-bad!");
        }

//        [\r\n\t\f\v]+
//        [A-Za-z]+
//        [  Text to  count   some spaces    in the  text  ! ,.  ]

        String[] charsArray = userString.split("[^ ]+");

        System.out.println("Mid output is: " + charsArray);

        spaceCounter(charsArray);
    }

    private void spaceCounter(String[] sentenceWithSpaces) {

        int spaceCounter = 0;
        int[] arrayData = new int[sentenceWithSpaces.length];

        for(int counter = 0; counter < sentenceWithSpaces.length; counter++) {
            System.out.println(sentenceWithSpaces[counter]);

            Pattern pattern = Pattern.compile("[ ]+");
            Matcher match = pattern.matcher(sentenceWithSpaces[counter]);

            if(match.find()) {

                arrayData[counter] += 1;

                spaceCounter += 1;
            }

            System.out.print("Counter is: " + counter + ", This arrayData is: " + arrayData[counter]);
        }

        outputResult(spaceCounter);
    }

    private void outputResult(int result) {

        System.out.println("Number of spaces is: " + result);
        
    }
}