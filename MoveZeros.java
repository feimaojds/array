package leecode;

import java.util.ArrayList;
import java.util.List;

public class MoveZeros {

public void moveZeroes(int[] nums) {
	        if(nums.length == 0 || nums == null) return;
	        int insertPos = 0;
	        for(int num:nums){
	            if(num!=0) nums[insertPos++] = num; 
	        }
	        while(insertPos<nums.length){
	            nums[insertPos++] = 0;
	        }
	   
    }
}
