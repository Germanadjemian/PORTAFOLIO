package com.example.ejercicios_java.PD6;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class DirectorioSucursales {
    private ArrayList<String> sucursales;

    public DirectorioSucursales() {
        this.sucursales = new ArrayList<String>();
    }

    public void cargarArchivo(String nombreArchivo) throws IOException {
        File archivo = new File(nombreArchivo);
        Scanner scanner = new Scanner(archivo);

        while (scanner.hasNextLine()) {
            String ciudad = scanner.nextLine();
            this.agregarSucursal(ciudad);
        }

        scanner.close();
    }

    public void agregarSucursal(String ciudad) {
        this.sucursales.add(ciudad);
    }

    public void buscarSucursal(String ciudad) {
        if (this.sucursales.contains(ciudad)) {
            System.out.println(ciudad + " se encuentra en el directorio de sucursales.");
        } else {
            System.out.println(ciudad + " no se encuentra en el directorio de sucursales.");
        }
    }

    public void quitarSucursal(String ciudad) {
        if (this.sucursales.contains(ciudad)) {
            this.sucursales.remove(ciudad);
            System.out.println(ciudad + " ha sido eliminada del directorio de sucursales.");
        } else {
            System.out.println(ciudad + " no se encuentra en el directorio de sucursales.");
        }
    }

    public void listarSucursales() {
        if (this.sucursales.isEmpty()) {
            System.out.println("El directorio de sucursales está vacío.");
        } else {
            System.out.println("Las sucursales en el directorio son: ");
            for (String ciudad : this.sucursales) {
                System.out.println(ciudad);
            }
        }
    }

    public int cantidadSucursales() {
        return this.sucursales.size();
    }

    public boolean estaVacio() {
        return this.sucursales.isEmpty();
    }

    public static void main(String[] args) {
        DirectorioSucursales directorio = new DirectorioSucursales();

        try {
            directorio.cargarArchivo("sucursales.txt");
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar una sucursal");
            System.out.println("2. Buscar una sucursal");
            System.out.println("3. Quitar una sucursal");
            System.out.println("4. Listar todas las sucursales");
            System.out.println("5. Indicar la cantidad de sucursales");
            System.out.println("6. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la ciudad:");
                    scanner.nextLine();
                    String ciudad = scanner.nextLine();
                    directorio.agregarSucursal(ciudad);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la ciudad a buscar:");
                    scanner.nextLine();
                    ciudad = scanner.nextLine();
                    directorio.buscarSucursal(ciudad);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre de la ciudad a quitar:");
                    scanner.nextLine();
                    ciudad = scanner.nextLine();
                    directorio.quitarSucursal(ciudad);
                    break;
            }
        }
    }
}

