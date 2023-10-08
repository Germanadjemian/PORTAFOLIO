package com.example.ejercicios_java.Ej2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Student3 {
    public static void main(String[] args) {
        String[] students = new String[10];
        String studentName = "Peter Parker";
        for(int i=0;i<students.length;i++)
        {
            students[i]=String.valueOf(i);
        }
        String[]student2={"ELEMENTO1","ELEMENTO2","ELEMENTO3"};
        String listaa= String.join(",",student2);
       // List<String> students2 = List.of(new String[Integer.parseInt("10")]);  Preguntar
        //students[0] = studentName;
        //studentName = null;
        System.out.println(students+" este es tu objeto o mejor dicho la dirección");
        int x=0;
        for(String string:students)
        {
            x+=1;
         System.out.println((string));
        }
        System.out.println(x+" Es la cantidad de objetos en tu lista (del 0 al 9");

        students[1]="Testeando el lenguaje "+students.length;
        System.out.println(students[1]);
        System.out.println(listaa);
        for(String elemento:student2)
        {
            System.out.print(elemento+", ");
        }
    }
}
