package com.example.ejercicios_java.ARBOLES;

public class NodoAVL<T extends Comparable<T>> {

    private T elemento;
    private int altura;
    private NodoAVL<T> izquierdo;
    private NodoAVL<T> derecho;

    public NodoAVL(T elemento) {
        this.elemento = elemento;
        this.altura = 0;
        this.izquierdo = null;
        this.derecho = null;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public NodoAVL<T> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoAVL<T> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoAVL<T> getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoAVL<T> derecho) {
        this.derecho = derecho;
    }
}