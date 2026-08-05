class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("", 0, 0, n, ans);//empty string,open position ,close position,no of pairs,answer input jiba function ku
        return ans;
    }

    public void solve(String s, int open, int close, int n, List<String> ans) {
        // String complete heigala
        if (s.length() == 2 * n) {//check aribaku ki string ra length no of pairs thu bada na heijau 
            ans.add(s);
            return;
        }
        if (open < n) {//jadi opening position less than n achi then add kara opening bracket and increase opening position to open+1 increase kariki recursion kara 
            solve(s + "(", open + 1, close, n, ans);
        }
        if (close < open) {//closing bracket add kari pariba 
            solve(s + ")", open, close + 1, n, ans);
        }
    }
}