package com.example.ejercicios_java.Ej2;

import com.example.ejercicios_java.Ej2.Rectangle;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect= new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}

//Antes de corregirlo la parte que se encontraba mal del código era que faltaba crear la clase Rectangle e incluso estaba mal inicializada en el main.
