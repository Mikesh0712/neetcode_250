class Solution {
    public int mySqrt(int x) {
        int i=0;
        while((long)i*i<=x){ //check till i*i <=x like example for x=9, i=0 0<=9 i=i++ i.e i=1 then 1<=9 true i=2,4<=9 true, i=3,9<=9,i=4,16<=9 false  return i-1
            i++;
        }
        return i-1;
    }
}