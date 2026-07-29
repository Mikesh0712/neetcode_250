class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        // Jab tak dono strings ya carry bacha hai
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            // a ka current bit add karo
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            // b ka current bit add karo
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            // Current binary digit
            ans.append(sum % 2);
            // Next carry
            carry = sum / 2;
        }
        // Reverse because humne answer ulta banaya
        return ans.reverse().toString();
    }
}