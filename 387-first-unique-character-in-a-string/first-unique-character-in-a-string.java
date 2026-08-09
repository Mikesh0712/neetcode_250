class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)//to store the character frequency of each character in a map
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++)//by using hashmap we checked for the charcter whose frequency count is 1 that is the 1st unique character
        {
            if(map.get(s.charAt(i))==1)
            return i;
        }
       return -1; 
    }
}