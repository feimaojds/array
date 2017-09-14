package leecode;

public class MaxCitation {
	 public int hIndex(int[] citations) {
		    if(citations.length ==0 ) return 0;
	        int[] count = new int[citations.length+1];
	        for(int i=0;i<citations.length;i++){
	        	if(citations[i]>citations.length){
	        		count[citations.length] ++;
	        	}else{
	        		count[citations[i]] ++;
	        	}
	        }
	        int sum = 0;
	        for(int i=citations.length;i>=0;i--){
	        	sum = sum + count[i];
	        	if(sum>=i){
	        		return i;
	        	}
	        }
	        return 0;
	    }

}
