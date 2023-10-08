package com.example.ejercicios_java.Ej2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContadorPalabra1 {
    public static int ContarPalabras(String palabra)
    {
        Boolean check = Boolean.TRUE;
        int cont = 0;
        System.out.println("El total de caracteres es");
        System.out.println(palabra.length());
        for (int i = 0; i < palabra.length(); i++)
        {
            //System.out.println("es letra "+palabra.charAt(i));
            if (Character.isLetter(palabra.charAt(i)) || Character.isDigit(palabra.charAt(i)))
            {
                if (check)
                {
                    cont += 1;
                    check = Boolean.FALSE;
                }
            }
            else
            {
                check=Boolean.TRUE;
            }
        }
        return cont;
    }

    public static String ContarVocales(String palabra)
    {
        String vocales= "aeiou";
        String consonantes="qwrtypsdfghjklñzxcvbnm";
        int cv=0;
        int cc=0;
        for(int i=0;i<palabra.length();i++)
        {
            palabra=palabra.toLowerCase();
            if (vocales.contains(String.valueOf(palabra.charAt(i))))
            {
                cv+=1;
            }
            if (consonantes.contains(String.valueOf(palabra.charAt(i))))
            {
                cc+=1;
            }
        }
        return "Hay "+cv+" vocales y "+cc+" consonantes";
    }

    public static String[] palabrasComunes(String[] vector1, String[] vector2)
    {
        List<String> palabrasComunes = new ArrayList<>();
        for (String palabra : vector1)
        {
            if (Arrays.asList(vector2).contains(palabra) && !palabrasComunes.contains(palabra))
            {
                palabrasComunes.add(palabra);
            }
        }
        String[] resultado = new String[palabrasComunes.size()];
        palabrasComunes.toArray(resultado);
        return resultado;
    }


    public static void main(String[] args)
    {
        ContadorPalabra1 contador= new ContadorPalabra1();
        String prueba = "Cuantas palabras hay        aca ";
        System.out.println("Hay "+ContadorPalabra1.ContarPalabras(prueba));
        String[]Ar1={"Hola","Mundo","de","los","algoritmos"};
        String[] Ar2={"Hola","Mundo","de", "la", "informática"};
        String[] nuevoArray=contador.palabrasComunes(Ar1,Ar2);
        for(String palabra:nuevoArray){
            System.out.print(palabra+" ");
        }
    }
}
//Este main era de prueba, el ejecutable bueno es EjerciciosJavaApplication