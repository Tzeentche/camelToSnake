package edu.epam.stringArray.task2;

//      Замените в строке все вхождения 'word' на 'letter'

import java.util.*;

public class WordsChanger {

//    Without class variables:

    public static void main(String[] args) {

        WordsChanger wordOnLetter = new WordsChanger();
        wordOnLetter.inputString();
    }

//    This method get user's input. But i recommend this message "Word is not a wOrd or woRd also worD and of course WORD or wORD and woRD with WorD." for testing:

    private void inputString() {

//        Declare local variables:

        String messageWithWords = "";
        Scanner inputMessage = new Scanner(System.in);

//        Catch exceptions:

        try {

            System.out.println("Please< enter your message with words \"Word\": ");
            messageWithWords = inputMessage.nextLine();
            inputMessage.close();

        } catch (InputMismatchException ex1) {

            System.out.println("Missmatch excaption!");
        }
//      Output user's message for testing:

        System.out.println("Your message is: " + messageWithWords);

        filterString(messageWithWords);
    }

//    Find and replace word "word":

    private void filterString(String incomingMessage) {

//        Call method realaceAll():

        String messageConverter = incomingMessage.replaceAll("[Ww][Oo][Rr][Dd]", "letter");

        outputter(messageConverter);
    }

//    Output result message:

    private void outputter (String outputMessage) {

        System.out.println("Now our message is: " + outputMessage);
    }
}
