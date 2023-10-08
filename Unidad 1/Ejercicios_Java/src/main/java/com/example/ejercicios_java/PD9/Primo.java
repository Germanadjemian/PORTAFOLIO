package com.example.ejercicios_java.PD9;

public class Primo {

    public static void isPrime(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) {
                prime = false;
                break;
            }
        if (( n%2 !=0 && prime && n > 2) || n == 2) {
            prime= true;
        } else {
            prime= false;
        }
        if (prime)
        {
            int cont=0;
            int par = 2;
            while (par<=n)
            {
                cont += par;
                par+=2;
            }
            System.out.println("La suma total de los números pares es:"+cont);
        }
        else
        {
            int cont=0;
            int impar = 1;
            while (impar<=n)
            {
                cont += impar;
                impar+=2;
            }
            System.out.println("La suma total de los números impares es:"+cont);
        }
    }
}
