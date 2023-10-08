package com.example.unidad_3.UT2_PD1;

import java.io.*;
public class Ej1
{
    public static void main(String[] args)
    {
        File archivo= new File("C:\\Users\\adjem\\Repos\\Unidad_3\\src\\main\\java\\com\\example\\unidad_3\\PD1\\numeros.txt");
        int num=0;
        try
        {
            FileReader fileReader= new FileReader(archivo);
            int n=-1;

            for(int i=1;i!=n-1;i++)
            {
                for (int j = n; j != i + 1; j++)
                {
                    num++;
                }
            }
        }catch (IOException exception)
        {
            System.out.println("ERROR");
        }
        int imp=2;
        System.out.println("Se ejecuta: "+num);
    }

}