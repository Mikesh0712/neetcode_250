class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
        //jebe tak 1 mila
        while(n!=1)
        {
            //if aau thare milila ta cycle heigala
            if(set.contains(n))
            return false;
        //number yaad karide
        set.add(n);
        int sum=0;
        //sabu digit ra square add kar
        while(n>0){
            int digit=n%10;
            sum = sum + digit * digit;
             n = n / 10;
        }
        //this is the next number which needs to be done till all the digits squares add to zero
        n=sum;}
        //1 mil gya:)
        return true;
        
    }
}