package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

public static char [][] map ;

public static final int SIZE = 5;

public static final int DOT_TO_WIN = 4;

    public static char DOT_EMPTY = '*';
    public static char DOT_X = 'x';
    public static char DOT_O = '0';
     public static  final Scanner SCANNER = new Scanner(System.in);
     public static final Random RANDOM = new Random(SIZE);

     public static void initMap(){
        map = new char[SIZE][SIZE];
         for (int i = 0; i < map.length; i++ ){
             for (int j = 0 ; j < map[i].length ; ){
                 map[i][j] = DOT_EMPTY;
             }
         }
     }
    public static void printMap(){
         for (int i = 0 ; i < map.length ; i++){
             System.out.print(i + "  ");
         }
         for (int i = 0 ; i < map.length; i++ ){
             System.out.print((i + 1) + "  ");

             for (int j = 0 ; j < map [i].length; j ++){
                 System.out.print(map[i][j]);
             }
             System.out.println();
         }
    }
    public static void Human(){
         int x , y;
         do {
             System.out.println("введите числа в виде координат x y  ");
             x = SCANNER.nextInt() - 1;
             y = SCANNER.nextInt() - 1;
         }while (!isCellValid( x , y ));
            map[y][x] =  DOT_X;
    }
    public static void bot(){
        int x , y;
        do {
            x = RANDOM.nextInt();
            y = RANDOM.nextInt();
            System.out.println("робот делает ход" + (x + 1) + " " + (y + 1));
        }while (!isCellValid( x , y ));
        map[y][x] = DOT_O;
    }
    public static boolean isCellValid ( int x , int y ){
         if (x < 0 || x >= SIZE || y < 0 || y >= SIZE){
             return false;
         }if( map[x][y] != DOT_EMPTY){
            return false;
        }
            return true;
    }







    public static void main(String[] args) {

    }
}