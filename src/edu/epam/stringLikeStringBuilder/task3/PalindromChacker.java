package edu.epam.stringLikeStringBuilder.task3;

//      Проверить, является ли заданное слово палиндромом

import java.util.*;

public class PalindromChacker {

    public static void main(String[] args) {

        PalindromChacker palindromChacker = new PalindromChacker();
        palindromChacker.wordReceiver();
    }

    private void wordReceiver() {

        String expression = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your sentence: ");

        try {

            expression = scan.nextLine();
            scan.close();

        } catch(InputMismatchException ex1) {

            System.out.println("Something strange: you broke unbrakable!");
        }

        wordChecker(expression);
    }

    private void wordChecker(String innerExpression) {

        StringBuffer buffer = new StringBuffer(innerExpression);
        buffer.reverse();
        boolean resultIs = innerExpression.contentEquals(buffer);

        outputResult(resultIs);
    }

    private void outputResult(boolean innerResult) {

        if (innerResult) {

            System.out.println("Your word is pa-pa-pa-PALINDROM!");

        } else {

            System.out.println("It's not PALINDROM :(");
        }
    }
}
