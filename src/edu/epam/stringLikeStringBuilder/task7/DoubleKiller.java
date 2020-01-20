package edu.epam.stringLikeStringBuilder.task7;

//      Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde def", то должно быть выведено "abcdef".

import java.util.*;

public class DoubleKiller {

    public static void main(String[] args) {

        DoubleKiller doubleKiller = new DoubleKiller();
        doubleKiller.enterString();
    }

    private void enterString() {

        String usersString = "";
        Scanner scn = new Scanner(System.in);

        try {

            usersString = scn.nextLine();
            scn.close();

        } catch(InputMismatchException ex1) {

            System.out.println("You broke the System!");
        }

        textSplitter(usersString);
    }

    private void textSplitter(String incomingString) {

        String[] textArray = incomingString.split("");

        spaceKiller(textArray);
    }

    private void spaceKiller(String[] messageArray) {

        for(int count = 0; count < messageArray.length; count++) {

            
        }
    }

}
