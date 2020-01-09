package edu.epam.stringLikeStringBuilder.task4;

//      С помощью функции копирования и операции конкатенации составить из частей слова "информатика" слово "торт"

public class InfoToCake {

//      Declare global variables:

    StringBuffer source = new StringBuffer("информатика");
    char[] firstPart = new char[source.length()];

    public static void main(String[] args) {

//        Create class example:

        InfoToCake infoToCake = new InfoToCake();
        infoToCake.copyFunc();
    }

    private void copyFunc() {

//        Copy chars:

            firstPart[0] = source.charAt(3);
            firstPart[1] = source.charAt(4);
            firstPart[2] = source.charAt(7);

            concatOper();
    }

    private void concatOper() {

//        Concatenate sentence to task's expression:

        String resultIs = ("" + firstPart[2] + firstPart[0] + firstPart[1] + firstPart[2]);

        cakeOutput(resultIs);
    }

    private void cakeOutput(String sentence) {

//        Output result:

        System.out.println("Result is: " + sentence);
    }
}
