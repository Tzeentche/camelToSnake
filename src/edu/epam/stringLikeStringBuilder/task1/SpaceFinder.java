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

        System.out.println("Please< enter your expression: ");

        try {

            userString = expression.nextLine();
            expression.close();

        } catch (InputMismatchException ex1) {

            System.out.println("Your expression is bad-bad-bad!");
        }

        spaceCounter(userString);
    }

    private void spaceCounter(String sentenceWithSpaces) {


    }

    private void outputResult() {


    }
}