package edu.epam.stringLikeStringBuilder.task2;

//      В строке вставить после каждого символа 'а' символ 'b'

//      A see a line of cars and they are all painted black

import java.util.*;
import java.util.regex.*;

public class AddCharB {

    public static void main(String[] args) {

        AddCharB makeExpressionGreatAgain = new AddCharB();
        makeExpressionGreatAgain.expressionReceiver();
    }

    private void expressionReceiver() {

        String usersSentence = "";
        Scanner insertData = new Scanner(System.in);

        System.out.println("Please, enter your sentence with many chars 'a': ");
        try {

            usersSentence = insertData.nextLine();
            insertData.close();

        } catch(InputMismatchException ex1) {

            System.out.println("It's really impossible, but you did it: you broke everything!!!");
        }

        expressionConverter(usersSentence);
    }

    private void expressionConverter(String expressionToConvert) {

        String[] charsArray = expressionToConvert.split("");
        int[] charsPosition = new int[charsArray.length];

        System.out.println("Chars length is: " + charsArray.length);

        for (int counter = 0; counter < charsArray.length; counter++) {

            if(charsArray[counter] == "a") {

                charsPosition[counter] = counter;
            }
        }

        System.out.print("Char \"A\" we find at the next positions: ");

        for (int counter = 0; counter < charsPosition.length; counter++) {

            System.out.print(charsPosition[counter] + ", ");
        }

        System.out.println("");
    }

    private void addedToB() {

    }

    private void resultOutput() {

    }
}
