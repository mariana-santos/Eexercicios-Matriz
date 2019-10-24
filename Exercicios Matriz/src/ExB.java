import java.util.Random;
import java.util.Scanner;
public class ExB {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		Random random = new Random();
		int m[] [] = new int [3] [3];
		int i, j;
		
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				m[i] [j] = random.nextInt(10);
			}
		}
		
		for (i = 0; i <3; i++) {
			for(j = 0; j <3; j++) {
				System.out.print("[ "+m[i][j]+" ]");
				if(j == 2 ) {
					System.out.print("\n");
				}
			}
		}
		
		int maior = m[0][0];
		int menor = m[0][0];
		int linham = 0;
		int colunam = 0;
		int linha = 0;
		int coluna = 0;
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				if (m[i] [j] > maior) {
					maior = m[i] [j];
					linha = i;
					coluna = j;
				}else if (m [i][j] < menor){
					menor = m[i] [j];
					linham = i;
					colunam = j;
				}
				
				
			} 
		}
		System.out.println(" ");
		System.out.println("Maior número: "+maior +" Linha: "+linha+" Coluna: "+coluna);
		System.out.println("Menor número: "+menor+" Linha: "+linham+" Coluna: "+colunam);
			
		
	}

}