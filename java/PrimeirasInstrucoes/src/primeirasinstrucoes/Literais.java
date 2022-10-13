package primeirasinstrucoes;

public class Literais {

	public static void main(String[] args) {

		byte b = 100;
		short s = 0100;
		int i = 0x100;
		long l = 100L;
		float f = 0.000123f;
		double d = 123d;
		char c1 = '\u0061';
		boolean bo = true;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c1);
		System.out.println(bo);
		System.out.println(((Object)b).getClass().getSimpleName());
	}

}
