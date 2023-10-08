package com.example.ejercicios_java.MatrizTemp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrizTemp
{

public static List<Integer> Horas= new ArrayList<>();
public static List<List<Integer>> Temp2= new ArrayList<>(7);
public static void PromedioHoras(){ System.out.println(Temp2.toString());}
public static void PromedioDias()

{
    List<Integer> dias= new ArrayList<>();
    for(List<Integer> dia:Temp2)
    {
        int TempDia= 0;
        for(int hora:dia)
        {
            TempDia+=hora;
        }
        TempDia=TempDia/24;
        dias.add(TempDia);

    }
    System.out.println(dias.toString());
}

public static boolean HayNegativos()
    {
        for (List<Integer> dia:Temp2){for(int hora:dia){if(hora<0){return false;}}}
        return true;
    }


    public static void main(String[] args)
    {

        for(Integer i=1;i<=24;i++)
        {
            Horas.add(i);
        }
        for(Integer i=1;i<=7;i++)
        {
            Temp2.add(Horas);
        }
       PromedioHoras();
        System.out.println();
        PromedioDias();
        System.out.println(HayNegativos());
        //Temp2.remove(7); //NO PUEDO HACER ESTO YA QUE EN UNA ARRAYLIST NO SE PUEDE ELIMINAR(NO ES COMO LIST), SOLO AGREGAR ELEMENTOS
        Temp2.add(Arrays.asList(1,2,-4,-7));
        System.out.println(HayNegativos());

    }
}


