package org.example;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        menu();

    }

    public static void menu(){
        ejecutarOpcion();
    }

    // metodo de operatoria de la matriz

    public static boolean validarDimensiones(int filas, int cols) {
        if (filas > 0 && cols > 0) {
            return true;
        } else {
            return false;
        }
    }

    static int[][] crearMatriz(int filas, int cols) {
        int[][] matrix = new int[filas][cols];
        return matrix;
    }

    public static int validarNumero() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingresa un numero válido");
            sc.next();
        }
        int opcionfinal = sc.nextInt();
        return opcionfinal;

    }


    public static int crearNumero() {
        Random random = new Random();
        return random.nextInt(10);
    }

    private static void llenarMatriz(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = crearNumero();
            }
        }
    }

    private static void mostrarFila(int matrix[][], int fila) {
        if (fila < 1 || fila > matrix.length) {
            System.out.println("Por favor ingresa un numero de fila válido");
            return;
        }

        for (int i = 0; i < matrix[fila -1].length; i++){
            System.out.println(matrix[fila-1][i] + "");
        }


    }

    public static boolean matrizCero(int matriz[][]) {
        int contador2 = 0;
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                contador2++;
                if (matriz[i][j] == 0) {
                    contador++;
                }
            }
        }

        if (contador > contador2 / 2) {
            return true;
        } else {
            return false;
        }
    }

    // fin de los metodos de operatoria de matriz


    // inicio de los metodos de menu

    public static void mostrarOpciones() {
        System.out.println("-- BIENVENIDO AL DE MATRICES");
        System.out.println("[1] MOSTRAR FILA");
        System.out.println("[2] VERIFICAR SI ES MATRIZ CERO");
        System.out.println("[3] SALIR");

    }

    public static int[][] menuMatriz() {
        int filas = 0;
        int cols = 0;
        while (!validarDimensiones(filas, cols)) {
            System.out.println("Ingresa un numero para tu fila");
            filas = validarNumero();
            System.out.println("Ingresa un numero para la columna");
            cols = validarNumero();

        }
        return crearMatriz(filas, cols);
    }

    public static void menuFila(int[][] m) {
        int fila = m.length + 1;
        while (fila > m.length) {
            System.out.println("Ingresa la fila que quieres mostrar");
            fila = validarNumero();
            if (fila < m.length) {
                mostrarFila(m, fila);
                break;
            }
            System.out.println("Por favor, ingresa un numero menor al número de filas");


        }

    }

    public static void menuCero(int[][] m) {
        if (matrizCero(m)) {
            System.out.println("La matriz es cero");
        } else {
            System.out.println("La matriz no es cero");
        }
    }


    public static void ejecutarOpcion() {
        int[][] m = menuMatriz();
        llenarMatriz(m);
        int opcion = 0;
        mostrarOpciones();
        opcion = validarNumero();
        while (opcion != 3) {
            if (opcion == 1) {
                menuFila(m);
                mostrarOpciones();
                opcion = validarNumero();
            } else if (opcion == 2) {
                menuCero(m);
                mostrarOpciones();
                opcion = validarNumero();
            } else if (opcion == 3) {
                System.out.println("Saliendo del programa....");
                System.out.println(".....");
                System.out.println("...");
                System.out.println("..");

            }
        }
    }


}


