package com.example.ejercicios_java.ARBOLES;

public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
        } else {
            if (valor < nodo.getValor()) {
                nodo.setHijoIzquierdo(insertarRecursivo(nodo.getHijoIzquierdo(), valor));
            } else {
                nodo.setHijoDerecho(insertarRecursivo(nodo.getHijoDerecho(), valor));
            }
        }
        return nodo;
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return false;
        }

        if (valor == nodo.getValor()) {
            return true;
        }

        if (valor < nodo.getValor()) {
            return buscarRecursivo(nodo.getHijoIzquierdo(), valor);
        } else {
            return buscarRecursivo(nodo.getHijoDerecho(), valor);
        }
    }

    // Otros métodos para recorridos, eliminación, etc.
}