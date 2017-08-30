package leecode;

import java.util.Arrays;

public class MergeSortedArray {

public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
        	nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

public void merge2(int[] nums1, int m, int[] nums2, int n) {
    int i = m-1,j=n-1,k=m+n-1;
    while(i>=0&&j>=0){
    	nums1[k] = nums1[i]>nums2[j]? nums1[i--]:nums2[j--];
    			k--;
    }
    while(j>=0){
    	nums1[k] = nums2[j];
    	j--;k--;
    }
}
}
