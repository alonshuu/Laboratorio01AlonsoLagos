package org.example;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        validarDimensiones(3,3);

    }

    public static void validarDimensiones(int filas, int cols){
        if (filas > 0 && cols > 0){
            System.out.println("Ambas dimensiones son validas");
        } else {
            System.out.println("Las dimensiones no son validas");
        }
    }

    int[][] crearMatriz(int filas, int cols){
        int[][] matrix = new int[filas][cols];
        return matrix;
    }


    private static void llenarMatriz(int matrix[][]){

    }
}