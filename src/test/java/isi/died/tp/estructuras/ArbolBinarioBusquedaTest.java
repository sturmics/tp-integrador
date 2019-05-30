package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArbolBinarioBusquedaTest {
	Arbol<Integer> abb = new ArbolBinarioBusqueda<>(25);
	
	Arbol<Integer> abb2 = new ArbolBinarioBusqueda<>(25);
	
	Arbol<Integer> abb3 = new ArbolBinarioBusqueda<>(5);
	
	Arbol<Integer> abb4 = new ArbolBinarioBusqueda<>(5);
	
	Arbol<Integer> abb5 = new ArbolBinarioBusqueda<>(5);
	
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
		
		abb5.agregar(30);
		abb5.agregar(20);
		abb5.agregar(40);
		abb5.agregar(15);
		abb5.agregar(21);
		
	}
	
	@Test
	public void testContiene() {
		assertEquals(true,abb.contiene(25));
		assertEquals(false,abb.contiene(5));
		assertEquals(true,abb.contiene(30));
		assertEquals(true,abb3.contiene(4));
	}
	
	@Test
	public void testEqualsArbolOfE() {
		assertEquals(true,abb.equals(abb));
		assertEquals(false,abb.equals(abb2));
	}
	
	@Test
	public void testProfundidad(){
		assertEquals(2,abb.profundidad());
		assertEquals(1,abb3.profundidad());
		assertEquals(0,abb4.profundidad());
	}

	@Test
	public void testCuentaNodosDeNivel() {
		assertEquals(1,abb3.cuentaNodosDeNivel(0));
		assertEquals(1,abb3.cuentaNodosDeNivel(1));
		assertEquals(4,abb.cuentaNodosDeNivel(2));
		assertEquals(3,abb2.cuentaNodosDeNivel(2));
	}
	
	@Test
	public void testEsCompleto() {
		assertEquals(true,abb.esCompleto());
		assertEquals(true,abb2.esCompleto());
		assertEquals(true,abb3.esCompleto());
		assertEquals(true,abb4.esCompleto());
		assertEquals(false,abb5.esCompleto());
	}
	
	@Test
	public void testEsLleno() {
		assertEquals(true,abb.esLleno());
		assertEquals(false,abb2.esLleno());
		assertEquals(false,abb3.esLleno());
		assertEquals(true,abb4.esLleno());
	}

}
