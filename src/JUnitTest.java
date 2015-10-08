import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class JUnitTest {
// TESTY DLA KLASY: PrzelicznikBeauforta
	@Test
	public void testUstawAktualnaPredkosc() {
		PrzelicznikBeauforta test = new PrzelicznikBeauforta();
		double predkosc = 5.5;
		test.ustawAktualnaPredkosc(predkosc);
		assertEquals("Sprawdza ustawiona predkosc wiatru", test.ileKilometrowNaGodzine(), predkosc, 1e-15);
	}

	@Test
	public void testIleKilometrowNaGodzine() {
		PrzelicznikBeauforta test = new PrzelicznikBeauforta();
		assertEquals("Ile KM/H", (double) 0.0, test.ileKilometrowNaGodzine(), 1e-15);
	}

	@Test
	public void testIleMilMorskichNaGodzine() {
		PrzelicznikBeauforta test = new PrzelicznikBeauforta();
		test.ustawAktualnaPredkosc(5);
		assertEquals("Ile milmorskich/h", (double) 2.6997, test.ileMilMorskichNaGodzine(), 0.0001);
	}

	@Test
	public void testCzyJestCiszaNaMorzu() {
		PrzelicznikBeauforta test = new PrzelicznikBeauforta();
		test.ustawAktualnaPredkosc(2);
		assertTrue("Cisza na morzu", test.czyJestCiszaNaMorzu());
		test.ustawAktualnaPredkosc(3);
		assertFalse("Nie ma ciszy na morzu", test.czyJestCiszaNaMorzu());
	}
	
	@Test
	public void testCzyJestSztorm() {
		PrzelicznikBeauforta test = new PrzelicznikBeauforta();
		test.ustawAktualnaPredkosc(119);
		assertFalse("Nie ma sztormu (1)", test.czyJestSztorm());
		test.ustawAktualnaPredkosc(120);
		assertFalse("Nie ma sztormu (2)", test.czyJestSztorm());
		test.ustawAktualnaPredkosc(121);
		assertTrue("Jest sztorm", test.czyJestSztorm());	
	}
	
	@Test
	public void testIleWSkaliBeauforta() {
		PrzelicznikBeauforta test = new PrzelicznikBeauforta();
		assertEquals("Skala musi wyjœæ zero", 0, test.ileWSkaliBeauforta(), 1e-15);
		test.ustawAktualnaPredkosc(5);
		assertEquals("Skala beaforta", 1, test.ileWSkaliBeauforta(), 1e-15);
		test.ustawAktualnaPredkosc(300);
		assertEquals("Skala beaforta", 12, test.ileWSkaliBeauforta(), 1e-15);
	}
	
// TESTY DLA KLASY: KlasyDoZadania
	@Test
	public void testMergeTab() {
		KlasyDoZadania test = new KlasyDoZadania();
		int[] tabTEST= {1,3,5,6,2,0,10}; 
		int[] taba = {1,3,5,6};
		int[] tabb = {2,0,10};
		assertArrayEquals(tabTEST, test.MergeTab(taba, tabb));
		int[] tabc = {};
		assertArrayEquals(tabb, test.MergeTab(tabc, tabb));
		assertArrayEquals(tabb, test.MergeTab(tabb, tabc));
		assertArrayEquals(tabc, test.MergeTab(tabc, tabc));
		assertArrayEquals(tabb, test.MergeTab(tabb, tabc));
	}

}
