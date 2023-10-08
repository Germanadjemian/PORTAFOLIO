package com.example.unidad_3;

public class ListaEnlazada
{
    public Nodo primero;

    public ListaEnlazada() {
        this.primero = null;
    }

    public void agregar(String valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (this.primero == null) {
            this.primero = nuevoNodo;
        } else {
            Nodo actual = this.primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void agregarNodo(Nodo nodo,int anterior)
    {
        Nodo prueba=this.primero;
        while(nodo.siguiente!=null){
            if(nodo==prueba){
                System.out.println("Este nodo ya esta en la lista");
                return;
            }
            prueba=prueba.siguiente;
        }
        Nodo actual=this.primero;
        Nodo previo = null;
        if(0==anterior)
        {
            nodo.siguiente=this.primero;
            this.primero=nodo;
        }
        else
        {
            for (int i = 0; i < anterior; i++)
            {

                previo = actual;
                actual = actual.siguiente;

            }
            nodo.siguiente = actual;
            previo.siguiente = nodo;
        }
    }
    /*public void eliminarNodo(int lugar){
        Nodo actual=this.primero;
        Nodo previo=null;
        for (int i = 0; i < lugar; i++)
        {
            System.out.println(actual.valor);
            previo = actual;
            actual = actual.siguiente;
        }
        previo.siguiente=actual.siguiente;

    }*/

    public void eliminar(int position)
    {
        if(position==0){this.primero=this.primero.siguiente;}
        else
        {
            Nodo nodo = this.primero;
            Nodo previo = null;
            for (int i = 0; i < position; i++) {
                previo = nodo;
                nodo = nodo.siguiente;
            }
            previo.siguiente = nodo.siguiente;
        }
    }
    public void imprimir() {
        Nodo actual = this.primero;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
    }

}
