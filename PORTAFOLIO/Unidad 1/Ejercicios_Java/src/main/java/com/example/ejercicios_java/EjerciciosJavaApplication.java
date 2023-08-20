package com.example.ejercicios_java;

import com.example.ejercicios_java.Ej2.ContadorPalabra1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjerciciosJavaApplication {

    public static void baffle () {
        System.out.print ("pac");
        ping ();
    }
    public static void ping () {
        System.out.println (".");
    }
    public static void zoop () {
        baffle ();
        System.out.print ("Vos zacata ");
        baffle ();
    }
    public static int Multisuma(int a,int b, int c)
    {
        int d=a*b+c;
        return d;
    }
    public static void main(String[] args) {
        SpringApplication.run(EjerciciosJavaApplication.class, args);
        System.out.println("Hola Mundo me llamo Ger\n");
        System.out.print ("No, yo ");
        zoop ();
        System.out.print ("Yo ");
        baffle ();
        System.out.println("La Multisuma de 1*2+3 es:"+Multisuma(1,2,3));
        String prueba= " Cuantas palabras hay  aca";
        System.out.println("Hay "+ ContadorPalabra1.ContarPalabras(prueba)+" PALABRAS");
        System.out.println(ContadorPalabra1.ContarVocales(prueba));

    }


}
