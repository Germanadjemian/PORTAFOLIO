package com.example.ejercicios_java.PD10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Este ejercicio esta hecho en la clase "ContadorPalabras1" que era donde de pedía que se implementara el método
(la clase que usamos apra el contador de palabras) aún así aca dejo copiado el método concreto que se pedía copiado de dicha clase

Aca les dejo una descripción de lo que hace:
Este método recibe dos vectores de palabras como parámetros y
devuelve un nuevo vector que contiene solamente las palabras que se encuentran en ambos vectores de entrada.

El método recorre el primer vector de palabras utilizando un bucle for y comprueba si cada palabra está presente en el segundo
vector utilizando el método contains de la clase Arrays. Si una palabra se encuentra en ambos vectores y aún no ha sido añadida
 al vector de palabras comunes, se añade a una lista. Al final, se crea un nuevo vector que contiene todas las palabras de la
 lista y se devuelve como resultado.
 */
public class Ej10 {
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
}
