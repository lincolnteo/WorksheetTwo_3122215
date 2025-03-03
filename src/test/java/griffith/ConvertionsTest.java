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
		String str = "1234";
		String str1 = "-12345";
		String str2 = "";
		assertEquals(1234,con.stringToInteger(str));
		assertEquals(-12345,con.stringToInteger(str1));
		assertEquals(404,con.stringToInteger(str2));
	}

	@Test
	void integerToString() {
		int str = 1234;
		int str1 = -12345;
		int str2 = 0;
		assertEquals("1234",con.integerToString(str));
		assertEquals("-12345",con.integerToString(str1));
		assertEquals("Error",con.integerToString(str2));

	}

	@Test
	void switchCase() {
		String str = "is";
		String str1 = "IT";
		String str2 = "working";
		String str3 = "123465";
		assertEquals("IS",con.switchCase(str));
		assertEquals("it",con.switchCase(str1));
		assertEquals("WORKING",con.switchCase(str2));
		assertEquals("Error",con.switchCase(str3));
	}
}