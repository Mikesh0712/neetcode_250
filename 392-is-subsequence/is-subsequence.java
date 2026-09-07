class Solution {
    public boolean isSubsequence(String s, String t) {
        int left=0,left1=0;
        while(left<s.length()&&left1<t.length())
        {
            if(s.charAt(left)==t.charAt(left1))//compare 1st letter from s with t if true move s forward else go out of i statement move t forward
            {
                left++;
            }
            left1++;
        }
        return left==s.length();//if the count equals the no of letters in s then true else false
    }
}