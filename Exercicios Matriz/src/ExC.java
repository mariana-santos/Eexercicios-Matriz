import java.util.*;
public class ExC {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Random rand = new Random();
		int m[][] = new int [3][4];
		int v[] = new int [3];
		int i, j;
		int soma [] = new int [3];
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 4; j++) {
				if(j < 3) {
				m[i][j] = rand.nextInt(10);
				soma[i] += m[i][j];
				m[i][3] = soma[i];
				}
				if(j == 3) {
					
				}
				
			}
		}
		
		
		for ( i = 0; i <3; i++) {
			for( j = 0; j <4; j++) {
				System.out.print("[ "+m[i][j]+" ]");
				if(j == 3) {
					System.out.print("\n");
				}
			}
		}
	}

}
