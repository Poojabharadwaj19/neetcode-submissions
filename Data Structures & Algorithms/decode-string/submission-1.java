class Solution {
    public String decodeString(String s) {
        Stack<Integer> stacknum =new Stack<>();
        Stack <String> stackch =new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==']'){
                String temp="";
                while(!stackch.peek().equals("[")){
                    temp+=stackch.pop();
                    
                    
                }
                stackch.pop();
                String lala="";
                int tempnum=stacknum.pop();
                for(int j=0;j<tempnum;j++){
                    lala+=temp;
                }
                stackch.push(lala);
                

            }
            else if(ch=='[' ){
                stackch.push(String.valueOf(ch));
            }
            else if(Character.isLetter(ch)){
                stackch.push(String.valueOf(ch));
            }
            else if (Character.isDigit(ch)) {
    int num = 0;

    while (i < s.length() && Character.isDigit(s.charAt(i))) {
        num = num * 10 + (s.charAt(i) - '0');
        i++;
    }

    stacknum.push(num);
    i--; // because the for-loop will increment i
}

        }
        
          String ans = "";
        while (!stackch.isEmpty()) {
            ans += stackch.pop();
        }
        String reversed = new StringBuilder(ans).reverse().toString();
        return reversed;

    }
}