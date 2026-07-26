class Solution {
    public String convert(String s, int numRows) {
        // gote row thile seita hi jaha heba 
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];

        // Har row initialize karo
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int currentRow = 0;
        boolean goingDown = true;

        // Har character ko correct row me daalo
        for (int i = 0; i < s.length(); i++) {
            rows[currentRow].append(s.charAt(i));
            // Bottom aa gaya to upar jana hai
            if (currentRow == numRows - 1) {
                goingDown = false;
            }
            // Top aa gaya to niche jana hai
            if (currentRow == 0) {
                goingDown = true;
            }
            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }
        }
        // Sab rows ko jod do
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            ans.append(rows[i]);
        }
        return ans.toString();
    }
}