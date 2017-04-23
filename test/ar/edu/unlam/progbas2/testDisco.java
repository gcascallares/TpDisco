package ar.edu.unlam.progbas2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testDisco {

	@Test
	public void testCalcularPerimetroInterior() {
		Disco miDisco1 = new Disco(5d,10d);
		Double perimetroInterior;
		perimetroInterior = miDisco1.calcularPerimetroInterir();
		assertEquals(31.41,perimetroInterior,0.01);
	}
	
	@Test
	public void testCalcularPerimetroExterior() {
		Disco miDisco2 = new Disco(5d,10d);
		Double perimetroExterior;
		perimetroExterior = miDisco2.calcularPerimetroExterior();
		assertEquals(62.83,perimetroExterior,0.01);
	}
	
	@Test
	public void testCalcularSuperficie(){
		Disco miDisco3 = new Disco(5d,10d);
		Double superficie;
		superficie = miDisco3.calcularSuperficie();
		assertEquals(235.62,superficie,0.01);
	}

}
