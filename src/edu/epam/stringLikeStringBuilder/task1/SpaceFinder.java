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
//        [  Text to  count   some spaces     in the  text  ! ,.    ]

        String[] charsArray = userString.split("[^ ]+");

        spaceCounter(charsArray);
    }

    private void spaceCounter(String[] sentenceWithSpaces) {

        int spaceCounter = 0;

        spaceCounter = sentenceWithSpaces[0].length();

        for (int counter = 0; counter < sentenceWithSpaces.length;counter++) {

            if (spaceCounter <= sentenceWithSpaces[counter].length()) {

                spaceCounter = sentenceWithSpaces[counter].length();
            }
        }

        outputResult(spaceCounter);
    }

    private void outputResult(int result) {

        System.out.println("Max number of spaces is: " + result);

    }
}