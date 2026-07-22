class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        for(int i=0;i<Math.max(word1.length(),word2.length());i++){//loop will run till maximum word length among the given two words
            //check karne ke liye index i exist karta hai ki nai if conditions are used
            if(i<word1.length())
            s = s + word1.charAt(i);
            if(i<word2.length())
            s = s + word2.charAt(i);
        }
       return s; 
    }
}