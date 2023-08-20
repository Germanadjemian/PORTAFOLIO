package com.example.ejercicios_java.PD5;

public class ToStringDemo
{
    public static void main(String[] args)
    {
        double d = 888.51;
        String s = Double.toString(d);

        /*String string= String.valueOf(d);
        System.out.println("equals: "+s.equals(string));
        boolean igual= s==string;
        System.out.println("s==string: "+igual);
        System.out.println(s+"\n"+string);*/

        int dot = s.indexOf('.');
        System.out.println(dot + " digits " +
                "before decimal point.");
        System.out.println( (s.length() - dot - 1) +
                " digits after decimal point.");

    }
}
//La salida del programa es "3 digits before decimal point.
//2 digits after decimal point."
//Esto sucede porque se imprime dot, que es el indice (en un float que transformamos a string para poder manipularlo) en el cual se encuentra el punto de la variable "s" de tipo Float y como los indices arrancan por 0 nos da 3, que es justo la cantidad de numeros que hay en la variable antes del punto (porque arranca en 0 en vez de em uno)
//Luego sucede algo parecido pero con los números que estan después, por lo cual hay que restarle uno más, ya que sino estaría contando también el punto como dígito.