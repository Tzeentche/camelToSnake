package edu.epam.stringArray.task3;

//  В строке найти количество цифрфр.

import java.util.*;
import java.util.regex.*;

public class NumbersFinder {

    public static void main(String[] args) {

        NumbersFinder simpleCounter = new NumbersFinder();
        simpleCounter.messageReceiver();
    }

    private void messageReceiver() {

        String incomingMessage = "";
        Scanner usersMessage = new Scanner(System.in);

        System.out.println("Please, enter your message (include numbers): ");

        try {
            incomingMessage = usersMessage.nextLine();
            usersMessage.close();

        } catch(InputMismatchException ex1) {

            System.out.println("It's going something wrong with your message!");
        }

        messageSplitter(incomingMessage);
    }

    private void messageSplitter(String incomingMessage) {

        String[] resultArray = incomingMessage.split("");

        numbersCounter(resultArray);
    }

    private void numbersCounter(String[] messageWithNumbers) {

        int valueOfNumbers = 0;
        int arraySize = messageWithNumbers.length;

        for(int counter = 0; counter < arraySize; counter++) {

            Pattern pattern = Pattern.compile("[0-9]");
            Matcher match = pattern.matcher(messageWithNumbers[counter]);

            if (match.find()) {

                valueOfNumbers += 1;
            }
        }

        counterOutputter(valueOfNumbers);
    }

    private void counterOutputter(int result) {

        System.out.println("Result of counting is: " + result);
    }
}
