package isi.died.tp.estructuras;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import isi.died.tp.dominio.Insumo;
import isi.died.tp.dominio.InsumoLiquido;

public class TestRangoABB {

	Insumo inL1= new InsumoLiquido(20);
	Insumo inL2= new InsumoLiquido(15);
	Insumo inS3= new Insumo(14);
	Insumo inS4= new Insumo(17);
	Insumo inL5= new InsumoLiquido(25);
	Insumo inL6= new InsumoLiquido(21);
	Insumo inL7= new InsumoLiquido(30);
	Insumo inL8= new InsumoLiquido(27);
	Insumo inL9= new InsumoLiquido(28);
	Insumo inL10= new InsumoLiquido(40);
	Insumo inL11 = new InsumoLiquido(31);
	
	Arbol<Insumo> abb = new ArbolBinarioBusqueda<>(inL1);
	
	ArrayList<Insumo> l1= new ArrayList<Insumo>();
	ArrayList<Insumo> l2= new ArrayList<Insumo>();
	ArrayList<Insumo> l3= new ArrayList<Insumo>();
	
	@Before
	public void antes() {
		abb.agregar(inL2);
		abb.agregar(inS3);
		abb.agregar(inS4);
		abb.agregar(inL5);
		abb.agregar(inL6);
		abb.agregar(inL7);
		abb.agregar(inL8);
		abb.agregar(inL9);
		abb.agregar(inL10);
		abb.agregar(inL11);	

		l1.add(inL1);
		l1.add(inS4);
		l1.add(inL5);
		l1.add(inL6);
		l1.add(inL8);
		l1.add(inL9);
				
		l2.add(inL1);
		l2.add(inL2);
		l2.add(inS3);
		l2.add(inS4);
		l2.add(inL5);
		l2.add(inL6);
		l2.add(inL7);
		l2.add(inL8);
		l2.add(inL9);
		l2.add(inL10);
		l2.add(inL11);
		
		l3.add(inS3);
		
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
	}
	
	
	@Test
	public void test() {
		assertEquals(l1,abb.rango(16, 28));
		assertEquals(l2,abb.rango(0, 40));
		assertEquals(l3,abb.rango(14, 14));
	}

}
