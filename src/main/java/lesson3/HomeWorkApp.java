package lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        //1
        invertArray();
        //2
        fillArray();
        //3
        massive6();
        //4
        fillDiagonal();
        //

        System.out.println(Arrays.toString( len_initialValue(5,5) ));
    }

    public static void invertArray() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = 0;

            } else if (arr[i] == 0) {
                arr[i] = 1;
            }


        }
        System.out.println(Arrays.toString(arr));
    }

    // System.out.println(Arrays.toString(arr));
    public static void fillArray() {
        int[] arr = new int[101];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(i + " ");

        }


    }

    public static void massive6() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //int a = 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
                if (arr[i] == arr[j]) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

        public static int [] len_initialValue (int len, int initialValue) {
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
            }
            return arr;

        }

}


























