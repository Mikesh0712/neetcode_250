class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        // Jebe tak duita jaka strings ra carry achi 
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            // a ra current bit add karo
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            // b ra current bit add karo
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            // append kar current binary digit
            ans.append(sum % 2);
            // Next carry
            carry = sum / 2;
        }
        // reverse the answer as our answer is ulta 
        return ans.reverse().toString();
    }
}