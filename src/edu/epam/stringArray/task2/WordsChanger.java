package edu.epam.stringArray.task2;

//      Замените в строке все вхождения 'word' на 'letter'

import java.util.*;

public class WordsChanger {

    public static void main(String[] args) {

        WordsChanger wordOnLetter = new WordsChanger();
        wordOnLetter.inputString();
    }

    private void inputString() {

        String messageWithWords = "";
        Scanner inputMessage = new Scanner(System.in);

        try {

            System.out.println("Please< enter your message with words \"Word\": ");
            messageWithWords = inputMessage.nextLine();
            inputMessage.close();

        } catch (InputMismatchException ex1) {

            System.out.println("Missmatch excaption!");
        }

        System.out.println("Your message is: " + messageWithWords);

        filterString(messageWithWords);
    }

    private void filterString(String incomingMessage) {

        String messageConverter = incomingMessage.replaceAll("[Ww][Oo][Rr][Dd]", "letter");

        outputter(messageConverter);
    }

    private void outputter (String outputMessage) {

        System.out.println("Now our message is: " + outputMessage);
    }
}
