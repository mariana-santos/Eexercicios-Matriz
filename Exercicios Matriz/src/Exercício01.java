import java.util.Scanner;
public class Exercício01 {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int m[][] = new int [4][4];
		int i, j, dob = 2;
		
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				m[i][j] = dob;
				dob *= 2;
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