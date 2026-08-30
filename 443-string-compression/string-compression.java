class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            char ch = chars[i];//current character
            int count = 0;//to count how many  times that character is present 
            while (i < chars.length && chars[i] == ch) {//to count the same consecutive character 
                count++;
                i++;
            }
            chars[index++] = ch;//write the character in the array
            if (count > 1) {//if charcter is repeated
                String num = String.valueOf(count);//convert count to string 
                for (char c : num.toCharArray()) {
                    chars[index++] = c;//apend that sytring in the character array
                }
            }
        }
        return index;
    }
}