class Solution {
    private double  helper(long n,double x){
        if(n==0)return 1;
        double half=helper(n/2,x);
        if(n%2==0){
            return half*half;
        }
         return half*half*x;

          


    }
    public double myPow(double x, int n) {
        long N=n;
         if(n<0){
           x=1/x;
           N=-N;
        }
       
        
        
        return helper(N,x);
        
    }
}
