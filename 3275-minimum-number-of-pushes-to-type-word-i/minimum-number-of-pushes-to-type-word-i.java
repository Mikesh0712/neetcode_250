class Solution {
    public int minimumPushes(String word) {

        int ans = 0;
        int push = 1;

        for (int i = 0; i < word.length(); i++) {

            if (i > 0 && i % 8 == 0)
                push++;

            ans += push;
        }

        return ans;
    }
}