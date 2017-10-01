package leetcode;

public class SearchA2DMatrix {

public boolean searchMatrix(int[][] matrix, int target) {
	if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
    int row = matrix.length;
    int col = matrix[0].length;
    int low = 0,high = row * col - 1 ;
    while(low<high){
    	int mid = low + (high - low)/2;
    	if(matrix[mid/col][mid%col]<target){
    		low = mid+1;
    	}else{
    		high = mid;
    	}
    }
    return matrix[low/col][low%col] == target ;
    }
}
