package griffith;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ConvertionsTest {
	Convertions con = new Convertions();
	@Test
	void euroToDollar() {
		double eur = 100;
		double eur1 = 200;
		double eur2 = 0;
		assertEquals(120,con.euroToDollar(eur));
		assertEquals(240,con.euroToDollar(eur1));
		assertEquals(404,con.euroToDollar(eur2));
	}

	@Test
	void dollarToEuro() {
		double dol = 100;
		double dol1 = 200;
		double dol2 = 0;
		assertEquals(80,con.dollarToEuro(dol));
		assertEquals(160,con.dollarToEuro(dol1));
		assertEquals(404,con.dollarToEuro(dol2));

	}

	@Test
	void stringToInteger() {
	}

	@Test
	void integerToString() {
	}

	@Test
	void switchCase() {
	}
}