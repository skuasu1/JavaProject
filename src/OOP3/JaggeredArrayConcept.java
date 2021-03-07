package OOP3;

public class JaggeredArrayConcept {
	/*
	 * 
	 * Jaggered arrays are th arrays in which the elements in that array wil vae
	 * diff size
	 */

	public static void main(String[] args) {

		int[][] a = new int[][] { new int[] { 1, 2, 3 }, new int[] { 5, 7, 8, 9 } };
		int count =0;
		
		// initialiizing 2 d array
		// 1 loop for 1 dimension need 2 loops for the2d array
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			a[i][j] = count++;
		}

	}

}
