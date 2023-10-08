package com.example.ta10;

import java.util.LinkedList;
import java.util.List;

public class Sucursales extends LinkedList {

    LinkedList<String> list= new LinkedList<>();
    String stringLista = "";


    public void agregarSucursal(String ciudad){
        list.add(ciudad);
    }
    public boolean buscarSucursal(String ciudad){
        int var=list.indexOf(ciudad);
        return var != -1;

    }
    public void quitarSucursal(String ciudad){
        list.remove(ciudad);
        System.out.println("La sucursal de la ciudad "+ciudad+" se ha quitado");
    }
    public void listarSucursales(){
        int cant=list.size();
        for (int i = 0; i<cant; i++){
            System.out.println(list.get(i));
        }
    }


    public int cantidadSucursales(){
        return list.size();
    }
    public boolean estaVacia(){
        return list.isEmpty();
    }


    public void Imprimir(String espacios){
        int cant=list.size();
        for (int i = 0; i<cant; i++){
            stringLista += list.get(i) + espacios;
        }
        System.out.println(stringLista);
    }
}


