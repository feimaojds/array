package leecode;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

	
public int longestConsecutive(int[] nums) {
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    int res = 0;
    for(int num:nums){
    	if(map.containsKey(num)) continue;
    	System.out.println(map.get(num-1));
    	System.out.println(map.get(num+1));
    	int left = !map.containsKey(num-1)? 0:map.get(num-1);
    	int right = !map.containsKey(num+1)? 0:map.get(num+1);
    	int sum = left + right +1;
        map.put(num,sum);
    	res = Math.max(res, sum);
    	map.put(num-left, sum);
    	map.put(num+right, sum);
    }
    return res;
    }
}
