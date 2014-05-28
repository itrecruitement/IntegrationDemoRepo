package edu.esprit.integration.demo;



import org.junit.Before;



import org.junit.Test;

import edu.esprit.integration.demo.services.CalculatorService;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	
	CalculatorService f;
		int a;
		int b;
		@Before
		public void setUp() throws Exception {
			f= new  CalculatorService();
		}

		

		@Test
		public void sommationTest() {
			
			assertEquals(1, f.sommation(a, b));
		}

		@Test
		public void soustractionTest() {
			
			assertEquals(1, f.soustraction(a, b));
		}
		
		@Test
		public void produitTest() {
			
			assertEquals(1, f.produit(a, b));
		}
		
		@Test
		public void divisionTest() {
			
			assertEquals(1, f.division(a, b));
		}
}
