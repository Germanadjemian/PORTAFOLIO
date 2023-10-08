package com.example.ejercicios_java.Ej2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
public class ContadorPalabras
{
    public int contarPalabras (String frase) {
        //Contar palabras
        int cont = 0;
        boolean check = false;
        for (int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if (Character.isWhitespace(c)){
                check = true;
                if (Character.isLetter(frase.charAt(i-1))){
                    cont += 1;
                    check = false;
                }
            }
        }
        System.out.println(cont+1);

        int vocals = 0;
        int consonants = 0;
        for (int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            Character.toUpperCase(c);
            String str = Character.toString(c);
            switch(str){
                case "A":
                    vocals +=1;
                    break;
                case "E":
                    vocals += 1;
                    break;
                case "I":
                    vocals += 1;
                    break;
                case "O":
                    vocals += 1;
                    break;
                case "U":
                    vocals += 1;
                    break;
                default:
                    if (str != " " & Character.isDigit(c) != true)
                    {
                        consonants += 1;
                        break;
                    }
                    break;

            }
        }
        System.out.println(vocals);
        return consonants;
    }

    public String[] obtenerLineas(String archivo){
        String lines[] = {}; //agregar tamaño
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String line;
            int cont = 0;
            while((line = br.readLine()) != null){
                lines[cont] = line;
                cont += 1;
            }
            br.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.err.format("Archivo no encontrado: %s%n" + archivo);
        } catch (IOException e){
            System.err.format("IOException: %s%n" + e);
        }
        return lines;
    }
}*/
//Recordar analizar este código para ver otras maneras posibles de hacer el contador (y ver cual es la más óptima)
