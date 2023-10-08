package com.example.ejercicios_java.ARBOLES;

public interface TArbol<T extends Comparable<T>> {
    void insertar(T elemento);
    void eliminar(T elemento);
    boolean buscar(T elemento);
    int altura(NodoAVL<T> nodo);
}
