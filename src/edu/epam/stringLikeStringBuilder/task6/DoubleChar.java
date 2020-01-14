package edu.epam.stringLikeStringBuilder.task6;

//      Из заданной строки получить новую, повторив каждый символ дважды

import java.util.*;
import java.util.regex.*;

public class DoubleChar {

    public static void main(String[] args) {

        DoubleChar doubleChar = new DoubleChar();
        doubleChar.insertSentence();
    }

    private void insertSentence() {

        String sentence = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your sentence: ");
        try {

            sentence = scan.nextLine();
            scan.close();

        } catch (InputMismatchException ex1) {

            System.out.println("Something going wrong!...");
        }

        sentenceDoubler(sentence);
    }

    private void sentenceDoubler(String expression) {

        
    }
}
