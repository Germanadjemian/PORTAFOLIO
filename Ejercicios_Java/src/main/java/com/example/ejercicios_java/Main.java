package com.example.ejercicios_java;

import com.example.ejercicios_java.Ej2.NumberHolder;

public class Main
{
    public static void main(String[] args)
    {
        NumberHolder objeto= new NumberHolder(); //Instancio la clase
        objeto.aFloat= 33.3f;//Luego inicializo las variables miembro
        objeto.anInt=10;
        // Y ahora imprimo
        System.out.println("anInt= "+objeto.anInt);
        System.out.println("aFloat= "+objeto.aFloat);


    }
}
