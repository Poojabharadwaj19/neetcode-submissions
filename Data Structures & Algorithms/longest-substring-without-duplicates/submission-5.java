class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        boolean [] seen=new boolean[128];
        int ans=0;

        while(r<s.length()){
            int len;
            char ch=s.charAt(r);
            while(seen[ch]){
                seen[s.charAt(l)]=false;
                l++;
            }
            seen[ch]=true;
            len=r-l+1;
            ans=Math.max(ans,len);
        
            r++;
        }
        return ans;
    }
}
