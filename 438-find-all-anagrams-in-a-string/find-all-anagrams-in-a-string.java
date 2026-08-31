class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        int []pCount=new int[26];
        int []sCount=new int[26];
        for(int i=0;i<p.length();i++)
        {
            pCount[p.charAt(i) - 'a']++;
        }
        //window ko s se mmove karo 
        for(int i=0;i<s.length();i++)
        {
            //current character ko window mai add kara
             sCount[s.charAt(i) - 'a']++;
             if(i>=p.length())//window p se bada ho gya
             {
                sCount[s.charAt(i - p.length()) - 'a']--;
             }
             if(Arrays.equals(sCount,pCount))//if dono frequency same hai then anagaram 
             {
                ans.add(i-p.length()+1);
             }
        }
        return ans;
    }
}