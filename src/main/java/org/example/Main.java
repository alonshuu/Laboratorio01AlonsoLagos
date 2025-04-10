package org.example;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        validarDimensiones(3,3);
        int[][] matrix = crearMatriz(3,3);
        llenarMatriz(matrix);
        imprimirMatriz(matrix);

    }

    public static void validarDimensiones(int filas, int cols){
        if (filas > 0 && cols > 0){
            System.out.println("Ambas dimensiones son validas");
        } else {
            System.out.println("Las dimensiones no son validas");
        }
    }

    static int[][] crearMatriz(int filas, int cols){
        int[][] matrix = new int[filas][cols];
        return matrix;
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




}