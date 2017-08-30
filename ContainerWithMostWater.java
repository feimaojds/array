package leecode;

public class ContainerWithMostWater {

	 public int maxArea(int[] height) {
	        int max = 0;
	        for(int i=0;i<height.length-1;i++){
	        	for(int j=i+1;j<height.length;j++){
	        		int square = (j-i)*(Math.min(height[i], height[j]));
	        		if(max<square) max = square;
	        	}
	        }
	        return max;
	    }
	 
	 public int maxArea2(int[] height) {
	        int max = 0;
	        int left = 0,right = height.length-1;
	        while(left<right){
	        	System.out.println(left+" "+right);
	        	max = Math.max(max, (right-left)*(Math.min(height[left], height[right])));
	        	if(height[left]<height[right]){
	        		left++;
	        	}else right++;
	        }
	        return max;
	    }
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
             int[] test = new int[]{1,1};
             System.out.println(new ContainerWithMostWater().maxArea2(test));
		}
}
