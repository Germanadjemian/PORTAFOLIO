package com.example.ejercicios_java.PD5;

public class Enumerado
{
    enum Level
    {
        EASY,
        NORMAL,
        HARD
    }
    public static void main(String[] args)
    {
        Level level= Level.EASY;
        System.out.println(level+"\n");

        for(Level nivel:Level.values())
        {
            System.out.println(nivel);
        }
        System.out.println("");
        Level[] Niveles= Level.values();  //Esto es importante para saber que EnumName.values() nos retorna una lista de los valores del enum
        for(Level nivel:Niveles)
        {
            System.out.println(nivel);
        }
    }
}
