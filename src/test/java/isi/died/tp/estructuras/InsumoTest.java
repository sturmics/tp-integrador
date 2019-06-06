package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import org.junit.Test;
import isi.died.tp.dominio.Insumo;
import isi.died.tp.dominio.InsumoLiquido;
import isi.died.tp.dominio.UnidadMedida;

public class InsumoTest {

	Insumo inL1 = new InsumoLiquido(1,"Oxigeno","A",1,1141,1,100,true,UnidadMedida.L);
	Insumo inL2= new InsumoLiquido(1,"Agua","B",1,997,2,50,true,UnidadMedida.L);
	
	Insumo inS1 = new Insumo(1,"Notebooks","A",21,1.2,10000,true,UnidadMedida.UNIDAD);
	Insumo inS2= new Insumo(1,"Papas","B",300,50,250,true,UnidadMedida.KG);
	
	@Test
	public void compareToTest() {
		assertEquals(0,inL1.compareTo(inL2));
		assertEquals(-1,inL1.compareTo(inS1));
		assertEquals(1,inS1.compareTo(inL2));
	}
	
	@Test
	public void pesoPorStockTest() {
		assertEquals(1141,inL1.pesoPorStock(),0);
		assertEquals(1994,inL2.pesoPorStock(),0);
		assertEquals(25.2,inS1.pesoPorStock(),0);
		assertEquals(15000,inS2.pesoPorStock(),0);
	}

}
