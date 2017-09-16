package leecode;

import java.util.ArrayList;
import java.util.List;

import com.sun.jndi.cosnaming.RemoteToCorba;

public class SpiralMatrix {

public List<Integer> spiralOrder(int[][] matrix) {
	 List<Integer> res = new ArrayList<Integer>();
     if(matrix.length == 0 || matrix[0].length ==0) return res;
  int colBegin = 0,rowBegin = 0,rowEnd = matrix.length-1,colEnd = matrix[0].length-1;
  while(colBegin<=colEnd && rowBegin <= rowEnd){
 	 for(int i=colBegin;i<=colEnd;i++){
 		 res.add(matrix[rowBegin][i]);
 	 }
 	 rowBegin++;
 	 for(int i = rowBegin;i<=rowEnd;i++){
 		 res.add(matrix[i][colEnd]);
 	 }
 	 colEnd--;
 	 if(rowBegin<=rowEnd){
 	 for(int i=colEnd;i>=colBegin;i--){
 		 res.add(matrix[rowEnd][i]);
 	 }
 	 rowEnd--;}
 	 if(colBegin<=colEnd){
 	 for(int i = rowEnd;i>=rowBegin;i--){
 		 res.add(matrix[i][colBegin]);
 	 }
 	 colBegin++;}//放在if里，外都行，反正colbegin都大于colend
  }
  return res;
    }
}
