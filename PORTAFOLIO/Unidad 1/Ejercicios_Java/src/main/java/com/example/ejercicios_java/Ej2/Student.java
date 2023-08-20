package com.example.ejercicios_java.Ej2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Student
{
    public static void main(String[] args)
    {
        String[] students = new String[10];
        String studentName = "Peter Parker";

        students[0] = studentName;
        studentName = "Nuevo valor";
        System.out.println(students+"   este es tu objeto");
        System.out.println(students[0]);

    }
}
//Luego de ejecutar el código podemos darnos cuenta de que se imprime Peter Parker, lo cual
//quiere decir que todavía students[0] sigue haciendo referncia a este y por ende ninún objeto es candidato a ser
//eliminado por el Garbage Collector ya que todos son aún utilizables dado que tienen al menos una raíz o referencia.
//El Garbage Collector solo eliminara aquellos objetos en la memoria que no mantegan ninguna referncia o raíz para ser invocados/llamados/referenciados.

