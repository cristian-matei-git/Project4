package package1;

import java.util.HashSet;
import java.util.Random;

public class Servlet implements RNG {
	
	public String printMatrix(int[][] mat, int n) {
		
		String result = "";
		
		for (int i = 0; i < n; i++) { 
			result += "<p style=\"text-align:center;\">";
	        for (int j = 0; j < n; j++) {
	            result += mat[i][j] + " ";
	        }
	        result += "</p>";
	    }
		
		return result;
		
	}

	public int[][] tryAgain(int n) {
		
		int[][] randomMatrix = new int[n][n];
		HashSet<Integer> set = new HashSet<>(9);
		
	    Random rand = new Random(); 
	    int index;
	    
	    for (int i = 0; i < n; i++) {     
	        for (int j = 0; j < n; j++) {
	        	
	        	
	            index = rand.nextInt(9) + 1;

	            while (set.contains(index)){
	            	
	                index = rand.nextInt(9) + 1;
	            }
	            set.add(index);
	            randomMatrix[i][j] = index;
	        }

	    }
	    randomMatrix[2][2] = rand.nextInt(9) + 1;
	    randomMatrix[1][1] = rand.nextInt(9) + 1;
	    return randomMatrix;
		
	}

}
