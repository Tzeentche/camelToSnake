package edu.epam.stringLikeStringBuilder.task4;

//      С помощью функции копирования и операции конкатенации составить из частей слова "информатика" слово "торт"

public class InfoToCake {

    StringBuffer source = new StringBuffer("информатика");
    char[] firstPart = new char[source.length()];

    public static void main(String[] args) {

        InfoToCake infoToCake = new InfoToCake();
        infoToCake.copyFunc();
    }

    private void copyFunc() {

            firstPart[0] = source.charAt(3);
            firstPart[1] = source.charAt(4);
            firstPart[2] = source.charAt(7);

            concatOper();
    }

    private void concatOper() {

        String resultIs = ("" + firstPart[2] + firstPart[0] + firstPart[1] + firstPart[2]);

        cakeOutput(resultIs);
    }

    private void cakeOutput(String sentence) {

        System.out.println("Result is: " + sentence);
    }
}
