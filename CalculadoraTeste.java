package br.com.fiap.prod;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {

	/**
	 * 
	 * Teste de somar na Calculadora.
	 * 
	 */

	@Test
	public void testeSomar5com5() {

		int nro1 = 5;

		int nro2 = 5;

		Calculadora calc = new Calculadora();

		int resultadoEsperado = 10;

		int resultadoReal = calc.somar(nro1, nro2);

		assertEquals(resultadoEsperado, resultadoReal);

	}
	@Test
	public void testeSomar5com3() {

		int nro1 = 5;

		int nro2 = 3;

		Calculadora calc = new Calculadora();

		int resultadoEsperado = 8;

		int resultadoReal = calc.somar(nro1, nro2);

		assertEquals(resultadoEsperado, resultadoReal);

	}

	/**
	 * 
	 * Teste de subtrair na Calculadora.
	 * 
	 */

	@Test
	public void testeSubtrair5com3() {

		int nro1 = 5;

		int nro2 = 3;

		Calculadora calc = new Calculadora();

		int resultadoEsperado = 2;

		int resultadoReal = calc.subtrair(nro1, nro2);

		assertEquals(resultadoEsperado, resultadoReal);

	}

	/**
	 * 
	 * Teste de multiplicar na Calculadora.
	 * 
	 */

	@Test
	public void testeMultiplicar3por3() {

		int nro1 = 3;

		int nro2 = 3;

		Calculadora calc = new Calculadora();

		int resultadoEsperado = 9;

		int resultadoReal = calc.multiplicar(nro1, nro2);

		assertEquals(resultadoEsperado, resultadoReal);

	}

	/**
	 * 
	 * Teste de dividir na Calculadora.
	 * 
	 */

	@Test
	public void testeDividir3por2() {

		int nro1 = 3;

		int nro2 = 2;

		Calculadora calc = new Calculadora();

		double resultadoEsperado = 1.5;

		double resultadoReal = calc.dividir(nro1, nro2);

		assertEquals(resultadoEsperado, resultadoReal, 0.5);

	}

}