package edu.epam.stringLikeStringBuilder.task7;

//      Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde def", то должно быть выведено "abcdef".

import java.util.*;

public class DoubleKiller {

    public static void main(String[] args) {

//        Create class example:

        DoubleKiller doubleKiller = new DoubleKiller();
        doubleKiller.enterString();
    }

    private void enterString() {

//        Declare local variable and scanning user's expression:

        String usersString = "";
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your text: ");

//        Try to find exceptions:

        try {

            usersString = scn.nextLine();
            scn.close();

        } catch(InputMismatchException ex1) {

            System.out.println("You broke the System!");
        }

        duplicateKiller(usersString);
    }

    private void duplicateKiller(String messageArray) {

//        Declare local variable and find duplicate chars:

        String mediumExtension = new StringBuilder(messageArray).reverse().toString();
        mediumExtension = mediumExtension.replaceAll("(.)(?=.*\\1)", "");
        mediumExtension = new StringBuilder(mediumExtension).reverse().toString();

        spaceKiller(mediumExtension);
    }

    private void spaceKiller(String refactoredChars) {

//        Kill spaces:

        refactoredChars = refactoredChars.replace(" ", "");

        outputResult(refactoredChars);
    }

    private void outputResult(String result) {

//        Output result:
        
        System.out.println("Result is:" + result);
    }
}
