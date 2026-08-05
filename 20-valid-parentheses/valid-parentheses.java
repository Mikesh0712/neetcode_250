class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);}
            else
            {
                if(stack.isEmpty())
                return false;
                 char top=stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
    }
}


//for s="(){}[]"
//aga stack re ( pasila after checking in line 6 the seita compare karila next element i.e ) jouta false so else bhitarku gala jouthi check karila kana stack empty if nai then jou bhi character achi taki pop(bahar) kariki top re rakha then check line 13 is true by seeing if current character is ) and jaha pop hela ( hele true yaa phir false (ame not equal lekhichanti so sie top ku not equal check karuchi if true then true else false then back to start i.e. { pasiba and process will run..... ) 