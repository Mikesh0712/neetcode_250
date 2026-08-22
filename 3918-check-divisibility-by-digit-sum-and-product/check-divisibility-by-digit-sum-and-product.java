class Solution {
    public boolean checkDivisibility(int n) {
        int temp=0,sum=0,prd=1,n1=n;
        while(n1!=0)
        {
            temp=n1%10;
            sum=sum+temp;
            prd*=temp;
            n1=n1/10;
        }
        if(n%(sum+prd)==0)
        return true;
        
        return false;
    }
}