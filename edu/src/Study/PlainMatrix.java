package study;

import java.util.Random;

class Fruit {
    private int a = 0;
}

public class PlainMatrix {

    private static <Taaaaa> void showMatrix(Taaaaa[][] m) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    } 


    private static <T extends Number> T getNumber(T n) {
        return n;
    }

    private static <T> T getNumber(T n, T m, T n1, T[] a) {
        return n;
    }

    public static void main(String[] args) {

        Random rand = new Random(System.currentTimeMillis());

        // int
        Integer[][] intMatrix = new Integer[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                intMatrix[i][j] = rand.nextInt(100);
            }
        }
        // showMatrix(intMatrix);

        // double
        Double[][] doubleMatrix = new Double[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                doubleMatrix[i][j] = rand.nextDouble(100);
            }
        }
        // showMatrix(doubleMatrix);

        // long
        Long[][] longMatrix = new Long[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                longMatrix[i][j] = rand.nextLong(100);
            }
        }
        // showMatrix(longMatrix);

        // T
        PlainMatrix.<Integer>showMatrix(intMatrix);
        PlainMatrix.<Double>showMatrix(doubleMatrix);
        PlainMatrix.<Long>showMatrix(longMatrix);

        Integer a = PlainMatrix.<Integer>getNumber(intMatrix[0][0]);
        Double b = PlainMatrix.<Double>getNumber(doubleMatrix[0][0]);
        Long c = PlainMatrix.<Long>getNumber(longMatrix[0][0]);
        Float d = PlainMatrix.<Float>getNumber(123.345f);

        Fruit f = new Fruit();

        Fruit fff = PlainMatrix.<Fruit>getNumber(f);

    }

}