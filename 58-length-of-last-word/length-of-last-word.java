class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int i=s.length()-1;//traversing the string backwards
        while(s.charAt(i)==' '&&i>=0)//to remove the trailing spaces
        {i--;}
        while(i>=0&&s.charAt(i)!=' ')//to chcek for characters and increase count until found space and then finish
        {
            count++;
            i--;
        }
        return count;
    }
}