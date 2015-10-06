
/**
 * Zadanie 1
 * Klasa z jedn� metod� kt�ra przyjmuje referencje na dwie tablice (o nazwie: "a" i "b") 
 * zwraca referencje na tablice. Metoda tworzy now� tablic� i przepisuje do niej 
 * elementy tablicy, do kt�rej referuje "a". Nast�pnie dopisuje do niej elementy tablicy 
 * do kt�rej referuje "b".
 * Je�eli "a" ma elementy: [1, 2, 3], a "b" ma elementy [8, 9] to wynikowa tablica 
 * (kt�ra jest p�niej zwracana z metody) ma elementy [1, 2, 3, 8, 9].
 */

/**
 * Zadanie 2
 * Do twojej firmy informatycznej przyszed� pijany pirat:
 * "Yo ho!"- krzyczy od progu.
 * "Witam Pana" - odpowiadasz grzecznie.
 * Mimo wyra�nej woni taniego rumu w jego oddechu, postanawiasz go wys�ucha�. 
 * Okazuje si�, �e nie uczy� si� w szkole najlepiej i nie potrafi sobie poradzi� 
 * z przeliczaniem pr�dko�ci wiatru. Intuicyjnie rozumie skal� Beauforta, 
 * ale czasami komunikaty radiowe o pogodzie nadaj� pr�dko�� wiatru w milach morskich na godzin�, 
 * a innym razem w kilometrach na godzin�. Pirat kupi� sobie tablet i potrzebuje programu kt�ry 
 * b�dzie mu przelicza� pr�dko�� wiatru na r�ne jednostki.  
 */

/**
 * Zadanie 3
 * Testy za pomoc� JUnit do zadania 1-2.
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
