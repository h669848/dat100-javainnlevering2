package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int i =0;i< matrise.length; i++){
			for(int j = 0; j<matrise[i].length; j++){
				System.out.println(matrise[i][j]);
			}
		}
		throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		return matrise.toString();
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		for(int i =0;i< matrise.length; i++){
			for(int j = 0; j<matrise[i].length; j++){
				matrise[i][j]=matrise[i][j]*tall;
			}
		}
		return matrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
