package exercicios_matriz;

public class atrividade1906 {

	public static void main(String[] args) {
		
		char a[][] = {
				{'a', 'b', 'c', 'd'},
				{'e', 'f', 'g', 'h'},
				{'i', 'j', 'k', 'l'},
				{'m', 'n', 'o', 't'},
				};
		
		for(char[]letra:a) {
			for(char coluna: letra) {
				System.out.print(coluna + "\t");
				}
			System.out.println();
			}

	}

}
