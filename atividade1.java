package exercicios_matriz;
import java.util.Scanner;
public class atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	int m [][] = new int [3][3];
		
	
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				do {
					m[i][j] = (int)Math.round(Math.random()*100);
				}while(m[i][j] %2!=0);
			}
				
		}
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("Os valores são " + m[i][j]);
			}
		}
		ler.close();

	}

}

