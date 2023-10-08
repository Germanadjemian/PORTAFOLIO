package com.example.ta10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ta10Application {

    public static void main(String[] args) {
        ManejadorArchivosGenerico manejadorArchivosGenerico= new ManejadorArchivosGenerico();
        /*String[] texto= manejadorArchivosGenerico.leerArchivo("C:\\Users\\adjem\\OneDrive - Universidad Católica del Uruguay\\Algoritmos\\Unidad 3\\TA\\TA10\\src\\main\\java\\com\\example\\ta10\\suc1.txt");
        Sucursales sucursaltxt1 = new Sucursales();
        for(String ciudad:texto){
            sucursaltxt1.agregarSucursal(ciudad);
        }
        sucursaltxt1.listarSucursales();
        System.out.println(sucursaltxt1.cantidadSucursales()); //107
        sucursaltxt1.quitarSucursal("Chicago");
        sucursaltxt1.listarSucursales();
        System.out.println(sucursaltxt1.cantidadSucursales()); //Shenzen */

        /*String[] texto2= manejadorArchivosGenerico.leerArchivo("C:\\Users\\adjem\\OneDrive - Universidad Católica del Uruguay\\Algoritmos\\Unidad 3\\TA\\TA10\\src\\main\\java\\com\\example\\ta10\\suc2.txt");
        Sucursales sucursaltxt2 = new Sucursales();
        for(String ciudad:texto2){
            sucursaltxt2.agregarSucursal(ciudad);
        }
        sucursaltxt2.listarSucursales();
        sucursaltxt2.quitarSucursal("Shenzen");
        sucursaltxt2.quitarSucursal("Tokio");
        sucursaltxt2.listarSucursales(); //Ninguna de las anteriores*/

        String[] texto3= manejadorArchivosGenerico.leerArchivo("C:\\Users\\adjem\\OneDrive - Universidad Católica del Uruguay\\Algoritmos\\Unidad 3\\TA\\TA10\\src\\main\\java\\com\\example\\ta10\\suc3.txt");
        Sucursales sucursaltxt3 = new Sucursales();
        for(String ciudad:texto3){
            sucursaltxt3.agregarSucursal(ciudad);
        }
        sucursaltxt3.Imprimir(";_"); //Montreal;_Caracas;_Tulsa;_Mobile;_Vancouver;_
    }

}
/*


 */
