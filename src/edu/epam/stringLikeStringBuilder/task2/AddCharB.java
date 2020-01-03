package edu.epam.stringLikeStringBuilder.task2;

//      В строке вставить после каждого символа 'а' символ 'b'

//      Our sentence is: [ A see a line of cArs and they are all painted blackA a ]

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

        String result = "";
        Pattern pattern = Pattern.compile("[Aa]");
        Matcher match = pattern.matcher(expressionToConvert);

        while(match.find()) {

            result = expressionToConvert.replaceAll("[a]", "ab");
            result = result.replaceAll("[A]", "AB");
        }

        resultOutput(result);

    }

    private void resultOutput(String resultExpression) {

        System.out.println("Our result is: " + resultExpression);
    }
}
