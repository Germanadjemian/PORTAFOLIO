package com.example.unidad_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar("Hola");
        lista.agregar("Mundo");
        lista.agregar("de Algoritmos\n");
        lista.imprimir(); // salida: Hola Mundo de Algoritmos
        ListaEnlazada lista2= new ListaEnlazada();
        lista2.agregar("1");lista2.agregar("2");lista2.agregar("3");lista2.agregar("4");//ESTA ES LA LISTA ORIGINAL 1234
        lista2.imprimir();
        System.out.println("");
        Nodo nodo= new Nodo("5");//nuevo nodo de prueba
        nodo.siguiente=lista2.primero;//asigno manualmente el primer nodo de la lista al nodo del nuevo nodo para probar (en realidad habria que usar setters y getters)
        lista2.primero=nodo;// ahora hago lo mismo pero al rves, con la lista
        lista2.imprimir();
        System.out.println();
        Nodo nuevonodo=new Nodo("6"); //ACA EMPIEZA EL EJERCICIO BIEN HECHO
        lista2.agregarNodo(nuevonodo,0);//asigno el nuevonodo a la primera posicion, antesq la nada (0)
        lista2.imprimir();
        System.out.println();
        Nodo nuevonodo2=new Nodo("7");
        lista2.agregarNodo(nuevonodo2,3);
        lista2.imprimir();
        lista2.agregarNodo(nuevonodo,5);
        System.out.println();
        lista2.imprimir();
        System.out.println();
        lista2.eliminar(3);
        lista2.imprimir();

        /*System.out.println("");
        lista2.eliminarNodo(4);
        lista2.imprimir();*/

    }
}
