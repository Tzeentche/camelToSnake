package edu.epam.stringLikeStringBuilder.task10;

//      Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком.
//      Определить количество предложений в строке X.

import java.util.*;

public class StringX {

    public static void main(String[] args) {

//        Create class example:

        StringX stringX = new StringX();
        stringX.usersString();
    }

    private void usersString() {

//        Declare local variables:

        String innerText = "";
        Scanner scn = new Scanner(System.in);

        System.out.println("Please, enter your text with few sentences: ");

//        Try to find exception:

        try {

            innerText = scn.nextLine();
            scn.close();

        } catch(InputMismatchException ex1) {

            System.out.println("You are broken the fourth wall!");
        }

        stringSplitter(innerText);
    }

    private void stringSplitter(String incomingText) {

//        Split users text:

        String[] textArray = incomingText.split("[.+!?]");

        sentencesCounter(textArray);
    }

    private void sentencesCounter(String[] arraySentences) {

//        Declare local variable and give it value:

        int counter = arraySentences.length;

        System.out.println(arraySentences.length);

        resultOutput(counter);
    }

    private void resultOutput(int result) {

//        Output result:
        
        System.out.println("Yuray!!! We have " + result + " sentences!");
    }
}
