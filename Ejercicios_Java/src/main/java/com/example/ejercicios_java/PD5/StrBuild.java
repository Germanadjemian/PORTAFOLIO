package com.example.ejercicios_java.PD5;

public class StrBuild {
    public static void main(String[] args) {
        StringBuilder string1 = new StringBuilder();//Constructor del StringBuilder
        System.out.println(string1);
        string1.append("Hola  Mundo");//Usando append
        System.out.println(string1);
        StringBuilder sb = new StringBuilder("maldito");
        string1.insert(5, sb);//Usando Insert para modificar string1
        System.out.println(string1);
        string1.setLength(7);
        System.out.println(string1);
        sb.ensureCapacity(24);
        System.out.println(sb.capacity()); //Este metodo no lo entendi tanto, queda a revisar
        string1.delete(5, 11);
        System.out.println(string1);
        sb.deleteCharAt(4);
        System.out.println(sb);
        string1.reverse();
        System.out.println(string1);
        StringBuilder sb2 = new StringBuilder("Able was I ere I saw Elba");
        System.out.println("La capacidad del stringBuilder-sb2 es: " + sb2.capacity());
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println("La expresión hannah.length muestra: " + hannah.length());
        System.out.println("Y el método hannah.charAt(12) retorna el valor: " + hannah.charAt(12) + " mientras que para la letra b sería (hannah.charAt(15))= " + hannah.charAt(15));
        //Ejercicio 10
        // La siguiente expresión "Was it a car or a cat I saw?".substring(9, 12) devuelve "car"
        //Ejercicio 11
        /*
        public class ComputeResult {
public static void main(String[] args) {
String original = "este es el curso de Programación 2";
StringBuilder result = new StringBuilder("hola");
int index = original.indexOf('a');
/1/ result.setCharAt(0, original.charAt(0));
/2/ result.setCharAt(1, original.charAt(original.length()-1));
/3/ result.insert(1, original.charAt(4));
/4/ result.append(original.substring(1,4));
/5/ result.insert(3, (original.substring(index, index+2) + " "));
System.out.println(result);
}
}

Después de la ejecución de cada línea numerada, el valor de result será:

1-"eola"
2-"eaoa"
3-"eholaaoa"
4-"eholaa"
5-"ehoeslaaoa"
    }*/
    }
}