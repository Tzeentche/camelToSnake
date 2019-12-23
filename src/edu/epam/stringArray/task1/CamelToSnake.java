package edu.epam.stringArray.task1;

//      Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

import java.util.*;

public class CamelToSnake {

//      Declare using values:

    static String[] array;
    static int arraySize = 0;
    public static String fewWords;

    public static void main(String[] args) {

        CamelToSnake giveMeSnakeCase = new CamelToSnake();
        giveMeSnakeCase.inputString();
    }

    public String inputString() {

        Scanner inputString = new Scanner(System.in);

        try {

//      Input the origin String:

            System.out.println("Please, enter a some string, consists with few words:");
            fewWords = inputString.nextLine();
            inputString.close();

        } catch (InputMismatchException e1) {

            System.out.println("Entered value is not expected type.");

        } catch (ArrayIndexOutOfBoundsException e2) {

            System.out.println("The size of the array out of bounds.");
        }

        System.out.println("RakaMakaFo!!!! " + fewWords);

        arrayConverter(fewWords);

        return "";
    }

    public String arrayConverter(String inputString) {

        arraySize = fewWords.length();
        array = new String[arraySize];
        String[] charsArray = inputString.split("");

        System.out.println("Our array is: ");
        for(int counter = 0; counter < arraySize; counter++) {

            System.out.println(charsArray[counter]);
        }

        camelToSnake(charsArray);
        return "";
    }

    public String camelToSnake(String[] mutantString) {

        arraySize = 1 + fewWords.length();
        for(int counter = 0; counter < arraySize; counter++) {

            if(1 == 1) {

                
            }
        }
        return "";
    }

    String outputResult()
    {

        return "";

    }



}
