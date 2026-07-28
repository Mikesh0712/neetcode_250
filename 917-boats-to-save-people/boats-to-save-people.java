class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int count=0;
        while(left<=right)
        {
            //semane jaiparibe ki nai check through limit
            if(people[left]+people[right]<=limit)
            {
                left++;
            }
            //eithi mane heavy person 
            right--;
            count++;
        }
        return count;
    }
}