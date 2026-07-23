class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())//check for length if different never valid anagram
        return false;
        int []a=new int[26];//frequency store karne ke liye array
        for(int i=0;i<s.length();i++)//1st string ra elements ra frequency add kariki store kara 
        a[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();i++)//2nd string ra elements ra frequency minus kariki from sei puruna freq array ru store kara 
        a[t.charAt(i)-'a']--;
        for(int count:a)
        {if(count!=0)//if array re sabu count 0 thile valid nahale invalid
        return false;}
        return true;


        
    }
}