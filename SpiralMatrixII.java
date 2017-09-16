package leecode;

import com.sun.glass.ui.Robot;

public class SpiralMatrixII {
	
public int[][] generateMatrix(int n) {
	  
	int[][] res = new int[n][n];
    if(n==0) return res;
    int count = 1;
    int rowBegin = 0,colBegin=0,rowEnd = n-1,colEnd = n-1;
    while(rowBegin<=rowEnd && colBegin<=colEnd){
    	
    	for(int i=colBegin;i<=colEnd;i++){
    		res[rowBegin][i] = count++;
    		if(count>n*n) return res;
    	}
    	rowBegin++;
    	
    	for(int i=rowBegin;i<=rowEnd;i++){
    		res[i][colEnd] = count++;
    		if(count>n*n) return res;
    	}
    	colEnd--;
    	
    	if(rowBegin<=rowEnd){
    		for(int i=colEnd;i>=colBegin;i--){
        		res[rowEnd][i] = count++;
        		if(count>n*n) return res;
        	}
        	rowEnd--;
    	}
    	
    	if(colBegin<=colEnd){
    		for(int i=rowEnd;i>=rowBegin;i--){
        		res[i][colBegin] = count++;
        		if(count>n*n) return res;
        	}
        	colBegin++;
    	}
    	
    }
    return res;
    }

}
