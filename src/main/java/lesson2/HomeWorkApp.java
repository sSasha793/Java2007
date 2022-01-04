package lesson2;



public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(sum(9, 10));
        positive_number(-4);
        System.out.println(positive_number2(-21));
        printWordNTimes("9", 9);
        System.out.println(printYear(2004));
    }

    public static boolean sum(int n1, int n2) {
        int result = n1 + n2;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void positive_number(int b) {
        if (b >= 0) {
            System.out.println("number is positiver");
        } else {
            System.out.println("number is negative ");
        }
    }

    public static boolean positive_number2(int num) {
        if (num <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWordNTimes(String word, int times) {
        int v = times;
        int j = times;
        for (v = 0; v < 5; v++) {
            for (j = 0; j < 10; j++) {
                System.out.print(word);
            }
            System.out.println();
        }
    }
    public static boolean  printYear(int year) {
        if (year % 4 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return true;
        } else return year % 400 == 0;


    }



}