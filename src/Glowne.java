
/**
 * Zadanie 1
 * Klasa z jedn¹ metod¹ która przyjmuje referencje na dwie tablice (o nazwie: "a" i "b") 
 * zwraca referencje na tablice. Metoda tworzy now¹ tablicê i przepisuje do niej 
 * elementy tablicy, do której referuje "a". Nastêpnie dopisuje do niej elementy tablicy 
 * do której referuje "b".
 * Je¿eli "a" ma elementy: [1, 2, 3], a "b" ma elementy [8, 9] to wynikowa tablica 
 * (która jest póŸniej zwracana z metody) ma elementy [1, 2, 3, 8, 9].
 */

/**
 * Zadanie 2
 * Do twojej firmy informatycznej przyszed³ pijany pirat:
 * "Yo ho!"- krzyczy od progu.
 * "Witam Pana" - odpowiadasz grzecznie.
 * Mimo wyraŸnej woni taniego rumu w jego oddechu, postanawiasz go wys³uchaæ. 
 * Okazuje siê, ¿e nie uczy³ siê w szkole najlepiej i nie potrafi sobie poradziæ 
 * z przeliczaniem prêdkoœci wiatru. Intuicyjnie rozumie skalê Beauforta, 
 * ale czasami komunikaty radiowe o pogodzie nadaj¹ prêdkoœæ wiatru w milach morskich na godzinê, 
 * a innym razem w kilometrach na godzinê. Pirat kupi³ sobie tablet i potrzebuje programu który 
 * bêdzie mu przelicza³ prêdkoœæ wiatru na ró¿ne jednostki.  
 */

/**
 * Zadanie 3
 * Testy za pomoc¹ JUnit do zadania 1-2.
 */

public class Glowne {

	public static void main(String[] args) 
	{
		// Zadanie 1
		KlasyDoZadania z1 = new KlasyDoZadania();
		int[] a = {1,1,1,1};
		int[] b = {2,2,2,3};
		int[] tabc = z1.MergeTab(a, b);
		for(int i=0; i<tabc.length;i++) //wypisanie tablicy tabc
		{
			System.out.print(tabc[i] + ", ");
		}
		
		System.out.println(); //kolejny wiersz
		System.out.println();
		
		// Zadanie 2
		PrzelicznikBeauforta z2 = new PrzelicznikBeauforta();
		z2.ustawAktualnaPredkosc(5);
		z2.ileKilometrowNaGodzine();
		z2.czyJestCiszaNaMorzu();
	}
}
