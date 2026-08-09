class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>map=new HashMap<>();
        HashSet<Character>used=new HashSet<>();

        if(s.length()!=t.length())//jadi same length nai hele kebe isomorphic heiparibeni 
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map.containsKey(ch1))//already ch1 mapped
            {
                if(map.get(ch1)!=ch2)//existing mapping different
                return false;
            }
            else
            {
                if(used.contains(ch2))//ch2 already mapped with another character
                return false;

                map.put(ch1,ch2);
                used.add(ch2);
            }
        }
       return true; 
    }
}