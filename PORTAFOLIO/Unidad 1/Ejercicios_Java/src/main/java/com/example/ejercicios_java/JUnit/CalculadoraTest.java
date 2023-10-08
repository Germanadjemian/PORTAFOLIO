package com.example.ejercicios_java.JUnit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest
{
    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.restar(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(6, 3);
        assertEquals(2, resultado);
    }
}
