package Paquete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	private int value1;
	private int value2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
		value1=8;
		value2=2;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
		value1=0;
		value2=0;
	}
	
	@Test
	void testSuma() {
		System.out.println("///Suma///");
		int expected=10;
		int actual=Calculadora.suma(value1,value2);
		assertEquals(expected, actual);
	}

	@Test
	void testResta() {
		System.out.println("///Resta///");
		int expected=6;
		int actual=Calculadora.resta(value1,value2);
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplica() {
		System.out.println("///Multiplicacion///");
		int expected=16;
		int actual=Calculadora.multiplica(value1,value2);
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		System.out.println("///Division///");
		int expected=4;
		int actual=Calculadora.divide(value1,value2);
		assertEquals(expected, actual);

	}

	@Test
	void testDividePorCero() {
		System.out.println("///Division por 0///");
		int expected=-1;
		int actual=Calculadora.divide(value1,0);
		assertEquals(expected, actual);
	}
}
