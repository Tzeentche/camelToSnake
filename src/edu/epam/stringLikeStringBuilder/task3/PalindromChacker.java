package edu.epam.stringLikeStringBuilder.task3;

//      Проверить, является ли заданное слово палиндромом

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class PalindromChacker {

    public static void main(String[] args) {

        PalindromChacker palindromChacker = new PalindromChacker();
        palindromChacker.wordReceiver();
    }

    private void wordReceiver() {

        String expression = "";
        Scanner scan = new Scanner(System.in);

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
        boolean resultIs = innerExpression.equals(buffer);

        outputResult(resultIs);
    }

    private void outputResult(boolean innerResult) {

        innerResult == true ? System.out.println() : System.out.println();
        }
    }
}
