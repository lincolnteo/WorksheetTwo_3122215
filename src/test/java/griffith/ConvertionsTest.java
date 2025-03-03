package griffith;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ConvertionsTest {

	@Test
	void euroToDollar() {
		Convertions con = new Convertions();
		double eur = 100;
		double eur1 = 200;
		double eur2 = 0;
		assertEquals(120,con.euroToDollar(eur));
		assertEquals(240,con.euroToDollar(eur1));
		assertEquals(404,con.euroToDollar(eur2));
	}

	@Test
	void dollarToEuro() {
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