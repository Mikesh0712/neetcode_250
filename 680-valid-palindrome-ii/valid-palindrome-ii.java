class Solution {
    public boolean validPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else
            {
                    // Try deleting left character
                    int i = left + 1;
                    int j = right;
                    boolean flag1 = true;

                    while (i < j) {
                        if (s.charAt(i) != s.charAt(j)) {
                            flag1 = false;
                            break;
                        }
                        i++;
                        j--;
                    }

                    // Try deleting right character
                    i = left;
                    j = right - 1;
                    boolean flag2 = true;

                    while (i < j) {
                        if (s.charAt(i) != s.charAt(j)) {
                            flag2 = false;
                            break;
                        }
                        i++;
                        j--;
                    }

                    return flag1 || flag2;
            }
            
        }
        return true;
        
    }
}