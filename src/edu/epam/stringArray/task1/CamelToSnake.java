package edu.epam.stringArray.task1;

//      Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

import java.util.*;
import java.util.regex.*;

public class CamelToSnake {

//      Declare using values:

    static String[] array;
    static int arraySize = 0;
    String result = "";

    public static void main(String[] args) {

        CamelToSnake giveMeSnakeCase = new CamelToSnake();
        giveMeSnakeCase.inputString();
    }

    private void inputString() {

        String camelCaseWord = "";
        Scanner inputString = new Scanner(System.in);

        try {

//      Input the origin String:

            System.out.println("Please, enter a some string, consists with few words:");
            camelCaseWord = inputString.nextLine();
            inputString.close();

        } catch (InputMismatchException e1) {

            System.out.println("Entered value is not expected type.");

        } catch (ArrayIndexOutOfBoundsException e2) {

            System.out.println("The size of the array out of bounds.");
        }

        System.out.println("RakaMakaFo!!!! " + camelCaseWord);

        wordConverter(camelCaseWord);

    }

    private void wordConverter(String initialString) {

        arraySize = initialString.length();
        array = new String[arraySize];

        String[] charsArray = initialString.split("");

        for(int counter = 0; counter < arraySize; counter++) {

            Pattern pattern = Pattern.compile("[A-Z]");
            Matcher match = pattern.matcher(charsArray[counter]);

            if (match.find()) {

                String lowerCase = charsArray[counter].toLowerCase();
                result += " ".concat(lowerCase);

            } else {

                result += charsArray[counter];
            }
        }

        result = result.trim();
        result = result.replaceAll(" ", "_");

        outputResult(result);

    }

    private void outputResult(String resultWord) {

        System.out.println("Now word is: " + resultWord);
        }
}
