package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for(int i:tabell){ System.out.println(tabell[i]);}
		throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		return tabell.toString();
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for(int i=0;i<=tabell.length; i++){ sum+=tabell[i];}
		//while(tabell.length>0){sum+=tabell[i];}
		//for(int i:tabell){sum+=tabell[i];
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean bool = false;
		for(int i:tabell){if(tabell[i]==tall){bool=true;}};
		return bool;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int index=0;
		for(int i:tabell){if(tabell[i]==tall){index=i;}};
		return index;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] r= new int[tabell.length];
		int j = tabell.length;
		for(int i=0; i<tabell.length; i++){r[i]=tabell[j]; j--;}
		return r;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		for(int i=0;i<tabell.length; i++){if(tabell[i]>tabell[i+1]){sortert =false;}}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] s = new int[tabell1.length + tabell2.length];
		System.arraycopy(tabell1,0,s,tabell1.length, 0);
		System.arraycopy(tabell2,0,s,tabell1.length,tabell2.length);
		return s;
	}
}
