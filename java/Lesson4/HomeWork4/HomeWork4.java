package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOT_TO_WIN = 4;

    public static char DOT_MAP = '*';
    public static char DOT_X = 'X';
    public static char DOT_O = 'O';

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_MAP;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + "  ");

            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }

    }

    public static void HumanTU() {
        int x, y;
        do {
            System.out.println("введите кординаты в форме X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static void BotTU() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Робот делает ход " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || x >= SIZE) {
            return false;
        }
        if (map[x][y] != DOT_MAP) {
            return false;
        }
        return true;
    }
     public static boolean chekWin ( char symbol) {
         for (int i = 0; i < map.length; i++) {
             if (map[i][0] == symbol && map[i][1] == symbol && map[i][2] == symbol && map[i][3] == symbol)
                 return true;
             if (map[i][1] == symbol && map[i][2] == symbol && map[i][3] == symbol && map[i][4] == symbol)
                 return true;
         }
         for (int i = 0; i < map.length; i++) {
             if (map[0][i] == symbol && map[1][i] == symbol && map[2][i] == symbol && map[3][i] == symbol)
                 return true;
             if (map[1][i] == symbol && map[2][i] == symbol && map[3][i] == symbol && map[4][i] == symbol)
                 return true;
         }
         for (int i = 0; i < map.length; i++) {
             if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol && map[3][3] == symbol )
                 return true;
             if (map[1][1] == symbol && map[2][2] == symbol && map[3][3] == symbol && map[4][4] == symbol)
                 return true;
         }
            return false;
     }
     public static boolean mapFULL() {
         for (int i = 0; i < map.length; i++) {
             for (int j = 0; j < map.length; j++) {
                if (map[i][j] == DOT_MAP){

                }
             }
         }
         return false;
     }


    public static void main(String[] args) {
            initMap();
            printMap();
            while (true) {
                HumanTU();
                printMap();
                if (chekWin(DOT_X)) {
                    System.out.println("побеждает человек");
                    break;
                }
                if (mapFULL()) {
                    System.out.println("ничья ");
                }
                BotTU();
                printMap();
                if (chekWin(DOT_O)) {
                    System.out.println("робот победил");
                    break;
                }
                if (mapFULL()) {
                    System.out.println("ничья ");
                    break;
                }
            }
            System.out.println("игра окончена  ");

        }

    }