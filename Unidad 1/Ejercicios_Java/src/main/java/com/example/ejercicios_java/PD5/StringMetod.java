package com.example.ejercicios_java.PD5;

public class StringMetod
{
    public static void main(String[] args) {
        // Ejemplo de uso de todos los métodos de la clase String

        // substring
        String cadena1 = "Hola mundo";
        String subcadena1 = cadena1.substring(2, 6);
        System.out.println(subcadena1); // imprime "la m"

        // split
        String cadena2 = "Esta es una cadena de texto";
        String[] partes = cadena2.split(" ");
        for (String parte : partes) {
            System.out.println(parte); // imprime cada palabra en una línea separada
        }

        // subSequence
        String cadena3 = "Esta es otra cadena";
        CharSequence subsecuencia1 = cadena3.subSequence(5, 8);
        System.out.println(subsecuencia1); // imprime "es "

        // trim
        String cadena4 = "    cadena con espacios al inicio y al final     ";
        String cadenaSinEspacios = cadena4.trim();
        System.out.println(cadenaSinEspacios); // imprime "cadena con espacios al inicio y al final"

        // toLowerCase
        String cadena5 = "TEXTO EN MAYÚSCULAS";
        String cadenaEnMinusculas = cadena5.toLowerCase();
        System.out.println(cadenaEnMinusculas); // imprime "texto en mayúsculas"

        // toUpperCase
        String cadena6 = "texto en minúsculas";
        String cadenaEnMayusculas = cadena6.toUpperCase();
        System.out.println(cadenaEnMayusculas); // imprime "TEXTO EN MINÚSCULAS"

        // indexOf
        String cadena7 = "Hola mundo";
        int indice1 = cadena7.indexOf("m");
        System.out.println(indice1); // imprime "4"

        // lastIndexOf
        String cadena8 = "Hola mundo";
        int ultimoIndice = cadena8.lastIndexOf("o");
        System.out.println(ultimoIndice); // imprime "7"

        // contains
        String cadena9 = "Esta es una cadena de texto";
        boolean contiene = cadena9.contains("texto");
        System.out.println(contiene); // imprime "true"

        // replace
        String cadena10 = "Java es un lenguaje de programación";
        String nuevaCadena10 = cadena10.replace("lenguaje", "herramienta");
        System.out.println(nuevaCadena10); // imprime "Java es un herramienta de programación"

        // replaceAll
        String cadena11 = "Java es un lenguaje de programación";
        String nuevaCadena11 = cadena11.replaceAll("[aeiou]", "");
        System.out.println(nuevaCadena11); // imprime "Jv s n lngj d prgrmcón"

        // replaceFirst
        String cadena12 = "Java es un lenguaje de programación";
        String nuevaCadena12 = cadena12.replaceFirst("a", "e");
        System.out.println(nuevaCadena12); // imprime "Jeva es un lenguaje de programación"
    }
}
//No puse contains porque ya se ve como lo usamos repetidas veces en ejercicios anteriores