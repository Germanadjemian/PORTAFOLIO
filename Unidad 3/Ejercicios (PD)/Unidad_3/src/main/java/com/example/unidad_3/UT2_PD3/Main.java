package com.example.unidad_3.UT2_PD3;


import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

       int[] ints= {5,3,7,8};
        Arrays.sort(ints);
        for(int i:ints){
            System.out.println(i);
        }
        System.out.println("\nOTRO EJEMPLO\n");

        Integer[] arr = {5, 2, 9, 1, 5, 6}; // Integer en lugar de int para poder usar reverse

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Arreglo ordenado de mayor a menor: " + Arrays.toString(arr));

    }
}