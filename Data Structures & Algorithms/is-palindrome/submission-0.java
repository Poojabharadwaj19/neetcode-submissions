class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        int n=s1.length();
       int i=0;
        int j=n-1;
        while(i<=j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
