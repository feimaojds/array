package leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        List<Integer>[] freTable = new ArrayList[nums.length+1];
        for(int i:map.keySet()){
        	int n = map.get(i);
        	if(freTable[n]==null) {
        		freTable[n] = new ArrayList<Integer>();
        				freTable[n].add(i);
        	}
        	else freTable[n].add(i);
        }
        List<Integer> res = new ArrayList<Integer>();
        for(int i = freTable.length-1;i>=0;i--){
        	if(res.size() == k) break;
        	if(freTable[i]!=null) res.addAll(freTable[i]);
        	if(res.size() == k) break;
        }
        return res;
        
    }
}

