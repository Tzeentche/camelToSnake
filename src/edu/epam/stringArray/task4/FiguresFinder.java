package edu.epam.stringArray.task4;

//  В строке найти количество чисел.

import java.util.*;
import java.util.regex.*;

public class FiguresFinder {

    public static void main(String[] args) {

        FiguresFinder figuresFinder = new FiguresFinder();

        figuresFinder.usersInput();
    }

    private void usersInput() {

        Scanner usersSentence = new Scanner(System.in);
        String sentenceHolder = "";

        System.out.println("Please, enter some sentence with numbers!");

        try {

            sentenceHolder = usersSentence.nextLine();
            usersSentence.close();

        } catch(InputMismatchException ex1) {

            System.out.println("Amazing, but your input is invalid! How did you do this?");
        }

        System.out.println("Your sentence is: " + sentenceHolder);
        figuresCounter(sentenceHolder);
    }

    private void figuresCounter(String stringsArray) {

        int result = 0;
        int arraySize = stringsArray.length();
        Pattern pattern = Pattern.compile("[0.0-9.9]+");
        Matcher match = pattern.matcher(stringsArray);

        for (int count = 0; count < arraySize; count++) {

            while(match.find()) {

                result += 1;
            }
        }

        outputResult(result);
    }

    private void outputResult(int finalStep) {

        System.out.println("Our sentence consists " + finalStep + " figures. YEEEEEEE!!!");
    }
}