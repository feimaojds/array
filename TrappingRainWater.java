package leecode;

public class TrappingRainWater {

	
public int trap(int[] height) {
     int max = 0;
     int leftmax=0,rightmax=0;
     int left=0,right=height.length-1;
     while(left<right){
    	 leftmax = Math.max(leftmax, height[left]);
    	 rightmax = Math.max(rightmax, height[right]);
    	 if(leftmax<rightmax){
    		 max += leftmax - height[left];
    		 left++;
    	 }else{
    		 max += rightmax-height[right];
    		 right--;
    	 }
     }
     return max;
    }
}
