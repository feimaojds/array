package leecode;

import java.util.ArrayList;
import java.util.List;

public class ReshapeMatrix {

	
public int[][] matrixReshape(int[][] nums, int r, int c) {
         
	   int[][] result = new int[r][c];
	   int row = nums.length,col = nums[0].length;
	   
	   if(row*col!=r*c) return nums;
	 
	   for(int i=0;i<row*col;i++){
		   result[i/c][i%c] = nums[i/col][i%col];
	   }
	   return result;
         
    }
}
