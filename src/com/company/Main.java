// var 16
package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк и столбцов - ");
        int n = in.nextInt();
        int[][] array = new int[n][n];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("  ");
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = array[j][i];
                array[j][i] = array[i][j];
                array[i][j] = temp;
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
