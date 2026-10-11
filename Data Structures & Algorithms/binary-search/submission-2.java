class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0)return -1;
        if(nums.length==1){
            if(nums[0]==target)return 0;
            else{
                return -1;
            }
        }
        int n=nums.length;
        int first=0;
        int last=n-1;
       
        while(first<=last){
             int mid=first+(last-first)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                last=mid-1;

            }
            else{
                first=mid+1;
            }
        }
        return -1;
    }
}
