import java.util.Scanner;
public class Exercício01 {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int m[][] = new int [4][4];
		m[0][0] = 2;
		for (int i = 1; i < 4; i++) {
			
			for(int j = 1; j < 4;) {
				if ( i < 4) {
				m[i][j] = (m[i - 1] [j - 1] ) * 2 ;
				}else {
					j++;
				}
			}
		}
		
		for (int i = 0; i <4; i++) {
			for(int j = 0; j <4; j++) {
				System.out.print("[ "+m[i][j]+" ]");
				if(j == 3 ) {
					System.out.print("\n");
				}
			}
		}
		
		
		
	}

}
