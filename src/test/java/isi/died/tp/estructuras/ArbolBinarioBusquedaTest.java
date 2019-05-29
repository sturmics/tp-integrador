package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArbolBinarioBusquedaTest {
	Arbol<Integer> abb = new ArbolBinarioBusqueda<>(25);
	
	Arbol<Integer> abb2 = new ArbolBinarioBusqueda<>(25);
	
	Arbol<Integer> abb3 = new ArbolBinarioBusqueda<>(5);
	
	@Before
	public void preTest() {
		abb.agregar(30);
		abb.agregar(20);
		abb.agregar(40);
		abb.agregar(15);
		abb.agregar(21);
		abb.agregar(29);
		
		abb2.agregar(30);
		abb2.agregar(20);
		abb2.agregar(15);
		abb2.agregar(21);
		abb2.agregar(29);
		
		abb3.agregar(4);
		
	}
	/*
	@Test
	public void testContiene() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsArbolOfE() {
		fail("Not yet implemented");
	}

	@Test
	public void testAgregar() {
		fail("Not yet implemented");
	}

	@Test
	public void testProfundidad() {
			
	}

	@Test
	public void testCuentaNodosDeNivel() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testEsCompleto() {
		//assertTrue(abb.esCompleto());
		assertTrue(abb3.esCompleto());
	}
	
	@Test
	public void testEsLleno() {
		assertTrue(abb.esLleno());
		assertFalse(abb2.esLleno());
	}

}
