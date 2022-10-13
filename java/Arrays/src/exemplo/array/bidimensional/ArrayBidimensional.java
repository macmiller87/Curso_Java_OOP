package exemplo.array.bidimensional;

public class ArrayBidimensional {

	public static void main(String[] args) {

		double notas[][][] = new double[100][4][3];
		
		notas[0][0][0] = 6.5;
		notas[0][1][1] = 7.5;
		notas[0][2][2] = 8.5;
		
		notas[1][0][0] = 4.5;
		notas[1][1][1] = 8.5;
		notas[1][2][2] = 9.5;
		
		notas[99][0][0] = 10.0;
		notas[99][1][1] = 9.8;
		notas[99][2][2] = 6.8;

		System.out.println(notas[0][0][0]);
		System.out.println(notas[0][1][1]);
		System.out.println(notas[0][2][2]);
		System.out.println();

		System.out.println(notas[1][0][0]);
		System.out.println(notas[1][1][1]);
		System.out.println(notas[1][2][2]);
		System.out.println();

		System.out.println(notas[99][0][0]);
		System.out.println(notas[99][1][1]);
		System.out.println(notas[99][2][2]);
		System.out.println();

	}

}
