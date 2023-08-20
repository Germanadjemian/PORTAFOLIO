package com.example.ejercicios_java.ARBOLES;
/*
public class ArbolAVL<T extends Comparable<T>> implements Arbol<T> {

    private NodoAVL<T> raiz;

    public ArbolAVL() {
        raiz = null;
    }

    // Método para obtener la altura de un nodo


    public int altura(NodoAVL<T> nodo) {
        if (nodo == null) {
            return -1;
        }
        return nodo.getAltura();
    }

    // Método para obtener el factor de balanceo de un nodo
    private int factorBalanceo(NodoAVL<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        return altura(nodo.getIzquierdo()) - altura(nodo.getDerecho());
    }

    // Método para rotar a la izquierda sobre un nodo
    private NodoAVL<T> rotarIzquierda(NodoAVL<T> nodo) {
        NodoAVL<T> hijoDerecho = nodo.getDerecho();
        nodo.setDerecho(hijoDerecho.getIzquierdo());
        hijoDerecho.setIzquierdo(nodo);
        nodo.setAltura(Math.max(altura(nodo.getIzquierdo()), altura(nodo.getDerecho())) + 1);
        hijoDerecho.setAltura(Math.max(altura(hijoDerecho.getIzquierdo()), altura(hijoDerecho.getDerecho())) + 1);
        return hijoDerecho;
    }

    // Método para rotar a la derecha sobre un nodo
    private NodoAVL<T> rotarDerecha(NodoAVL<T> nodo) {
        NodoAVL<T> hijoIzquierdo = nodo.getIzquierdo();
        nodo.setIzquierdo(hijoIzquierdo.getDerecho());
        hijoIzquierdo.setDerecho(nodo);
        nodo.setAltura(Math.max(altura(nodo.getIzquierdo()), altura(nodo.getDerecho())) + 1);
        hijoIzquierdo.setAltura(Math.max(altura(hijoIzquierdo.getIzquierdo()), altura(hijoIzquierdo.getDerecho())) + 1);
        return hijoIzquierdo;
    }

    // Método para rotar a la izquierda y luego a la derecha sobre un nodo
    private NodoAVL<T> rotarIzquierdaDerecha(NodoAVL<T> nodo) {
        nodo.setIzquierdo(rotarIzquierda(nodo.getIzquierdo()));
        return rotarDerecha(nodo);
    }

    // Método para rotar a la derecha y luego a la izquierda sobre un nodo
    private NodoAVL<T> rotarDerechaIzquierda(NodoAVL<T> nodo) {
        nodo.setDerecho(rotarDerecha(nodo.getDerecho()));
        return rotarIzquierda(nodo);
    }

    // Método para insertar un elemento en el árbol
    public void insertar(T elemento) {
        raiz = insertar(raiz, elemento);
    }

    // Método recursivo para insertar un elemento en el árbol
    private NodoAVL<T> insertar(NodoAVL<T> nodo, T elemento) {
        if (nodo == null) {
            return new NodoAVL<T>(elemento);
        }

        if (elemento.compareTo(nodo.getElemento()) < 0) {
            nodo.setIzquierdo(insertar(nodo.getIzquierdo(), elemento));
        } else if (elemento.compareTo(nodo.getElemento()) > 0) {
            nodo.setDerecho(insertar(nodo.getDerecho(), elemento));
        } else {
            // El elemento ya existe en el árbol
            return nodo;
        }

        // Actualizar la altura del nodo actual
        nodo.setAltura(Math.max(altura(nodo.getIzquierdo()), altura(nodo.getDerecho())) + 1);

        // Calcular el factor de balanceo del nodo actual
        int factorBalanceo = factorBalanceo(nodo);

        // Balancear el árbol si es necesario
        if (factorBalanceo > 1 && elemento.compareTo(nodo.getIzquierdo().getElemento()) < 0) {
            // Rotación simple a la derecha
            return rotarDerecha(nodo);
        } else if (factorBalanceo < -1 && elemento.compareTo(nodo.getDerecho().getElemento()) > 0) {
            // Rotación simple a la izquierda
            return rotarIzquierda(nodo);
        } else if (factorBalanceo > 1 && elemento.compareTo(nodo.getIzquierdo().getElemento()) > 0) {
            // Rotación doble a la derecha
            return rotarIzquierdaDerecha(nodo);
        } else if (factorBalanceo < -1 && elemento.compareTo(nodo.getDerecho().getElemento()) < 0) {
            // Rotación doble a la izquierda
            return rotarDerechaIzquierda(nodo);
        }

        // El nodo actual está balanceado
        return nodo;
    }

    public boolean buscar(T elemento) {
        return buscar(raiz, elemento);
    }



    // Método recursivo para buscar un elemento en el árbol
    private boolean buscar(NodoAVL<T> nodo, T elemento) {
        if (nodo == null) {
            return false;
        }

        if (elemento.compareTo(nodo.getElemento()) < 0) {
            return buscar(nodo.getIzquierdo(), elemento);
        } else if (elemento.compareTo(nodo.getElemento()) > 0) {
            return buscar(nodo.getDerecho(), elemento);
        } else {
            return true;
        }
    }

    private NodoAVL<T> obtenerSucesor(NodoAVL<T> nodo) {
        if (nodo == null) {
            return null;
        }
        NodoAVL<T> actual = nodo.getDerecho();
        while (actual != null && actual.getIzquierdo() != null) {
            actual = actual.getIzquierdo();
        }
        return actual;
    }

    // Método para eliminar un elemento del árbol
    public void eliminar(T elemento) {
        raiz = eliminar(raiz, elemento);
    }

    // Método recursivo para eliminar un elemento del árbol
    private NodoAVL<T> eliminar(NodoAVL<T> nodo, T elemento) {
        if (nodo == null) {
            return null;
        }

        if (elemento.compareTo(nodo.getElemento()) < 0) {
            nodo.setIzquierdo(eliminar(nodo.getIzquierdo(), elemento));
        } else if (elemento.compareTo(nodo.getElemento()) > 0) {
            nodo.setDerecho(eliminar(nodo.getDerecho(), elemento));
        } else {
            // El elemento es el que queremos eliminar

            // Caso 1: El nodo es una hoja
            if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) {
                return null;
            }

            // Caso 2: El nodo tiene un hijo
            if (nodo.getIzquierdo() == null) {
                return nodo.getDerecho();
            } else if (nodo.getDerecho() == null) {
                return nodo.getIzquierdo();
            }

            // Caso 3: El nodo tiene dos hijos
            NodoAVL<T> sucesor = obtenerSucesor(nodo.getDerecho());
            nodo.setElemento(sucesor.getElemento());
            nodo.setDerecho(eliminar(nodo.getDerecho(), sucesor.getElemento()));
        }

        // Actualizar la altura del nodo actual
        nodo.setAltura(Math.max(altura(nodo.getIzquierdo()), altura(nodo.getDerecho())) + 1);

        // Calcular el factor de balanceo del nodo actual
        int factorBalanceo = factorBalanceo(nodo);

        // Balancear el árbol si es necesario
        if (factorBalanceo > 1 && factorBalanceo(nodo.getIzquierdo()) >= 0) {
            // Rotación simple a la derecha
            return rotarDerecha(nodo);
        } else if (factorBalanceo > 1 && factorBalanceo(nodo.getIzquierdo()) < 0) {
            // Rotación doble a la derecha
            return rotarIzquierdaDerecha(nodo);
        } else if (factorBalanceo < -1 && factorBalanceo(nodo.getDerecho()) <= 0) {
            // Rotación simple a la izquierda
            return rotarIzquierda(nodo);
        } else if (factorBalanceo < -1 && factorBalanceo(nodo.getDerecho()) > 0) {
            // Rotación doble a la izquierda
            return rotarDerechaIzquierda(nodo);
        }
        return nodo;
    }

    public void inorder() {
        inorder(raiz);
    }

    private void inorder(NodoAVL<T> nodo) {
        if (nodo != null) {
            inorder(nodo.getIzquierdo());
            System.out.print(nodo.getElemento() + " ");
            inorder(nodo.getDerecho());
        }
    }

    public void preorder() {
        preorder(raiz);
    }

    private void preorder(NodoAVL<T> nodo) {
        if (nodo != null) {
            System.out.print(nodo.getElemento() + " ");
            preorder(nodo.getIzquierdo());
            preorder(nodo.getDerecho());
        }
    }

    public void postorder() {
        postorder(raiz);
    }

    private void postorder(NodoAVL<T> nodo) {
        if (nodo != null) {
            postorder(nodo.getIzquierdo());
            postorder(nodo.getDerecho());
            System.out.print(nodo.getElemento() + " ");
        }
    }

}
*/