package edu.epam.stringLikeStringBuilder.task3;

//      Проверить, является ли заданное слово палиндромом

import java.util.*;

public class PalindromChacker {

    public static void main(String[] args) {

//        Create class sample:

        PalindromChacker palindromChacker = new PalindromChacker();
        palindromChacker.wordReceiver();
    }

    private void wordReceiver() {

//        Declare local variables:

        String expression = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your sentence: ");

//        Inter user's sentence:

        try {

            expression = scan.nextLine();
            scan.close();

        } catch(InputMismatchException ex1) {

            System.out.println("Something strange: you broke unbrakable!");
        }

        wordChecker(expression);
    }

    private void wordChecker(String innerExpression) {

//        Check user's sentence:

        StringBuffer buffer = new StringBuffer(innerExpression);
        buffer.reverse();
        boolean resultIs = innerExpression.contentEquals(buffer);

        outputResult(resultIs);
    }

    private void outputResult(boolean innerResult) {

//        Output result:
        
        if (innerResult) {

            System.out.println("Your word is pa-pa-pa-PALINDROM!");

        } else {

            System.out.println("It's not PALINDROM :(");
        }
    }
}
