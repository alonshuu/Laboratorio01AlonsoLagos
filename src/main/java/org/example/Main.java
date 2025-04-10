package org.example;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        mostrarOpciones();
        int opcion = validarNumero();
        ejecutarOpcion(opcion);
    }


    // metodo de operatoria de la matriz

    public static boolean validarDimensiones(int filas, int cols){
        if (filas > 0 && cols > 0){
            return true;
        } else {
            return false;
        }
    }

    static int[][] crearMatriz(int filas, int cols){
        int[][] matrix = new int[filas][cols];
        return matrix;
    }

    public static int validarNumero(){
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()){
            System.out.println("Por favor ingresa un numero válido");
            sc.next();
        }
        int opcionfinal =sc.nextInt();
        return opcionfinal;

    }


    public static void imprimirMatriz(int m[][]){
        for (int i = 0; i<m.length; i++){
            for (int j = 0; j <m.length; j++){
                System.out.println(m[i][j]);
            }
        }
    }

    public static int crearNumero(){
        Random random = new Random();
        return random.nextInt(10);
    }

    private static void llenarMatriz(int matrix[][]){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j<matrix.length; j++){
                matrix[i][j] = crearNumero();
            }
        }
    }

    private static void mostrarFila(int matrix[][], int fila){
        for (int i = 0; i<matrix.length;i++){
            System.out.print(matrix[fila][i]);
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


    public static void mostrarOpciones(){
        System.out.println("-- BIENVENIDO AL SISTEMA DE CREACION DE MATRICES");
        System.out.println("[1] CREAR MATRIZ ");
        System.out.println("[2] MOSTRAR FILA");
        System.out.println("[3] VERIFICAR SI ES MATRIZ CERO");
        System.out.println("[4] SALIR");

    }

    public static void ejecutarOpcion(int opcion){

        int[][] m = new int[0][0];


        while(opcion != 5) {
            if (opcion == 1) {
                int fila = validarNumero();
                int col = validarNumero();
                m = crearMatriz(fila, col);
                llenarMatriz(m);
                mostrarOpciones();
                opcion = validarNumero();
            }
            else if (opcion == 2){
                int fila2 = validarNumero();
                mostrarFila(m, fila2);
                mostrarOpciones();
                opcion = validarNumero();
            }

            else if (opcion == 3){
                if(matrizCero(m)){
                    System.out.println("La matriz es matriz cero");
                } else {
                    System.out.println("La matriz no es matriz cero.");
                }

                mostrarOpciones();
                opcion = validarNumero();
            }

            else if (opcion == 4){
                System.out.println("Saliendo del programa...");
                System.out.println("....");
                System.out.println("...");
                break;
            }
        }

    }


}