class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        return false;

        HashMap<Character,Integer>map=new HashMap<>();
        for (char ch : s1.toCharArray())//store frequency of each element in a hash table 
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i=0;i<=s2.length()-s1.length();i++)//window of s1 length
        {
            HashMap<Character,Integer>temp=new HashMap<>();
            for(int j=i;j<i+s1.length();j++)//frequemcy of current window
            {
                char ch=s2.charAt(j);
                temp.put(ch,temp.getOrDefault(ch,0)+1);
            }
            if(map.equals(temp))
            return true;
        }
        return false;
    }
}