class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int ans=0;
        int [] last=new int [128];
        while(r<s.length()){
            int len=0;
           char ch=s.charAt(r);
            if(last[ch]>l){
                l=last[ch];

            }

            last[ch] = r + 1;

    ans = Math.max(ans, r - l + 1);
    r++;
        }
        return ans;
        
    }
}
