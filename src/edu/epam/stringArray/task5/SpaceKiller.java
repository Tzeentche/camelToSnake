package edu.epam.stringArray.task5;

//      Удалить в строке все лишние проеблы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//      Крайние пробелы в строке удалить.

import java.util.*;

public class SpaceKiller {

    public static void main(String[] args) {

        SpaceKiller spaceKiller = new SpaceKiller();
        spaceKiller.inputExpression();
    }

    private void inputExpression() {

        String usersExpression = "";
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please, enter your SPACEFULL expression: ");

        try {

            usersExpression = userInput.nextLine();
            userInput.close();

        } catch(InputMismatchException ex1) {

            System.out.println("Your input is incorrect!");
        }

        killerSpaces(usersExpression);
    }

    private void killerSpaces(String someExpression) {

        String cleanExpression = someExpression.replaceAll("( )+", " ");

        outputResult(cleanExpression.trim());
    }

    private void outputResult(String result) {

        System.out.println("Result is:" + result);
    }
}
