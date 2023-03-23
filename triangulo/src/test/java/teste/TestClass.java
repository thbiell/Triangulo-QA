package teste;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class TestClass {

	Triangulo tri = new Triangulo();
	@Test
	public void testeTriangulo() {
		int valor1 = 3;
		int valor2 = 2;
		int valor3 = 1;
		String resultado = tri.test(valor1,valor2, valor3);
		assertEquals("escaleno", resultado);
	}
	
	@Test
	public void testeTriangulo2() {
		int valor1 = 2;
		int valor2 = 2;
		int valor3 = 1;
		String resultado = tri.test(valor1,valor2, valor3);
		assertEquals("isoceles", resultado);
	}
	
	@Test
	public void testeTriangulo3() {
		int valor1 = 2;
		int valor2 = 2;
		int valor3 = 2;
		String resultado = tri.test(valor1,valor2, valor3);
		assertEquals("equilatero", resultado);
	}

}
