class Solution {
    public String longestPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                int left=i,right=j;
                boolean palindrome=true;
                 while(left<right){
                    if(s.charAt(left)!=s.charAt(right))
                     {  
                        palindrome=false;
                        break; 
                    }
                     left++;
                     right--;
                    }
                    if(palindrome&&(j-i+1)>str.length())
                    str=s.substring(i,j+1);
        }  
        }
        return str;
    }
}