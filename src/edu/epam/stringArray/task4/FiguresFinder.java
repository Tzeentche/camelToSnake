package edu.epam.stringArray.task4;

//  В строке найти количество чисел.

import java.util.*;
import java.util.regex.*;

public class FiguresFinder {

    public static void main(String[] args) {

//        Create class example:

        FiguresFinder figuresFinder = new FiguresFinder();

        figuresFinder.usersInput();
    }

    private void usersInput() {

//        Declare local variables:

        String sentenceHolder = "";
        Scanner usersSentence = new Scanner(System.in);

//        (I recommend to use next one sentence: "1.1Words5 w0rds 13! 1 -0 0.2  3\,4"):

        System.out.println("Please, enter some sentence with numbers!");

//        Check user's sentence:

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

//        Declare local variables:

        int result = 0;
        int arraySize = stringsArray.length();
        Pattern pattern = Pattern.compile("[0.0-99]+");
        Matcher match = pattern.matcher(stringsArray);

        for (int count = 0; count < arraySize; count++) {

            while(match.find()) {

                result += 1;
            }
        }

        outputResult(result);
    }

    private void outputResult(int finalStep) {

//        Output result:

        System.out.println("Our sentence consists " + finalStep + " figures!");
    }
}