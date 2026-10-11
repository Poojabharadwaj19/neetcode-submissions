class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] result =new int[n];

        for(int i=0;i<n;i++){
            int count=0;
            int j=i+1;
            while( j<n && temperatures[j]<=temperatures[i]  ){
               j++;
                
                

            }
           if(j<n){
            result[i]=j-i;

           }
           else{
            result[i]=0;
           }

        }
        return result;
        
    }
}
