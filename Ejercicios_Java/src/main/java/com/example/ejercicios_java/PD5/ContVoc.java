package com.example.ejercicios_java.PD5;

import java.util.EnumSet;

public class ContVoc
{
    public static String ContVoc(String palabra)
    {
        enum Vocales
        {A,E,I,O,U}
        enum Consonantes
        {Q,W,R,T,Y,P,S,D,F,G,H,J,K,L,Ñ,Z,X,C,V,B,N,M}
        EnumSet<Vocales> vocales= EnumSet.allOf(Vocales.class);
        String vocales1= String.valueOf(vocales);
        EnumSet<Consonantes> consonantes= EnumSet.allOf(Consonantes.class);
        String consonantes2= String.valueOf(consonantes);
        int cv=0;
        int cc=0;

        for(Vocales vocal:vocales)
        {
            System.out.println(vocal);
        }
        System.out.println(vocales1);

        for(int i=0;i<palabra.length();i++)
        {
            palabra=palabra.toUpperCase();
            if (String.valueOf(palabra.charAt(i)).equals(" ")||String.valueOf(palabra.charAt(i)).equals(","))//No entiendo porque no toma la U como verdadero a a hora de comparar en el primer if, pero luego si la toma en el string de vocales
                //Era porque en Java, la comparación de cadenas de caracteres se realiza con el método equals() en lugar del operador "==". El operador "==" compara la referencia de los objetos y no su contenido.
            {
                cc-=1;
                cv-=1;
            }
            if (vocales1.contains(String.valueOf(palabra.charAt(i))))
            {
                cv+=1;
            }
            if (consonantes2.contains(String.valueOf(palabra.charAt(i))))
            {
                cc+=1;
            }
        }
        return "Hay "+cv+" vocales y "+cc+" consonantes";
    }
    public static void main(String[] args)
    {
        String prueba= "Cua";
        System.out.println(ContVoc.ContVoc(prueba));
    }
}
