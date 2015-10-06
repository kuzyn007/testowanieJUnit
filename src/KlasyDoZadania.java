
public class KlasyDoZadania 
{
	// Zadanie 1
	public int[] MergeTab(int[] taba, int[] tabb)
	{
		int[] tabc = new int[taba.length + tabb.length];
		
		for(int i=0; i<taba.length; i++)
		{
			tabc[i] = taba[i];
		}
		
		for(int i=0; i<tabb.length; i++)
		{
			tabc[i+taba.length] = tabb[i];
		}
		return tabc;
	}
}
